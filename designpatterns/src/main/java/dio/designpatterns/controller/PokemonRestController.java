package dio.designpatterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.designpatterns.model.Pokemon;
import dio.designpatterns.service.PokemonServiceImp;

@RestController
@RequestMapping("pokemons")
public class PokemonRestController {

	@Autowired
	private PokemonServiceImp pokemonService;

	@GetMapping
	public ResponseEntity<Iterable<Pokemon>> buscarTodosPokemonsInseridos() {
		return ResponseEntity.ok(pokemonService.buscarTodosPokemonsInseridos());
	}

	@GetMapping("/{name}")
	public ResponseEntity<Pokemon> buscarPokemon(@PathVariable String name) {
		return ResponseEntity.ok(pokemonService.buscarPokemon(name));
	}

	@PostMapping("insert/{name}")
	public ResponseEntity<Pokemon> inserirPokemon(@PathVariable String name) {
		pokemonService.inserirPokemon(name);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{name}")
	public ResponseEntity<Pokemon> excluirPokemon(@PathVariable String name) {
		pokemonService.excluirPokemon(name);
		return ResponseEntity.ok().build();
	}

}
