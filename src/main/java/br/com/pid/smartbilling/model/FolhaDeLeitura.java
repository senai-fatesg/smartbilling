package br.com.pid.smartbilling.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FolhaDeLeitura {
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private String medidor;
	private String mesano;
	private Date leitura;
	private String tipo_leitura;
	private String kwh;
	private String funcao;
	private String fm;
	private Integer dias_fat;
	private Date dt_leitura;
	private String r$;
	private String origem;
	private Date dt_apresentacao;
	private String consumidor;
	private String divisa;
	private Integer uc;
	private Integer input_type_id;
	private Date classification;
	private String description;
	private Date previous_reading;
	private Date current_reading;
	private Date difference_reading;
	private String multiplication_factor;
	private String amount;
	private Integer fk_invvw_id;
	private String divisa_1;
	private Integer id_1;
	private Long fk_invce_id;
	private Long fk_ivvvw_id_1;
	private Integer comp_code;
	private String comp_corporate_name;
	private String comp_name;
	private Integer cusco_nrc;
	private String cust_name;
	private String cust_person_type;
	private String doctp_name_main;
	private Long docid_document_number_main;
	private String doctp_name_aux;
	private Integer docid_document_number_aux;
	private Date due_date;
	private Integer competency_year;
	private Integer competency_month;
	private String charge;
	private Date presentation_date;
	private String bar_code;
	private String numeric_bar_code;
	private String type_desc;
	private Integer type;
	private Long external_identification;
	private Integer group_code_invoice;
	private Long identification;
	private Long cntuc_identifier;
	private String indication_adress;
	private Integer group_code;
	private Integer accnt_identification;
	private Integer route_code;
	private Integer script_number;
	private Date previous_reading_date;
	private Date current_reading_date;
	private String cntrv_description_ling;
	private String invpm_bank_ext_identification;
	private String invpm_agency;
	private String invpm_bank_account;
	private String cntrb_code_activity;
	private String cntrb_description_activity;
	private String installed_meter;
	private Date next_reading_date;
	private String loss_tax;
	private Integer supply_days;
	private String daily_consumption_average;
	private String monthly_consumption_average;
	private String hasg_code;
	private String local;
	private String invci_dic_goal;
	private String invci_fic_goal;
	private String invci_dmci_goal;
	private String invci_dic_index;
	private String invci_dmci_index;
	private String invci_continuity_set;
	private String invci_DEC_GOAL;
	private String invci_FEC_GOAL;
	private String invci_FEC_INDEX;
	private String invci_DEC_INDEX;
	private String invoice_QUANTITY;
	private String modality;
	private Integer supplyvoltage;
	
	private String measurementvoltage;
	private String regional;
	private String total_parcel;
	private String parcel_number;
	private Integer pay_mode;
	private Integer fk_addvw_id_col;
	private Integer fk_addvw_id_ins;
	private Integer fk_grinv_id;
	private Integer external_sequential;
	private Date generation_date;
	private Date emission_date;
	private Date bordero_identification;
	private String weather_period;
	private Date transformation_const;
	private String installed_meter_reactive;
	private String installed_meter_electronic;
	private String use_parcel;
	private String supply_parcel;
	private String tariff_structure;
	private String yearly_consumption_average;
	private String group_voltage;
	private Integer fisical_number_serial;
	private Integer fisical_number_sequential;
	private String adadd_formatted_address;
	private Integer conference;
	private String total_consumption;
	private Integer class_code;
	private String class_description;
	private Integer sub_class_code;
	private String sub_class_description;
	private Date sub_class_detailing_code;
	private String sub_class_detailing_desc;
	private String cntuc_formatted_address;
	private String sub_group_code;
	private String sub_group_description;
	private Integer weather_period_code;
	private String measurement_modality_desc;
	private Integer fk_cntrv_id_measurement_mod;
	private Integer fk_iwust_id_base;
	private Integer fk_iwust_id_agency_polar;
	private String indication_agency_attendance;
	private Date base_due_date;
	private Integer invci_fic_index;
	private String invoicing_condition;
	private String fk_iwrcr_id;
	private String low_income;
	private String invci_dic_trimestral_goal;
	private String invci_dic_annual_goal;
	private String invci_fic_trimestral_goal;
	private String invci_fic_annual_goal;
	private String invci_dic_trimestral_index;
	private String invci_dic_annual_index;
	private Date invci_fic_trimestral_index;
	private Date invci_fic_annual_index;
	private String average_cost_monthly;
	private String average_cost_trimestral;
	private String average_cost_annual;
	private Integer ref_month_index;
	private Integer ref_year_index;
	private String value_tust;
	private String sector_fee;
	private Integer fiscal_number_ref_month;
	private Integer fiscal_number_ref_year;
	private Integer generated_by_printcenter;
	private Integer resend_invoice;
	private String file_name;
	private String invci_dicri_goal;
	private String invci_dicri_index;
	private Date pfc_start_date;
	private Integer braille_invoice;
	private String indication_federal_government;
	private String fk_iwrgd_id;
	private Date total_gross_value_confins;
	private Date total_gross_value_pis;
	private Date total_gross_value_irrf;
	private Date total_gross_value_csll;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMedidor() {
		return medidor;
	}
	public void setMedidor(String medidor) {
		this.medidor = medidor;
	}
	public String getMesano() {
		return mesano;
	}
	public void setMesano(String mesano) {
		this.mesano = mesano;
	}
	public Date getLeitura() {
		return leitura;
	}
	public void setLeitura(Date leitura) {
		this.leitura = leitura;
	}
	public String getTipo_leitura() {
		return tipo_leitura;
	}
	public void setTipo_leitura(String tipo_leitura) {
		this.tipo_leitura = tipo_leitura;
	}
	public String getKwh() {
		return kwh;
	}
	public void setKwh(String kwh) {
		this.kwh = kwh;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getFm() {
		return fm;
	}
	public void setFm(String fm) {
		this.fm = fm;
	}
	public Integer getDias_fat() {
		return dias_fat;
	}
	public void setDias_fat(Integer dias_fat) {
		this.dias_fat = dias_fat;
	}
	public Date getDt_leitura() {
		return dt_leitura;
	}
	public void setDt_leitura(Date dt_leitura) {
		this.dt_leitura = dt_leitura;
	}
	public String getR$() {
		return r$;
	}
	public void setR$(String r$) {
		this.r$ = r$;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public Date getDt_apresentacao() {
		return dt_apresentacao;
	}
	public void setDt_apresentacao(Date dt_apresentacao) {
		this.dt_apresentacao = dt_apresentacao;
	}
	public String getConsumidor() {
		return consumidor;
	}
	public void setConsumidor(String consumidor) {
		this.consumidor = consumidor;
	}
	public String getDivisa() {
		return divisa;
	}
	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	public Integer getUc() {
		return uc;
	}
	public void setId(Integer uc) {
		this.uc = uc;
	}
	public Integer getInput_type_id() {
		return input_type_id;
	}
	public void setInput_type_id(Integer input_type_id) {
		this.input_type_id = input_type_id;
	}
	public Date getClassification() {
		return classification;
	}
	public void setClassification(Date classification) {
		this.classification = classification;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPrevious_reading() {
		return previous_reading;
	}
	public void setPrevious_reading(Date previous_reading) {
		this.previous_reading = previous_reading;
	}
	public Date getCurrent_reading() {
		return current_reading;
	}
	public void setCurrent_reading(Date current_reading) {
		this.current_reading = current_reading;
	}
	public Date getDifference_reading() {
		return difference_reading;
	}
	public void setDifference_reading(Date difference_reading) {
		this.difference_reading = difference_reading;
	}
	public String getMultiplication_factor() {
		return multiplication_factor;
	}
	public void setMultiplication_factor(String multiplication_factor) {
		this.multiplication_factor = multiplication_factor;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Integer getFk_invvw_id() {
		return fk_invvw_id;
	}
	public void setFk_invvw_id(Integer fk_invvw_id) {
		this.fk_invvw_id = fk_invvw_id;
	}
	public String getDivisa_1() {
		return divisa_1;
	}
	public void setDivisa_1(String divisa_1) {
		this.divisa_1 = divisa_1;
	}
	public Integer getId_1() {
		return id_1;
	}
	public void setId_1(Integer id_1) {
		this.id_1 = id_1;
	}
	public Long getFk_invce_id() {
		return fk_invce_id;
	}
	public void setFk_invce_id(Long fk_invce_id) {
		this.fk_invce_id = fk_invce_id;
	}
	public Long getFk_ivvvw_id_1() {
		return fk_ivvvw_id_1;
	}
	public void setFk_ivvvw_id_1(Long fk_ivvvw_id_1) {
		this.fk_ivvvw_id_1 = fk_ivvvw_id_1;
	}
	public Integer getComp_code() {
		return comp_code;
	}
	public void setComp_code(Integer comp_code) {
		this.comp_code = comp_code;
	}
	public String getComp_corporate_name() {
		return comp_corporate_name;
	}
	public void setComp_corporate_name(String comp_corporate_name) {
		this.comp_corporate_name = comp_corporate_name;
	}
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	public Integer getCusco_nrc() {
		return cusco_nrc;
	}
	public void setCusco_nrc(Integer cusco_nrc) {
		this.cusco_nrc = cusco_nrc;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_person_type() {
		return cust_person_type;
	}
	public void setCust_person_type(String cust_person_type) {
		this.cust_person_type = cust_person_type;
	}
	public String getDoctp_name_main() {
		return doctp_name_main;
	}
	public void setDoctp_name_main(String doctp_name_main) {
		this.doctp_name_main = doctp_name_main;
	}
	public Long getDocid_document_number_main() {
		return docid_document_number_main;
	}
	public void setDocid_document_number_main(Long docid_document_number_main) {
		this.docid_document_number_main = docid_document_number_main;
	}
	public String getDoctp_name_aux() {
		return doctp_name_aux;
	}
	public void setDoctp_name_aux(String doctp_name_aux) {
		this.doctp_name_aux = doctp_name_aux;
	}
	public Integer getDocid_document_number_aux() {
		return docid_document_number_aux;
	}
	public void setDocid_document_number_aux(Integer docid_document_number_aux) {
		this.docid_document_number_aux = docid_document_number_aux;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public Integer getCompetency_year() {
		return competency_year;
	}
	public void setCompetency_year(Integer competency_year) {
		this.competency_year = competency_year;
	}
	public Integer getCompetency_month() {
		return competency_month;
	}
	public void setCompetency_month(Integer competency_month) {
		this.competency_month = competency_month;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public Date getPresentation_date() {
		return presentation_date;
	}
	public void setPresentation_date(Date presentation_date) {
		this.presentation_date = presentation_date;
	}
	public String getBar_code() {
		return bar_code;
	}
	public void setBar_code(String bar_code) {
		this.bar_code = bar_code;
	}
	public String getNumeric_bar_code() {
		return numeric_bar_code;
	}
	public void setNumeric_bar_code(String numeric_bar_code) {
		this.numeric_bar_code = numeric_bar_code;
	}
	public String getType_desc() {
		return type_desc;
	}
	public void setType_desc(String type_desc) {
		this.type_desc = type_desc;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Long getExternal_identification() {
		return external_identification;
	}
	public void setExternal_identification(Long external_identification) {
		this.external_identification = external_identification;
	}
	public Integer getGroup_code_invoice() {
		return group_code_invoice;
	}
	public void setGroup_code_invoice(Integer group_code_invoice) {
		this.group_code_invoice = group_code_invoice;
	}
	public Long getIdentification() {
		return identification;
	}
	public void setIdentification(Long identification) {
		this.identification = identification;
	}
	public Long getCntuc_identifier() {
		return cntuc_identifier;
	}
	public void setCntuc_identifier(Long cntuc_identifier) {
		this.cntuc_identifier = cntuc_identifier;
	}
	public String getIndication_adress() {
		return indication_adress;
	}
	public void setIndication_adress(String indication_adress) {
		this.indication_adress = indication_adress;
	}
	public Integer getGroup_code() {
		return group_code;
	}
	public void setGroup_code(Integer group_code) {
		this.group_code = group_code;
	}
	public Integer getAccnt_identification() {
		return accnt_identification;
	}
	public void setAccnt_identification(Integer accnt_identification) {
		this.accnt_identification = accnt_identification;
	}
	public Integer getRoute_code() {
		return route_code;
	}
	public void setRoute_code(Integer route_code) {
		this.route_code = route_code;
	}
	public Integer getScript_number() {
		return script_number;
	}
	public void setScript_number(Integer script_number) {
		this.script_number = script_number;
	}
	public Date getPrevious_reading_date() {
		return previous_reading_date;
	}
	public void setPrevious_reading_date(Date previous_reading_date) {
		this.previous_reading_date = previous_reading_date;
	}
	public Date getCurrent_reading_date() {
		return current_reading_date;
	}
	public void setCurrent_reading_date(Date current_reading_date) {
		this.current_reading_date = current_reading_date;
	}
	public String getCntrv_description_ling() {
		return cntrv_description_ling;
	}
	public void setCntrv_description_ling(String cntrv_description_ling) {
		this.cntrv_description_ling = cntrv_description_ling;
	}
	public String getInvpm_bank_ext_identification() {
		return invpm_bank_ext_identification;
	}
	public void setInvpm_bank_ext_identification(String invpm_bank_ext_identification) {
		this.invpm_bank_ext_identification = invpm_bank_ext_identification;
	}
	public String getInvpm_agency() {
		return invpm_agency;
	}
	public void setInvpm_agency(String invpm_agency) {
		this.invpm_agency = invpm_agency;
	}
	public String getInvpm_bank_account() {
		return invpm_bank_account;
	}
	public void setInvpm_bank_account(String invpm_bank_account) {
		this.invpm_bank_account = invpm_bank_account;
	}
	public String getCntrb_code_activity() {
		return cntrb_code_activity;
	}
	public void setCntrb_code_activity(String cntrb_code_activity) {
		this.cntrb_code_activity = cntrb_code_activity;
	}
	public String getCntrb_description_activity() {
		return cntrb_description_activity;
	}
	public void setCntrb_description_activity(String cntrb_description_activity) {
		this.cntrb_description_activity = cntrb_description_activity;
	}
	public String getInstalled_meter() {
		return installed_meter;
	}
	public void setInstalled_meter(String installed_meter) {
		this.installed_meter = installed_meter;
	}
	public Date getNext_reading_date() {
		return next_reading_date;
	}
	public void setNext_reading_date(Date next_reading_date) {
		this.next_reading_date = next_reading_date;
	}
	public String getLoss_tax() {
		return loss_tax;
	}
	public void setLoss_tax(String loss_tax) {
		this.loss_tax = loss_tax;
	}
	public Integer getSupply_days() {
		return supply_days;
	}
	public void setSupply_days(Integer supply_days) {
		this.supply_days = supply_days;
	}
	public String getDaily_consumption_average() {
		return daily_consumption_average;
	}
	public void setDaily_consumption_average(String daily_consumption_average) {
		this.daily_consumption_average = daily_consumption_average;
	}
	public String getMonthly_consumption_average() {
		return monthly_consumption_average;
	}
	public void setMonthly_consumption_average(String monthly_consumption_average) {
		this.monthly_consumption_average = monthly_consumption_average;
	}
	public String getHasg_code() {
		return hasg_code;
	}
	public void setHasg_code(String hasg_code) {
		this.hasg_code = hasg_code;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getInvci_dic_goal() {
		return invci_dic_goal;
	}
	public void setInvci_dic_goal(String invci_dic_goal) {
		this.invci_dic_goal = invci_dic_goal;
	}
	public String getInvci_fic_goal() {
		return invci_fic_goal;
	}
	public void setInvci_fic_goal(String invci_fic_goal) {
		this.invci_fic_goal = invci_fic_goal;
	}
	public String getInvci_dmci_goal() {
		return invci_dmci_goal;
	}
	public void setInvci_dmci_goal(String invci_dmci_goal) {
		this.invci_dmci_goal = invci_dmci_goal;
	}
	public String getInvci_dic_index() {
		return invci_dic_index;
	}
	public void setInvci_dic_index(String invci_dic_index) {
		this.invci_dic_index = invci_dic_index;
	}
	public String getInvci_dmci_index() {
		return invci_dmci_index;
	}
	public void setInvci_dmci_index(String invci_dmci_index) {
		this.invci_dmci_index = invci_dmci_index;
	}
	public String getInvci_continuity_set() {
		return invci_continuity_set;
	}
	public void setInvci_continuity_set(String invci_continuity_set) {
		this.invci_continuity_set = invci_continuity_set;
	}
	public String getInvci_DEC_GOAL() {
		return invci_DEC_GOAL;
	}
	public void setInvci_DEC_GOAL(String invci_DEC_GOAL) {
		this.invci_DEC_GOAL = invci_DEC_GOAL;
	}
	public String getInvci_FEC_GOAL() {
		return invci_FEC_GOAL;
	}
	public void setInvci_FEC_GOAL(String invci_FEC_GOAL) {
		this.invci_FEC_GOAL = invci_FEC_GOAL;
	}
	public String getInvci_FEC_INDEX() {
		return invci_FEC_INDEX;
	}
	public void setInvci_FEC_INDEX(String invci_FEC_INDEX) {
		this.invci_FEC_INDEX = invci_FEC_INDEX;
	}
	public String getInvci_DEC_INDEX() {
		return invci_DEC_INDEX;
	}
	public void setInvci_DEC_INDEX(String invci_DEC_INDEX) {
		this.invci_DEC_INDEX = invci_DEC_INDEX;
	}
	public String getInvoice_QUANTITY() {
		return invoice_QUANTITY;
	}
	public void setInvoice_QUANTITY(String invoice_QUANTITY) {
		this.invoice_QUANTITY = invoice_QUANTITY;
	}
	public String getModality() {
		return modality;
	}
	public void setModality(String modality) {
		this.modality = modality;
	}
	public Integer getSupplyvoltage() {
		return supplyvoltage;
	}
	public void setSupplyvoltage(Integer supplyvoltage) {
		this.supplyvoltage = supplyvoltage;
	}
	public String getMeasurementvoltage() {
		return measurementvoltage;
	}
	public void setMeasurementvoltage(String measurementvoltage) {
		this.measurementvoltage = measurementvoltage;
	}
	public String getRegional() {
		return regional;
	}
	public void setRegional(String regional) {
		this.regional = regional;
	}
	public String getTotal_parcel() {
		return total_parcel;
	}
	public void setTotal_parcel(String total_parcel) {
		this.total_parcel = total_parcel;
	}
	public String getParcel_number() {
		return parcel_number;
	}
	public void setParcel_number(String parcel_number) {
		this.parcel_number = parcel_number;
	}
	public Integer getPay_mode() {
		return pay_mode;
	}
	public void setPay_mode(Integer pay_mode) {
		this.pay_mode = pay_mode;
	}
	public Integer getFk_addvw_id_col() {
		return fk_addvw_id_col;
	}
	public void setFk_addvw_id_col(Integer fk_addvw_id_col) {
		this.fk_addvw_id_col = fk_addvw_id_col;
	}
	public Integer getFk_addvw_id_ins() {
		return fk_addvw_id_ins;
	}
	public void setFk_addvw_id_ins(Integer fk_addvw_id_ins) {
		this.fk_addvw_id_ins = fk_addvw_id_ins;
	}
	public Integer getFk_grinv_id() {
		return fk_grinv_id;
	}
	public void setFk_grinv_id(Integer fk_grinv_id) {
		this.fk_grinv_id = fk_grinv_id;
	}
	public Integer getExternal_sequential() {
		return external_sequential;
	}
	public void setExternal_sequential(Integer external_sequential) {
		this.external_sequential = external_sequential;
	}
	public Date getGeneration_date() {
		return generation_date;
	}
	public void setGeneration_date(Date generation_date) {
		this.generation_date = generation_date;
	}
	public Date getEmission_date() {
		return emission_date;
	}
	public void setEmission_date(Date emission_date) {
		this.emission_date = emission_date;
	}
	public Date getBordero_identification() {
		return bordero_identification;
	}
	public void setBordero_identification(Date bordero_identification) {
		this.bordero_identification = bordero_identification;
	}
	public String getWeather_period() {
		return weather_period;
	}
	public void setWeather_period(String weather_period) {
		this.weather_period = weather_period;
	}
	public Date getTransformation_const() {
		return transformation_const;
	}
	public void setTransformation_const(Date transformation_const) {
		this.transformation_const = transformation_const;
	}
	public String getInstalled_meter_reactive() {
		return installed_meter_reactive;
	}
	public void setInstalled_meter_reactive(String installed_meter_reactive) {
		this.installed_meter_reactive = installed_meter_reactive;
	}
	public String getInstalled_meter_electronic() {
		return installed_meter_electronic;
	}
	public void setInstalled_meter_electronic(String installed_meter_electronic) {
		this.installed_meter_electronic = installed_meter_electronic;
	}
	public String getUse_parcel() {
		return use_parcel;
	}
	public void setUse_parcel(String use_parcel) {
		this.use_parcel = use_parcel;
	}
	public String getSupply_parcel() {
		return supply_parcel;
	}
	public void setSupply_parcel(String supply_parcel) {
		this.supply_parcel = supply_parcel;
	}
	public String getTariff_structure() {
		return tariff_structure;
	}
	public void setTariff_structure(String tariff_structure) {
		this.tariff_structure = tariff_structure;
	}
	public String getYearly_consumption_average() {
		return yearly_consumption_average;
	}
	public void setYearly_consumption_average(String yearly_consumption_average) {
		this.yearly_consumption_average = yearly_consumption_average;
	}
	public String getGroup_voltage() {
		return group_voltage;
	}
	public void setGroup_voltage(String group_voltage) {
		this.group_voltage = group_voltage;
	}
	public Integer getFisical_number_serial() {
		return fisical_number_serial;
	}
	public void setFisical_number_serial(Integer fisical_number_serial) {
		this.fisical_number_serial = fisical_number_serial;
	}
	public Integer getFisical_number_sequential() {
		return fisical_number_sequential;
	}
	public void setFisical_number_sequential(Integer fisical_number_sequential) {
		this.fisical_number_sequential = fisical_number_sequential;
	}
	public String getAdadd_formatted_address() {
		return adadd_formatted_address;
	}
	public void setAdadd_formatted_address(String adadd_formatted_address) {
		this.adadd_formatted_address = adadd_formatted_address;
	}
	public Integer getConference() {
		return conference;
	}
	public void setConference(Integer conference) {
		this.conference = conference;
	}
	public String getTotal_consumption() {
		return total_consumption;
	}
	public void setTotal_consumption(String total_consumption) {
		this.total_consumption = total_consumption;
	}
	public Integer getClass_code() {
		return class_code;
	}
	public void setClass_code(Integer class_code) {
		this.class_code = class_code;
	}
	public String getClass_description() {
		return class_description;
	}
	public void setClass_description(String class_description) {
		this.class_description = class_description;
	}
	public Integer getSub_class_code() {
		return sub_class_code;
	}
	public void setSub_class_code(Integer sub_class_code) {
		this.sub_class_code = sub_class_code;
	}
	public String getSub_class_description() {
		return sub_class_description;
	}
	public void setSub_class_description(String sub_class_description) {
		this.sub_class_description = sub_class_description;
	}
	public Date getSub_class_detailing_code() {
		return sub_class_detailing_code;
	}
	public void setSub_class_detailing_code(Date sub_class_detailing_code) {
		this.sub_class_detailing_code = sub_class_detailing_code;
	}
	public String getSub_class_detailing_desc() {
		return sub_class_detailing_desc;
	}
	public void setSub_class_detailing_desc(String sub_class_detailing_desc) {
		this.sub_class_detailing_desc = sub_class_detailing_desc;
	}
	public String getCntuc_formatted_address() {
		return cntuc_formatted_address;
	}
	public void setCntuc_formatted_address(String cntuc_formatted_address) {
		this.cntuc_formatted_address = cntuc_formatted_address;
	}
	public String getSub_group_code() {
		return sub_group_code;
	}
	public void setSub_group_code(String sub_group_code) {
		this.sub_group_code = sub_group_code;
	}
	public String getSub_group_description() {
		return sub_group_description;
	}
	public void setSub_group_description(String sub_group_description) {
		this.sub_group_description = sub_group_description;
	}
	public Integer getWeather_period_code() {
		return weather_period_code;
	}
	public void setWeather_period_code(Integer weather_period_code) {
		this.weather_period_code = weather_period_code;
	}
	public String getMeasurement_modality_desc() {
		return measurement_modality_desc;
	}
	public void setMeasurement_modality_desc(String measurement_modality_desc) {
		this.measurement_modality_desc = measurement_modality_desc;
	}
	public Integer getFk_cntrv_id_measurement_mod() {
		return fk_cntrv_id_measurement_mod;
	}
	public void setFk_cntrv_id_measurement_mod(Integer fk_cntrv_id_measurement_mod) {
		this.fk_cntrv_id_measurement_mod = fk_cntrv_id_measurement_mod;
	}
	public Integer getFk_iwust_id_base() {
		return fk_iwust_id_base;
	}
	public void setFk_iwust_id_base(Integer fk_iwust_id_base) {
		this.fk_iwust_id_base = fk_iwust_id_base;
	}
	public Integer getFk_iwust_id_agency_polar() {
		return fk_iwust_id_agency_polar;
	}
	public void setFk_iwust_id_agency_polar(Integer fk_iwust_id_agency_polar) {
		this.fk_iwust_id_agency_polar = fk_iwust_id_agency_polar;
	}
	public String getIndication_agency_attendance() {
		return indication_agency_attendance;
	}
	public void setIndication_agency_attendance(String indication_agency_attendance) {
		this.indication_agency_attendance = indication_agency_attendance;
	}
	public Date getBase_due_date() {
		return base_due_date;
	}
	public void setBase_due_date(Date base_due_date) {
		this.base_due_date = base_due_date;
	}
	public Integer getInvci_fic_index() {
		return invci_fic_index;
	}
	public void setInvci_fic_index(Integer invci_fic_index) {
		this.invci_fic_index = invci_fic_index;
	}
	public String getInvoicing_condition() {
		return invoicing_condition;
	}
	public void setInvoicing_condition(String invoicing_condition) {
		this.invoicing_condition = invoicing_condition;
	}
	public String getFk_iwrcr_id() {
		return fk_iwrcr_id;
	}
	public void setFk_iwrcr_id(String fk_iwrcr_id) {
		this.fk_iwrcr_id = fk_iwrcr_id;
	}
	public String getLow_income() {
		return low_income;
	}
	public void setLow_income(String low_income) {
		this.low_income = low_income;
	}
	public String getInvci_dic_trimestral_goal() {
		return invci_dic_trimestral_goal;
	}
	public void setInvci_dic_trimestral_goal(String invci_dic_trimestral_goal) {
		this.invci_dic_trimestral_goal = invci_dic_trimestral_goal;
	}
	public String getInvci_dic_annual_goal() {
		return invci_dic_annual_goal;
	}
	public void setInvci_dic_annual_goal(String invci_dic_annual_goal) {
		this.invci_dic_annual_goal = invci_dic_annual_goal;
	}
	public String getInvci_fic_trimestral_goal() {
		return invci_fic_trimestral_goal;
	}
	public void setInvci_fic_trimestral_goal(String invci_fic_trimestral_goal) {
		this.invci_fic_trimestral_goal = invci_fic_trimestral_goal;
	}
	public String getInvci_fic_annual_goal() {
		return invci_fic_annual_goal;
	}
	public void setInvci_fic_annual_goal(String invci_fic_annual_goal) {
		this.invci_fic_annual_goal = invci_fic_annual_goal;
	}
	public String getInvci_dic_trimestral_index() {
		return invci_dic_trimestral_index;
	}
	public void setInvci_dic_trimestral_index(String invci_dic_trimestral_index) {
		this.invci_dic_trimestral_index = invci_dic_trimestral_index;
	}
	public String getInvci_dic_annual_index() {
		return invci_dic_annual_index;
	}
	public void setInvci_dic_annual_index(String invci_dic_annual_index) {
		this.invci_dic_annual_index = invci_dic_annual_index;
	}
	public Date getInvci_fic_trimestral_index() {
		return invci_fic_trimestral_index;
	}
	public void setInvci_fic_trimestral_index(Date invci_fic_trimestral_index) {
		this.invci_fic_trimestral_index = invci_fic_trimestral_index;
	}
	public Date getInvci_fic_annual_index() {
		return invci_fic_annual_index;
	}
	public void setInvci_fic_annual_index(Date invci_fic_annual_index) {
		this.invci_fic_annual_index = invci_fic_annual_index;
	}
	public String getAverage_cost_monthly() {
		return average_cost_monthly;
	}
	public void setAverage_cost_monthly(String average_cost_monthly) {
		this.average_cost_monthly = average_cost_monthly;
	}
	public String getAverage_cost_trimestral() {
		return average_cost_trimestral;
	}
	public void setAverage_cost_trimestral(String average_cost_trimestral) {
		this.average_cost_trimestral = average_cost_trimestral;
	}
	public String getAverage_cost_annual() {
		return average_cost_annual;
	}
	public void setAverage_cost_annual(String average_cost_annual) {
		this.average_cost_annual = average_cost_annual;
	}
	public Integer getRef_month_index() {
		return ref_month_index;
	}
	public void setRef_month_index(Integer ref_month_index) {
		this.ref_month_index = ref_month_index;
	}
	public Integer getRef_year_index() {
		return ref_year_index;
	}
	public void setRef_year_index(Integer ref_year_index) {
		this.ref_year_index = ref_year_index;
	}
	public String getValue_tust() {
		return value_tust;
	}
	public void setValue_tust(String value_tust) {
		this.value_tust = value_tust;
	}
	public String getSector_fee() {
		return sector_fee;
	}
	public void setSector_fee(String sector_fee) {
		this.sector_fee = sector_fee;
	}
	public Integer getFiscal_number_ref_month() {
		return fiscal_number_ref_month;
	}
	public void setFiscal_number_ref_month(Integer fiscal_number_ref_month) {
		this.fiscal_number_ref_month = fiscal_number_ref_month;
	}
	public Integer getFiscal_number_ref_year() {
		return fiscal_number_ref_year;
	}
	public void setFiscal_number_ref_year(Integer fiscal_number_ref_year) {
		this.fiscal_number_ref_year = fiscal_number_ref_year;
	}
	public Integer getGenerated_by_printcenter() {
		return generated_by_printcenter;
	}
	public void setGenerated_by_printcenter(Integer generated_by_printcenter) {
		this.generated_by_printcenter = generated_by_printcenter;
	}
	public Integer getResend_invoice() {
		return resend_invoice;
	}
	public void setResend_invoice(Integer resend_invoice) {
		this.resend_invoice = resend_invoice;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getInvci_dicri_goal() {
		return invci_dicri_goal;
	}
	public void setInvci_dicri_goal(String invci_dicri_goal) {
		this.invci_dicri_goal = invci_dicri_goal;
	}
	public String getInvci_dicri_index() {
		return invci_dicri_index;
	}
	public void setInvci_dicri_index(String invci_dicri_index) {
		this.invci_dicri_index = invci_dicri_index;
	}
	public Date getPfc_start_date() {
		return pfc_start_date;
	}
	public void setPfc_start_date(Date pfc_start_date) {
		this.pfc_start_date = pfc_start_date;
	}
	public Integer getBraille_invoice() {
		return braille_invoice;
	}
	public void setBraille_invoice(Integer braille_invoice) {
		this.braille_invoice = braille_invoice;
	}
	public String getIndication_federal_government() {
		return indication_federal_government;
	}
	public void setIndication_federal_government(String indication_federal_government) {
		this.indication_federal_government = indication_federal_government;
	}
	public String getFk_iwrgd_id() {
		return fk_iwrgd_id;
	}
	public void setFk_iwrgd_id(String fk_iwrgd_id) {
		this.fk_iwrgd_id = fk_iwrgd_id;
	}
	public Date getTotal_gross_value_confins() {
		return total_gross_value_confins;
	}
	public void setTotal_gross_value_confins(Date total_gross_value_confins) {
		this.total_gross_value_confins = total_gross_value_confins;
	}
	public Date getTotal_gross_value_pis() {
		return total_gross_value_pis;
	}
	public void setTotal_gross_value_pis(Date total_gross_value_pis) {
		this.total_gross_value_pis = total_gross_value_pis;
	}
	public Date getTotal_gross_value_irrf() {
		return total_gross_value_irrf;
	}
	public void setTotal_gross_value_irrf(Date total_gross_value_irrf) {
		this.total_gross_value_irrf = total_gross_value_irrf;
	}
	public Date getTotal_gross_value_csll() {
		return total_gross_value_csll;
	}
	public void setTotal_gross_value_csll(Date total_gross_value_csll) {
		this.total_gross_value_csll = total_gross_value_csll;
	}
	
}
