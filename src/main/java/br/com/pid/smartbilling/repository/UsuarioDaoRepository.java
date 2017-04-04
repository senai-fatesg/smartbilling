package br.com.pid.smartbilling.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.pid.smartbilling.model.Usuario;

public interface UsuarioDaoRepository extends MongoRepository<Usuario, String>{

	@Query("{ 'nome' : { $regex: ?0 } }")
	List<Usuario> findUsersByRegexpName(String regexp);
	
	@Query("{ 'email' : { $regex: ?0 } }")
	List<Usuario> findUsersByRegexpEmail(String regexp);
	
	@Query("{ 'cpf' : ?0 }")
	Usuario findUserByCpf(String cpf);

	//@Query("{ 'username'  }, { 'password' : ?0 }")
	@Query( "{$and: [{ 'login' : ?0}, { 'senha' :  ?1}]}")
	Usuario validateUser(String username, String password);

}
