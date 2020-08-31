package com.denkitronik.sistema.backend.api.controllers;

import com.denkitronik.sistema.backend.api.model.entities.Pais;
import com.denkitronik.sistema.backend.api.model.services.IPaisServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aleja
 * @version 1.0
 * @created 28-ago.-2020 04:41:21 p. m.
 */
@RestController
@RequestMapping("/api")

public class PaisRestController {

	@Autowired
	private IPaisServices IPaisService;

	public PaisRestController(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param pais
	 * @param id
	 */
	@PutMapping("/paises/{id}")
        @ResponseStatus(HttpStatus.CREATED)
	public Pais actualizar(@RequestBody Pais pais, @PathVariable Integer id){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	@DeleteMapping("/paises/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Integer id){

	}

	/**
	 * 
	 * @param id
	 */
	@GetMapping(path ="/paises/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public int buscar(@PathVariable Integer id){
		return 0;
	}

	/**
	 * 
	 * @param pais
	 */
	@PostMapping("/paises")@ResponseStatus(HttpStatus.CREATED)
	public Pais crear(@RequestBody Pais pais){
		return null;
	}

	@GetMapping(path ="/paises", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Pais> index(){
		return IPaisService.findAlll();
	}
}//end PaisRestController