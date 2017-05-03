package br.com.pid.smartbilling.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.pid.smartbilling.model.EntidadeVazia;

public interface EntidadeVaziaDaoRepository extends MongoRepository<EntidadeVazia, Integer>{


}
