package br.com.pid.smartbilling.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.pid.smartbilling.model.FolhaDeLeitura;

public interface FolhaLeituraDaoRepository extends MongoRepository<FolhaDeLeitura, String>{

	@Query("{ 'uc' : ?0 }")
	FolhaDeLeitura findByUc(Integer uc);


}
