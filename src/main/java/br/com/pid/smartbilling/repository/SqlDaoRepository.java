package br.com.pid.smartbilling.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.pid.smartbilling.model.Sql;

public interface SqlDaoRepository extends MongoRepository<Sql, String>{
	

}
