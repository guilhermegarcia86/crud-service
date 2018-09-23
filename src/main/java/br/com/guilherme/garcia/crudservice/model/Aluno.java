package br.com.guilherme.garcia.crudservice.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.guilherme.garcia.crudservice.model.enumeration.SerieDom;
import br.com.guilherme.garcia.crudservice.model.enumeration.StatusDom;
import lombok.Data;

@Entity(name = "aluno")
@Data
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column
	private SerieDom serie;

	@Column
	@OneToMany(mappedBy = "aluno")
	private Set<Nota> notas;

	@Enumerated(EnumType.STRING)
	@Column
	private StatusDom status;

	@ManyToOne
	@JoinColumn(name = "reposanvel_id")
	private Responsavel responsavel;

}
