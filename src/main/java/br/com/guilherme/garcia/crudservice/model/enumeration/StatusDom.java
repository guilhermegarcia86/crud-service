package br.com.guilherme.garcia.crudservice.model.enumeration;

public enum StatusDom {
	
	ADIMPLENTE("Adimplente"),
	INADIMPLENTE("Inadimplente"),
	EX_ALUNO("Ex-aluno");
	
	private String status;
	
	StatusDom(String status){
		this.status = status;
	}

	@Override
	public String toString() {
		return status;
	}
}
