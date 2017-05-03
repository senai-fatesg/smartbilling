package br.com.pid.smartbilling.service;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pid.smartbilling.daoJdbc.PerfilConsumoDaoJdbc;
import br.com.pid.smartbilling.model.Municipio;
import br.com.pid.smartbilling.model.PerfilConsumo;
import br.com.pid.smartbilling.repository.PerfilConsumoDaoRespository;

@Service
public class SampleService {

	private static final Logger LOG = LoggerFactory.getLogger(SampleService.class);

	@Autowired
	private PerfilConsumoDaoRespository perfilConsumoDao;
	private PerfilConsumoDaoJdbc perfilConsumoDaoJdbc = new PerfilConsumoDaoJdbc();
	private List<PerfilConsumo> dadosPerfisConsumo = new ArrayList<>();

	public void listarDadosPerfilConsumo(){
		LOG.info("Listando dados de consumo!");
		try {
			dadosPerfisConsumo = perfilConsumoDaoJdbc.listarDadosConsumo();
			if (!dadosPerfisConsumo.isEmpty()) {
				for (PerfilConsumo perfilConsumo : dadosPerfisConsumo) {
					if (!validarDadoMigrado(perfilConsumo.getId(), perfilConsumo.getDt_leitura())){
						perfilConsumoDao.save(perfilConsumo);
						LOG.info("Salvando dados no mongodb!");
					}
				}

			}else {
				LOG.info("A lista de municipio esta vazia...");
			}
		} catch (Exception e) {
			LOG.error("Erro ao listar os municipios na base de dados oracle", e.getMessage());
			e.printStackTrace();
		}

	}

	public boolean validarDadoMigrado(Integer id, String dt_leitura){
		PerfilConsumo perfilConsumo =  perfilConsumoDao.findByUcAndDataLeitura(id, dt_leitura);
		if (perfilConsumo != null){
			return true;
		}else {
			return false;
		}
	}

	public PerfilConsumoDaoJdbc getPerfilConsumoDaoJdbc() {
		return perfilConsumoDaoJdbc;
	}

	public void setPerfilConsumoDaoJdbc(PerfilConsumoDaoJdbc perfilConsumoDaoJdbc) {
		this.perfilConsumoDaoJdbc = perfilConsumoDaoJdbc;
	}

	public List<PerfilConsumo> getDadosPerfisConsumo() {
		return dadosPerfisConsumo;
	}


}