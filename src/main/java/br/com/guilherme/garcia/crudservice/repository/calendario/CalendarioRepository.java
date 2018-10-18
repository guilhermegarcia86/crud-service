package br.com.guilherme.garcia.crudservice.repository.calendario;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.garcia.crudservice.model.calendario.Calendario;

public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

}
