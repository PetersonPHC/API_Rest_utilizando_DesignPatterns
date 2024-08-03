package dio.designpatterns.service;

import dio.designpatterns.model.Pokemon;

public interface IPokemonService {

	public Iterable<Pokemon> buscarTodosPokemonsInseridos();

	public Pokemon buscarPokemon(String name);

	public void inserirPokemon(String name);

	public void excluirPokemon(String name);
}
