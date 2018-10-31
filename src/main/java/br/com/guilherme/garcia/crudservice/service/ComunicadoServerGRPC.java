package br.com.guilherme.garcia.crudservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.guilherme.garcia.comunicado.grpc.Comunicado;
import br.com.guilherme.garcia.comunicado.grpc.Comunicado.Builder;
import br.com.guilherme.garcia.comunicado.grpc.ComunicadoServiceGrpc.ComunicadoServiceImplBase;
import br.com.guilherme.garcia.crudservice.repository.comunicado.ComunicadoRepository;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@GrpcService
public class ComunicadoServerGRPC extends ComunicadoServiceImplBase{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ComunicadoRepository comunicadoDAO;

	@Override
	public void addComunicado(Comunicado request, StreamObserver<Comunicado> responseObserver) {
		logger.info("----> ComunicadoGrpc");
		br.com.guilherme.garcia.crudservice.model.comunicado.Comunicado comunicadoEntity = new br.com.guilherme.garcia.crudservice.model.comunicado.Comunicado();
		comunicadoEntity.setTexto(request.getTexto());
		br.com.guilherme.garcia.crudservice.model.comunicado.Comunicado save = comunicadoDAO.save(comunicadoEntity);
				
		Builder builder = Comunicado.newBuilder();
		
		builder.setId(save.getId().toString());
		builder.setTexto(save.getTexto());
		
		responseObserver.onNext(builder.build());
		responseObserver.onCompleted();
		
	}
	
}
