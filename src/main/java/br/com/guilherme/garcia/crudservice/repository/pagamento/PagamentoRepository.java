package br.com.guilherme.garcia.crudservice.repository.pagamento;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.garcia.crudservice.model.pagamento.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
