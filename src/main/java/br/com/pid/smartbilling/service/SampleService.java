package br.com.pid.smartbilling.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.pid.smartbilling.daoJdbc.PerfilConsumoDaoJdbc;

@Service
public class SampleService {

    private static final Logger LOG = LoggerFactory.getLogger(SampleService.class);
    
    private PerfilConsumoDaoJdbc perfilConsumoDaoJdbc = new PerfilConsumoDaoJdbc();

    public void hello() {
        LOG.info("Hello World!");
    }

	public PerfilConsumoDaoJdbc getPerfilConsumoDaoJdbc() {
		return perfilConsumoDaoJdbc;
	}

	public void setPerfilConsumoDaoJdbc(PerfilConsumoDaoJdbc perfilConsumoDaoJdbc) {
		this.perfilConsumoDaoJdbc = perfilConsumoDaoJdbc;
	}
    
}