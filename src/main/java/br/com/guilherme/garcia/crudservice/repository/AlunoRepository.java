package br.com.guilherme.garcia.crudservice.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.guilherme.garcia.crudservice.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {

}
