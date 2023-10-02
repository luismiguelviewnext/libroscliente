package com.curso.libroscliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.curso.controller",
											"com.curso.service"})

											/**
 * Clase principal de la aplicación Libroscliente.
 * 
 * Esta clase contiene el método {@code main} que inicia la aplicación 
 * y un método {@code Bean} para la creación de un objeto {@code RestTemplate}.
 * 
 * La aplicación escanea los paquetes {@code com.curso.controller} y 
 * {@code com.curso.service} durante el inicio para detectar componentes de Spring.
 */
public class LibrosclienteApplication {

	/**
     * Método principal que inicia la aplicación Libroscliente.
     * 
     * @param args Argumentos de la línea de comandos.
     */
	public static void main(String[] args) {
		SpringApplication.run(LibrosclienteApplication.class, args);
	}

	 /**
     * Define el {@code Bean} para {@code RestTemplate}.
     * 
     * Este método crea y retorna una nueva instancia de {@code RestTemplate} 
     * que se utilizará para realizar llamadas REST.
     * 
     * @return Una nueva instancia de {@link RestTemplate}.
     */
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}



}
