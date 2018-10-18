package br.com.guilherme.garcia.crudservice.repository.comunicado;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.garcia.crudservice.model.comunicado.Comunicado;

public interface ComunicadoRepository extends JpaRepository<Comunicado, Long> {

}
