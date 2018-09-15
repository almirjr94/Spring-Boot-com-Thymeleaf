package com.almirjr94.curso.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.almirjr94.curso.boot.domain.Cargo;
import com.almirjr94.curso.boot.service.CargoService;

@Component
public class StringToCargoConversor implements Converter<String, Cargo> {

	@Autowired
	private CargoService cargoService;

	@Override
	public Cargo convert(String text) {
		if (text.isEmpty()) {
			return null;
		}

		Long id = Long.parseLong(text);
		return cargoService.buscarPorID(id);
	}

}
