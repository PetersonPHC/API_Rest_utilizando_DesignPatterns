package dio.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
* Projeto Spring Boot gerado via Spring Initializr.
* Os seguintes módulos foram selecionados:
* - Spring Data JPA
* - Spring Web
* - H2 Database
* - OpenFeign
* - OpenApi/Swagger -> Adicionado Manualmente
* 
* @author PetersonPHC
*/

@SpringBootApplication
@EnableFeignClients
public class DesafioDioPadroesDeProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioPadroesDeProjetoApplication.class, args);
	}

}
