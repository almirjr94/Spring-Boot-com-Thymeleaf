package com.almirjr94.curso.boot.service;

import java.time.LocalDate;
import java.util.List;

import com.almirjr94.curso.boot.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorID(Long id);
	
	List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(Long id);

	List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida); 
	

}
