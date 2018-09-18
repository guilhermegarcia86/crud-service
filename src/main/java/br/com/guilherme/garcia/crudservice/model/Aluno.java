package br.com.guilherme.garcia.crudservice.model;

import java.io.Serializable;
import java.util.Objects;
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

@Entity
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

	@Override
	public String toString() {
		return "[ Aluno :: nome - " + this.getNome() + " :: serie - " + this.getSerie().toString() + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj instanceof Aluno) {
			Aluno outroAluno = (Aluno) obj;

			return outroAluno.id.equals(id);
		}

		return false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SerieDom getSerie() {
		return serie;
	}

	public void setSerie(SerieDom serie) {
		this.serie = serie;
	}

	public Set<Nota> getNotas() {
		return notas;
	}

	public void setNotas(Set<Nota> notas) {
		this.notas = notas;
	}

	public StatusDom getStatus() {
		return status;
	}

	public void setStatus(StatusDom status) {
		this.status = status;
	}

}
