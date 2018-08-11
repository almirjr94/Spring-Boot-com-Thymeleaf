package com.almirjr94.curso.boot.web.dao;

import java.util.List;

import com.almirjr94.curso.boot.web.domain.Funcionario;

public interface FuncionarioDao {
    
	void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
