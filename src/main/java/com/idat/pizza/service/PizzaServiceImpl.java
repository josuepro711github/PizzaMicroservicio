package com.idat.pizza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idat.pizza.model.Pizza;
import com.idat.pizza.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService {

	private PizzaRepository repository;
	
	@Override
	public List<Pizza> listar() {
		return repository.findAll();
	}

	@Override
	public Pizza obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizza pizza) {
		repository.save(pizza);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Pizza pizza) {
		repository.saveAndFlush(pizza);
	}

}
