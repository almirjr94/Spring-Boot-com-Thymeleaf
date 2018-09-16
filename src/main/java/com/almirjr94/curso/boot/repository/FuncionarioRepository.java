package com.almirjr94.curso.boot.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almirjr94.curso.boot.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    

	List<Funcionario> findByNomeIgnoreCaseLike(String nome);

	List<Funcionario> findByCargoId(Long id);

	List<Funcionario> findByDataSaida(LocalDate saida);

	List<Funcionario> findByDataEntrada(LocalDate entrada);

	List<Funcionario> findByDataEntradaGreaterThanEqualAndDataSaidaLessThanEqualOrderByDataEntradaDesc(LocalDate entrada, LocalDate saida);
}
