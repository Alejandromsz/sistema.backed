package com.denkitronik.sistema.backend.api.controllers;

import com.denkitronik.sistema.backend.api.model.entities.Pais;
import com.denkitronik.sistema.backend.api.model.services.IPaisServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins ={"http://localhost:4200"})
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
		return IPaisService.update(pais, id);
	}


	/**
	 * 
	 * @param id
	 */
	@GetMapping(path ="/paises/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Pais buscar(@PathVariable Integer id){
		return IPaisService.findById(id);
	}

	/**
	 * 
	 * @param pais
	 */
	@PostMapping("/paises")
        @ResponseStatus(HttpStatus.CREATED)
	public Pais crear(@RequestBody Pais pais){
		return IPaisService.save(pais);
	}

	@GetMapping(path ="/paises", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Pais> index(){
		return IPaisService.findAlll();
                
	}
        @DeleteMapping("/paises/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Integer id){
            IPaisService.delete(id);
	}
}//end PaisRestController