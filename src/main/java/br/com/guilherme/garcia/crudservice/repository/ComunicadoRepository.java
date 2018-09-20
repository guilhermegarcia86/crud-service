package br.com.guilherme.garcia.crudservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.garcia.crudservice.model.Comunicado;

public interface ComunicadoRepository extends JpaRepository<Comunicado, Long> {

}
