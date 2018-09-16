package com.almirjr94.curso.boot.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.almirjr94.curso.boot.domain.Funcionario;
import com.almirjr94.curso.boot.repository.FuncionarioRepository;

@Service
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public void salvar(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}

	@Override
	public void editar(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}

	@Override
	public void excluir(Long id) {
		funcionarioRepository.deleteById(id);;
	}

	@Override
	@Transactional(readOnly = true)
	public Funcionario buscarPorID(Long id) {
		return funcionarioRepository.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {
		return funcionarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> buscarPorNome(String nome) {

		return funcionarioRepository.findByNomeIgnoreCaseLike("%"+nome+"%");
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> buscarPorCargo(Long id) {

		return funcionarioRepository.findByCargoId(id);
	}

	@Override
	public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida) {
		if (entrada != null && saida != null)
			return funcionarioRepository.findByDataEntradaGreaterThanEqualAndDataSaidaLessThanEqualOrderByDataEntradaDesc(entrada, saida);
		else if (entrada != null)
			return funcionarioRepository.findByDataEntrada(entrada);
		else if (saida != null)
			return funcionarioRepository.findByDataSaida(saida);

		return new ArrayList<>();
	}

}
