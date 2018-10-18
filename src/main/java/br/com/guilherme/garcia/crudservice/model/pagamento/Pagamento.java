package br.com.guilherme.garcia.crudservice.model.pagamento;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.guilherme.garcia.crudservice.model.aluno.Aluno;
import br.com.guilherme.garcia.crudservice.model.enumeration.StatusDom;

@Entity(name = "Pagamento")
public class Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private BigDecimal valor;
	
	@ManyToOne
    @JoinColumn(name = "aluno_id")
	private Aluno aluno;
	
	@Enumerated(EnumType.STRING)
	@Column
	private StatusDom status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public StatusDom getStatus() {
		return status;
	}

	public void setStatus(StatusDom status) {
		this.status = status;
	}

}
