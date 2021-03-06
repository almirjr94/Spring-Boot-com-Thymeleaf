package com.almirjr94.curso.boot.service;

import java.util.List;

import com.almirjr94.curso.boot.domain.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorID(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id); 

}
