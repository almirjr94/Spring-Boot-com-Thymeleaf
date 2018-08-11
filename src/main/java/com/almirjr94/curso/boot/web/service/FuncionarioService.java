package com.almirjr94.curso.boot.web.service;

import java.util.List;

import com.almirjr94.curso.boot.web.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorID(Long id);
	
	List<Funcionario> buscarTodos(); 
	

}
