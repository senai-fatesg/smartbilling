package br.com.pid.smartbilling.daoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
					if (rsm.getColumnClassName(i).equals("java.lang.Long")) {
						mapa.put(name, rs.getLong(name));
					}
					if (rsm.getColumnClassName(i).equals("java.lang.Float")) {
						mapa.put(name, rs.getFloat(name));
					}
					if (rsm.getColumnClassName(i).equals("java.lang.Double")) {
						mapa.put(name, rs.getDouble(name));
					}
					if (rsm.getColumnClassName(i).equals("java.lang.Boolean")) {
						mapa.put(name, rs.getBoolean(name));
					}
					if (rsm.getColumnClassName(i).equals("java.util.Date")) {
						mapa.put(name, rs.getDate(name));
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
			}catch(Exception e){
				e.getMessage();
			}
		}
		return listaMapas;

	}
	
	public List<PerfilConsumo> listarDadosConsumo(){
		List<PerfilConsumo> dados = new ArrayList<>();
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try{
			String sql = "";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.5.2.24:1521:XE", "root", "123456");
			preparedStatement = con.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				
				PerfilConsumo perfilConsumo = new PerfilConsumo();
				
				perfilConsumo.setMedidor(rs.getString(1));                      
				perfilConsumo.setMesano(rs.getString(2));                       
				perfilConsumo.setLeitura(rs.getString(3));                      
				perfilConsumo.setTipo_leitura(rs.getString(4));                 
				perfilConsumo.setKwh(rs.getString(5));                          
				perfilConsumo.setFuncao(rs.getString(6));                       
				perfilConsumo.setFm(rs.getString(7));                           
				perfilConsumo.setDias_fat(rs.getInt(8));                     
				perfilConsumo.setDt_leitura(rs.getString(9));                   
				perfilConsumo.setR$(rs.getString(10));                           
				perfilConsumo.setOrigem(rs.getString(11));                       
				perfilConsumo.setDt_apresentacao(rs.getString(12));            
				perfilConsumo.setConsumidor(rs.getString(13));                   
				perfilConsumo.setDivisa(rs.getString(14));
				perfilConsumo.setId(rs.getInt(15));                           
				perfilConsumo.setInput_type_id(rs.getInt(16));                
				perfilConsumo.setClassification(rs.getString(17));               
				perfilConsumo.setDescription(rs.getString(18));                  
				perfilConsumo.setPrevious_reading(rs.getString(19));             
				perfilConsumo.setCurrent_reading(rs.getString(20));              
				perfilConsumo.setDifference_reading(rs.getString(21));           
				perfilConsumo.setMultiplication_factor(rs.getString(22));        
				perfilConsumo.setAmount(rs.getString(23));                       
				perfilConsumo.setFk_invvw_id(rs.getInt(24));                  
				perfilConsumo.setDivisa_1(rs.getString(25));                     
				perfilConsumo.setId_1(rs.getInt(26));                         
				perfilConsumo.setFk_invce_id(rs.getLong(27));                  
				perfilConsumo.setFk_invvw_id_1(rs.getString(28));                
				perfilConsumo.setComp_code(rs.getInt(29));                    
				perfilConsumo.setComp_corporate_name(rs.getString(30));          
				perfilConsumo.setComp_name(rs.getString(31));                    
				perfilConsumo.setCusco_nrc(rs.getInt(32));                    
				perfilConsumo.setCust_name(rs.getString(33));                    
				perfilConsumo.setCust_person_type(rs.getString(34));             
				perfilConsumo.setDoctp_name_main(rs.getString(35));              
				perfilConsumo.setDocid_document_number_main(rs.getLong(36));   
				perfilConsumo.setDoctp_name_aux(rs.getString(37));               
				perfilConsumo.setDocid_document_number_aux(rs.getInt(38));    
				perfilConsumo.setDue_string(rs.getString(39));                     
				perfilConsumo.setCompetency_year(rs.getInt(40));              
				perfilConsumo.setCompetency_month(rs.getInt(41));             
				perfilConsumo.setCharge(rs.getString(42));                       
				perfilConsumo.setPresentation_string(rs.getString(43));            
				perfilConsumo.setBar_code(rs.getString(44));                     
				perfilConsumo.setNumeric_bar_code(rs.getString(45));             
				perfilConsumo.setType_desc(rs.getString(46));                    
				perfilConsumo.setType(rs.getInt(47));                         
				perfilConsumo.setExternal_identification(rs.getString(48));      
				perfilConsumo.setGroup_code_invoice(rs.getString(49));           
				perfilConsumo.setIdentification(rs.getLong(50));               
				perfilConsumo.setCntuc_identifier(rs.getLong(51));             
				perfilConsumo.setIndication_address(rs.getString(52));           
				perfilConsumo.setGroup_code(rs.getInt(53));                   
				perfilConsumo.setAccnt_identification(rs.getInt(54));         
				perfilConsumo.setRoute_code(rs.getInt(55));                   
				perfilConsumo.setScript_number(rs.getInt(56));                
				perfilConsumo.setPrevious_reading_string(rs.getString(57));        
				perfilConsumo.setCurrent_reading_string(rs.getString(58));         
				perfilConsumo.setCntrv_description_link(rs.getString(59));       
				perfilConsumo.setInvpm_bank_ext_identificatioN(rs.getString(60));
				perfilConsumo.setInvpm_agency(rs.getString(61));                 
				perfilConsumo.setInvpm_bank_account(rs.getString(62));           
				perfilConsumo.setCntrv_code_activity(rs.getString(63));          
				perfilConsumo.setCntrv_description_activity(rs.getString(64));   
				perfilConsumo.setInstalled_meter(rs.getString(65));              
				perfilConsumo.setNext_reading_string(rs.getString(66));            
				perfilConsumo.setLoss_tax(rs.getString(67));                     
				perfilConsumo.setSupply_days(rs.getInt(68));                  
				perfilConsumo.setDaily_consumption_average(rs.getString(69));    
				perfilConsumo.setMonthly_consumption_average(rs.getString(70));  
				perfilConsumo.setHash_code(rs.getString(71));                    
				perfilConsumo.setLocal(rs.getString(72));                        
				perfilConsumo.setInvci_dic_goal(rs.getString(73));               
				perfilConsumo.setInvci_fic_goal(rs.getString(74));               
				perfilConsumo.setInvci_dmic_goal(rs.getString(75));              
				perfilConsumo.setInvci_dic_index(rs.getString(76));              
				perfilConsumo.setInvci_dmic_index(rs.getString(77));             
				perfilConsumo.setInvci_continuity_set(rs.getString(78));         
				perfilConsumo.setInvci_dec_goal(rs.getString(79));               
				perfilConsumo.setInvci_fec_goal(rs.getString(80));               
				perfilConsumo.setInvci_fec_index(rs.getString(81));              
				perfilConsumo.setInvci_dec_index(rs.getString(82));              
				perfilConsumo.setInvoice_quantity(rs.getString(83));             
				perfilConsumo.setModality(rs.getString(84));                     
				perfilConsumo.setSupplyvoltage(rs.getInt(85));                
				perfilConsumo.setMeasurementvoltage(rs.getString(86));           
				perfilConsumo.setRegional(rs.getString(87));                     
				perfilConsumo.setTotal_parcel(rs.getString(88));                 
				perfilConsumo.setParcel_number(rs.getString(89));                
				perfilConsumo.setPay_mode(rs.getInt(90));                     
				perfilConsumo.setFk_addvw_id_col(rs.getInt(91));              
				perfilConsumo.setFk_addvw_id_ins(rs.getInt(92));              
				perfilConsumo.setFk_grinv_id(rs.getInt(93));                  
				perfilConsumo.setExternal_sequential(rs.getInt(94));          
				perfilConsumo.setGeneration_string(rs.getString(95));            
				perfilConsumo.setEmission_string(rs.getString(96));               
				perfilConsumo.setBordero_identification(rs.getString(97));       
				perfilConsumo.setWeather_period(rs.getString(98));               
				perfilConsumo.setTransformation_const(rs.getString(99));         
				perfilConsumo.setInstalled_meter_reactive(rs.getString(100));     
				perfilConsumo.setInstalled_meter_electronic(rs.getString(101));   
				perfilConsumo.setUse_parcel(rs.getString(102));                   
				perfilConsumo.setSupply_parcel(rs.getString(103));                
				perfilConsumo.setTariff_structure(rs.getString(104));             
				perfilConsumo.setYearly_consumption_average(rs.getString(105));   
				perfilConsumo.setGroup_voltage(rs.getString(106));                
				perfilConsumo.setFiscal_number_serial(rs.getInt(107));         
				perfilConsumo.setFiscal_number_sequential(rs.getInt(108));     
				perfilConsumo.setAdadd_formatted_address(rs.getString(109));      
				perfilConsumo.setConference(rs.getInt(110));                   
				perfilConsumo.setTotal_consumption(rs.getString(111));            
				perfilConsumo.setClass_code(rs.getInt(112));                   
				perfilConsumo.setClass_description(rs.getString(113));            
				perfilConsumo.setSub_class_code(rs.getInt(114));               
				perfilConsumo.setSub_class_description(rs.getString(115));        
				perfilConsumo.setSub_class_detailing_code(rs.getString(116));     
				perfilConsumo.setSub_class_detailing_desc(rs.getString(117));     
				perfilConsumo.setCntuc_formatted_address(rs.getString(118));      
				perfilConsumo.setSub_group_code(rs.getString(119));               
				perfilConsumo.setSub_group_description(rs.getString(120));        
				perfilConsumo.setWeather_period_code(rs.getInt(121));          
				perfilConsumo.setMeasurement_modality_desc(rs.getString(122));    
				perfilConsumo.setFk_cntrv_id_measurement_mod(rs.getInt(123));  
				perfilConsumo.setFk_iwust_id_base(rs.getInt(124));             
				perfilConsumo.setFk_iwust_id_agency_polar(rs.getInt(125));     
				perfilConsumo.setIndication_agency_attendance(rs.getString(126)); 
				perfilConsumo.setBase_due_string(rs.getString(127));               
				perfilConsumo.setInvci_fic_index(rs.getInt(128));              
				perfilConsumo.setInvoicing_condition(rs.getString(129));          
				perfilConsumo.setFk_iwrcr_id(rs.getString(130));                  
				perfilConsumo.setLow_income(rs.getString(131));                   
				perfilConsumo.setInvci_dic_trimestral_goal(rs.getString(132));    
				perfilConsumo.setInvci_dic_annual_goal(rs.getString(133));        
				perfilConsumo.setInvci_fic_trimestral_goal(rs.getString(134));    
				perfilConsumo.setInvci_fic_annual_goal(rs.getString(135));        
				perfilConsumo.setInvci_dic_trimestral_index(rs.getString(136));   
				perfilConsumo.setInvci_dic_annual_index(rs.getString(137));       
				perfilConsumo.setInvci_fic_trimestral_index(rs.getString(138));   
				perfilConsumo.setInvci_fic_annual_index(rs.getString(139));       
				perfilConsumo.setAverage_cost_monthly(rs.getString(140));         
				perfilConsumo.setAverage_cost_trimestral(rs.getString(141));      
				perfilConsumo.setAverage_cost_annual(rs.getString(142));          
				perfilConsumo.setRef_month_index(rs.getInt(143));              
				perfilConsumo.setRef_year_index(rs.getInt(144));               
				perfilConsumo.setValue_tust(rs.getString(145));                   
				perfilConsumo.setSector_fee(rs.getString(146));                   
				perfilConsumo.setFiscal_number_ref_month(rs.getInt(147));      
				perfilConsumo.setFiscal_number_ref_year(rs.getInt(148));       
				perfilConsumo.setGenerated_by_printcenter(rs.getInt(149));     
				perfilConsumo.setResend_invoice(rs.getInt(150));               
				perfilConsumo.setFile_name(rs.getString(151));                    
				perfilConsumo.setInvci_dicri_goal(rs.getString(152));             
				perfilConsumo.setInvci_dicri_index(rs.getString(153));            
				perfilConsumo.setPfc_start_string(rs.getString(154));               
				perfilConsumo.setBraille_invoice(rs.getInt(155));              
				perfilConsumo.setIndication_federal_governmenT(rs.getString(156));
				perfilConsumo.setFk_iwrgd_id(rs.getString(157));                  
				perfilConsumo.setTotal_gross_value_cofins(rs.getInt(158));     
				perfilConsumo.setTotal_gross_value_pis(rs.getInt(159));        
				perfilConsumo.setTotal_gross_value_irrf(rs.getInt(160));       
				perfilConsumo.setTotal_gross_valUE_CSLL(rs.getInt(161));
				
				dados.add(perfilConsumo);

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

}
