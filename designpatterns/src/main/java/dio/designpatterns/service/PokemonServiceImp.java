package dio.designpatterns.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.designpatterns.model.Pokemon;
import dio.designpatterns.repository.IPokemonRepository;

@Service
public class PokemonServiceImp implements IPokemonService{

	@Autowired
	IApiPokemonService apiPokemon;
	@Autowired
	IPokemonRepository repository;
	
	@Override
	public Iterable<Pokemon> buscarTodosPokemonsInseridos() {
		return repository.findAll();
	}

	@Override
	public Pokemon buscarPokemon(String name) {
		Pokemon pokemon = apiPokemon.buscarPokemon(name);
		return pokemon;
	}

	@Override
	public void inserirPokemon(String name) {
		Optional<Pokemon> pokemonDb = repository.findById(name);
		if(pokemonDb.isPresent()) {
			System.err.println("Pokemon ja existe no banco de Dados");
		}else {
			Pokemon pokemon = buscarPokemon(name);
			repository.save(pokemon);
		}
	}

	@Override
	public void excluirPokemon(String name) {
		Optional<Pokemon> pokemonDb = repository.findById(name);
		if(!pokemonDb.isPresent()) {
			System.err.println("Pokemon Não existe no banco de Dados");
		}else {
			repository.deleteById(name);
		}
	}

}
