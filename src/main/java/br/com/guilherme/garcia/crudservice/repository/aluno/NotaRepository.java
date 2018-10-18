package br.com.guilherme.garcia.crudservice.repository.aluno;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.garcia.crudservice.model.aluno.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {

}
