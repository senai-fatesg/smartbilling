package br.com.pid.smartbilling.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.pid.smartbilling.model.Leitura;

public interface LeituraDaoRepository extends MongoRepository<Leitura, String>{

}
