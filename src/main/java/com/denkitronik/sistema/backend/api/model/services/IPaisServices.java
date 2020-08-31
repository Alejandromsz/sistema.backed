package com.denkitronik.sistema.backend.api.model.services;

import com.denkitronik.sistema.backend.api.model.entities.Pais;
import java.util.List;


/**
 * @author aleja
 * @version 1.0
 * @created 28-ago.-2020 04:41:20 p. m.
 */
public interface IPaisServices {

	/**
	 * 
	 * @param id
	 */
	public void delete(Integer id);

	public List<Pais> findAlll();

	/**
	 * 
	 * @param id
	 */
	public Pais findById(Integer id);

	/**
	 * 
	 * @param pais
	 */
	public Pais save(Pais pais);

	/**
	 * 
	 * @param pais
	 * @param id
	 */
	public Pais update(Pais pais, Integer id);

}