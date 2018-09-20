package br.com.guilherme.garcia.crudservice.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.guilherme.garcia.crudservice.model.Nota;

public interface NotaRepository extends CrudRepository<Nota, Long> {

}
