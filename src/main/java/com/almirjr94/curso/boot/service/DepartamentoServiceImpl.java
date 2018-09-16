package com.almirjr94.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.almirjr94.curso.boot.domain.Departamento;
import com.almirjr94.curso.boot.repository.DepartamentoRepository;

@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	@Override
	public void salvar(Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	@Override
	public void editar(Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	@Override
	public void excluir(Long id) {
		departamentoRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarPorID(Long id) {
		return departamentoRepository.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		return departamentoRepository.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if(buscarPorID(id).getCargos().isEmpty()) {
			return false;
		}
		return true;
	}

}
