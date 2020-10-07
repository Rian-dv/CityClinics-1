package br.com.ifpi.cityclinics.repositorio;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import br.com.ifpi.cityclinics.modelo.Clinica;


public class ConfiguradorRepositorioRest implements RepositoryRestConfigurer{
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Clinica.class);
	}

}
