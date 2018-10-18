package br.com.guilherme.garcia.crudservice.model.comunicado;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import br.com.guilherme.garcia.crudservice.model.calendario.Calendario;

@Entity(name = "comunicado")
public class Comunicado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	@Lob
	private String texto;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "comunicados")
	private Set<Calendario> calendarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Set<Calendario> getCalendarios() {
		return calendarios;
	}

	public void setCalendarios(Set<Calendario> calendarios) {
		this.calendarios = calendarios;
	}

}
