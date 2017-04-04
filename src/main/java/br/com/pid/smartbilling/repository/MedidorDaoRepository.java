package br.com.pid.smartbilling.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.pid.smartbilling.model.Medidor;

public interface MedidorDaoRepository extends MongoRepository<Medidor, String>{

	@Query("{ 'numeroSerieMedidor' : { $regex: ?0 } }")
	List<Medidor> findMedidorByRegexpNumeroSerieMedidor(String regexp);

	@Query("{'$or' : [{'numeroSerieMedidor' : {numeroSerieMedidor : ?0}}, {'diaAtual' : {diaAtual : ?1}}]}")
	Medidor buscarPorArquivoAdicionado(String numeroSerieMedidor, String diaAtual);

}
