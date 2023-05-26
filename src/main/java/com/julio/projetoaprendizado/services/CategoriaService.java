package com.julio.projetoaprendizado.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.projetoaprendizado.domain.Categoria;
import com.julio.projetoaprendizado.repositories.CategoriaRepository;

@Service
public class CategoriaService  {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscarCategoria (Integer id) {
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElse(null);		
	}

}
