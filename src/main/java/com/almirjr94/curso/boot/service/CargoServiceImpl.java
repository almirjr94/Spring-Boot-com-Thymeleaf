package com.almirjr94.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.almirjr94.curso.boot.domain.Cargo;
import com.almirjr94.curso.boot.repository.CargoRepository;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoRepository cargoRepository;

	@Override
	public void salvar(Cargo cargo) {
		cargoRepository.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		cargoRepository.save(cargo);
	}

	@Override
	public void excluir(Long id) {
		cargoRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorID(Long id) {
		return cargoRepository.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return cargoRepository.findAll();
	}

	@Override
	public boolean cargoTemFuncionarios(Long id) {
		if (buscarPorID(id).getFuncionarios().isEmpty()) {
			return false;
		}
		return true;
	}

}
