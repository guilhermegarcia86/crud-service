package br.com.guilherme.garcia.crudservice.model.calendario;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.guilherme.garcia.crudservice.model.comunicado.Comunicado;

@Entity(name = "Calendario")
public class Calendario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String nomeEvento;

	@Column
	@Temporal(TemporalType.DATE)
	private Date dataEvento;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "calendario_comunicado", joinColumns = {
			@JoinColumn(name = "calendario_id") }, inverseJoinColumns = { @JoinColumn(name = "comunicado_id") })
	private Set<Comunicado> comunicados;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Set<Comunicado> getComunicados() {
		return comunicados;
	}

	public void setComunicados(Set<Comunicado> comunicados) {
		this.comunicados = comunicados;
	}

}
