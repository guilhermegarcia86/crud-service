package br.com.guilherme.garcia.crudservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.garcia.crudservice.model.comunicado.Comunicado;
import br.com.guilherme.garcia.crudservice.service.ComunicadoService;

@RestController
@RequestMapping("comunicado")
public class ComunicadoController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ComunicadoService comunicadoService;
	
	@GetMapping("all")
	public List<Comunicado> findAll(){
		logger.info("Recebe a chamada de um microserviço");
		return comunicadoService.findAllComunicados();
	}
	
	@PostMapping("add")
	public Comunicado add(@RequestBody Comunicado comunicado) {
		return comunicadoService.addComunicado(comunicado);
	}
	
	@GetMapping("upload")
	public String uploadFile() {
		return "Call upload service";
	}

}
