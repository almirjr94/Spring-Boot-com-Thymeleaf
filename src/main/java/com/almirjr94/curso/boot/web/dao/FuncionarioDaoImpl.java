package com.almirjr94.curso.boot.web.dao;

import org.springframework.stereotype.Repository;

import com.almirjr94.curso.boot.web.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
