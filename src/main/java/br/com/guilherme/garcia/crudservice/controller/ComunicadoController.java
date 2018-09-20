package br.com.guilherme.garcia.crudservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.garcia.crudservice.model.Comunicado;
import br.com.guilherme.garcia.crudservice.service.ComunicadoService;

@RestController
@RequestMapping("comunicado")
public class ComunicadoController {
	
	@Autowired
	private ComunicadoService comunicadoService;
	
	@GetMapping("all")
	public List<Comunicado> findAll(){
		return comunicadoService.findAllComunicados();
	}
	
	@PostMapping("add")
	public Comunicado add(@RequestBody Comunicado comunicado) {
		return comunicadoService.addComunicado(comunicado);
	}

}
