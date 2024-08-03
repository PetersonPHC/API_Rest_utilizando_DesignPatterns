package dio.designpatterns.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dio.designpatterns.model.Pokemon;

@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2/pokemon")
public interface IApiPokemonService {
    @GetMapping("/{name}")
    Pokemon buscarPokemon(@PathVariable("name") String name);
}

