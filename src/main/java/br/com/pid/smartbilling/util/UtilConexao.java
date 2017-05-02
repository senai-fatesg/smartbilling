package br.com.pid.smartbilling.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilConexao {

	public void conexao(){

		//		Connection con = null;
		//		Statement stmt = null;
		//		ResultSet rs = null;
		//		String sql = "select * from municipio";
		//		try{
		//			Class.forName("oracle.jdbc.driver.OracleDriver");
		//			con = DriverManager.getConnection("jdbc:oracle:thin:root/123456@10.5.2.24:1521:smartbilling");
		//			stmt = con.createStatement();
		//			rs = stmt.executeQuery(sql);
		//			while(rs.next()){
		//				System.out.println(rs.getString(1) + "\t");
		//				System.out.println(rs.getString(2));
		//			}
		//		}catch (SQLException e) {
		//			e.printStackTrace();
		//		}catch (ClassNotFoundException e) {
		//			e.printStackTrace();
		//		} finally {
		//			try {
		//				rs.close();
		//				stmt.close();
		//				con.close();
		//			}catch(SQLException e){
		//				e.printStackTrace();
		//			}
		//		}

	}
	private Connection ObterConexao() {

		Connection conexao = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@10.5.2.24:1521:XE", "root", "123456");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conexao;

	}



}
