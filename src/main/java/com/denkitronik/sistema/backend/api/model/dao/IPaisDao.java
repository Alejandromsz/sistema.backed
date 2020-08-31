package com.denkitronik.sistema.backend.api.model.dao;

import com.denkitronik.sistema.backend.api.model.entities.Pais;
import org.springframework.data.repository.CrudRepository;


/**
 * @author aleja
 * @version 1.0
 * @created 28-ago.-2020 04:41:20 p. m.
 */
public interface IPaisDao extends CrudRepository <Pais, Integer> {

}