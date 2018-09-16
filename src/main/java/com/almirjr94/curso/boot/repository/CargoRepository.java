package com.almirjr94.curso.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almirjr94.curso.boot.domain.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
