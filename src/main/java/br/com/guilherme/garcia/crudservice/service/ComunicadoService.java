package br.com.guilherme.garcia.crudservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guilherme.garcia.crudservice.model.Comunicado;
import br.com.guilherme.garcia.crudservice.repository.ComunicadoRepository;

@Service
public class ComunicadoService {
	
	@Autowired
	private ComunicadoRepository comunicadoRepository;
	
	public List<Comunicado> findAllComunicados(){
		return comunicadoRepository.findAll();
	}
	
	public Comunicado addComunicado(Comunicado comunicado) {
		return comunicadoRepository.save(comunicado);
	}

}
