package com.almirjr94.curso.boot.web.dao;

import java.time.LocalDate;
import java.util.List;

import com.almirjr94.curso.boot.web.domain.Funcionario;

public interface FuncionarioDao {
    
	void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();

	List<Funcionario> findByNome(String nome);

	List<Funcionario> findByCargo(Long id);

	List<Funcionario> findBySaida(LocalDate saida);

	List<Funcionario> findByDataEntrada(LocalDate entrada);

	List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida);
}
