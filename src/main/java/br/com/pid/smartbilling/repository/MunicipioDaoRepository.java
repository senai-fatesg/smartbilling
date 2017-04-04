package br.com.pid.smartbilling.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.pid.smartbilling.model.EnumUf;
import br.com.pid.smartbilling.model.Municipio;

public interface MunicipioDaoRepository extends MongoRepository<Municipio, Integer>{

	@Query("{ 'uf' : ?0, '$descricao' : ?0 }")
	List<Municipio> listarPorUfNome(EnumUf uf, String descricao);
	
	@Query("{ 'uf' : ?0}")
	List<Municipio> listarPorUfs(EnumUf uf);
	
	@Query("{ 'codigoIbge' : ?0}")
	Municipio buscarPorCodigoIbge(Integer codigo);
	
}
