package dio.designpatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.designpatterns.model.Pokemon;

@Repository
public interface IPokemonRepository extends CrudRepository<Pokemon, String>{

}
