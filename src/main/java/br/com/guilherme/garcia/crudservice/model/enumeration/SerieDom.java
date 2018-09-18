package br.com.guilherme.garcia.crudservice.model.enumeration;

public enum SerieDom {
	
	PRIMEIRA_SERIE_FUNDAMENTAL("Primeira serie"),
	SEGUNDA_SERIE_FUNDAMENTAL("Segunda serie"),
	TERCEIRA_SERIE_FUNDAMENTAL("Segunda serie"),
	QUARTA_SERIE_FUNDAMENTAL("Terceira serie"),
	QUINTA_SERIE_FUNDAMENTAL("Quarta serie"),
	SEXTA_SERIE_FUNDAMENTAL("Sexta serie"),
	SETIMA_SERIE_FUNDAMENTAL("Setima serie"),
	OITAVA_SERIE_FUNDAMENTAL("Oitava serie"),
	NONA_SERIE_FUNDAMENTAL("Nona serie"),
	PRIMEIRA_SERIE_MEDIO("Primeiro colegial"),
	SEGUNDA_SERIE_MEDIO("Segundo colegial"),
	TERCEIRA_SERIE_MEDIO("Terceiro colegial");
	
	private String serie;
	
	SerieDom(String serie){
		this.serie = serie;
	}
	
	@Override
	public String toString() {
		return serie;
	}
	

}
