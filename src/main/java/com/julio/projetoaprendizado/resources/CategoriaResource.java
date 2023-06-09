package com.julio.projetoaprendizado.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julio.projetoaprendizado.domain.Categoria;
import com.julio.projetoaprendizado.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping()
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> catList = new ArrayList<>();
		catList.add(cat1);
		catList.add(cat2);
		
		return catList;
			
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findCategory (Integer id ) {
		Categoria categoria = service.buscarCategoria(id);
		return ResponseEntity.ok().body(categoria);
		
	}
	
}
