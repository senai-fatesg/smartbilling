package br.com.pid.smartbilling.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.pid.smartbilling.model.PerfilConsumo;

public interface PerfilConsumoDaoRespository extends MongoRepository<PerfilConsumo, String>{
	
	@Query("{ '_id' : ?0 }")
	PerfilConsumo findByUc(Integer id);
	
	@Query("{$and:[{_id: ?0},{dt_leitura: ?1}]}")
	PerfilConsumo findByUcAndDataLeitura(Integer id, String dt_leitura);

}
