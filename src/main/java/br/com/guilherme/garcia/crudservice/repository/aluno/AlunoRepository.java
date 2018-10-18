package br.com.guilherme.garcia.crudservice.repository.aluno;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.garcia.crudservice.model.aluno.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
