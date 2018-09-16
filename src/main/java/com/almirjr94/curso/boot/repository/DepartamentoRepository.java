package com.almirjr94.curso.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almirjr94.curso.boot.domain.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{
	
}
