package com.almirjr94.curso.boot.service;

import java.util.List;

import com.almirjr94.curso.boot.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorID(Long id);
	
	List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id); 
	
}
