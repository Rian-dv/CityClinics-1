package br.com.ifpi.cityclinics.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.ifpi.cityclinics.modelo.Clinica;

@RepositoryRestResource
public interface IClinicaRepositorio extends JpaRepository<Clinica, Long>{
	
}
