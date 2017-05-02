package br.com.pid.smartbilling.daoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.pid.smartbilling.model.PerfilConsumo;
import br.com.pid.smartbilling.util.UtilConexao;

public class PerfilConsumoDaoJdbc{

	UtilConexao connection = new UtilConexao();

	public List<PerfilConsumo> listarDados() {

		List<PerfilConsumo> dados = new ArrayList<>();
		String sql = "select * municipio";
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.5.2.24:1521:XE", "root", "123456");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(con!=null)
					con.close();
			}catch(Exception e){}
		}
		return dados;
	}

	public void save(PerfilConsumo perfilConsumo)throws Exception{

		//String sql = "insert into perfilConsumo () values("+empNo+", '"+name+"',"+sal+","+dNo+")";
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.5.2.24:1521:XE", "root", "123456");
			Statement st = con.createStatement();
			//st.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(con!=null)
					con.close();
			}catch(Exception e){}
		}
	}

	public List<Map<String, Object>> consultarPersonalizado(String sql){

		Map<String, Object> mapa = new HashMap<String, Object>();
		List<Map<String, Object>> listaMapas = new ArrayList<Map<String,Object>>();
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.5.2.24:1521:XE", "root", "123456");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			ResultSetMetaData rsm = rs.getMetaData();
			while (rs.next()) {
				mapa = new HashMap<String, Object>();
				for (int i = 1; i <= rsm.getColumnCount(); i++){
					String name = rsm.getColumnName(i);
					if (rsm.getColumnClassName(i).equals("java.lang.String")) {
						mapa.put(name, rs.getString(name));
					}
					if (rsm.getColumnClassName(i).equals("java.lang.Integer")) {
						mapa.put(name, rs.getInt(name));
					}
					if (rsm.getColumnClassName(i).equals("java.util.Date")) {
						mapa.put(name, rs.getDate(name));
					}
					if (rsm.getColumnClassName(i).equals("java.lang.Long")) {
						mapa.put(name, rs.getLong(name));
					}
					if (rsm.getColumnClassName(i).equals("java.math.BigDecimal")) {
						mapa.put(name, rs.getLong(name));
					}
					
				}
				listaMapas.add(mapa);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(con!=null)
					con.close();
			}catch(Exception e){}
		}
		return listaMapas;

	}
	
	public List<PerfilConsumo> listarDadosConsumo(){
		return null;
	}

}
