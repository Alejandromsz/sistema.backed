package com.denkitronik.sistema.backend.api.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author aleja
 * @version 1.0
 * @created 28-ago.-2020 04:41:20 p. m.
 */
@Entity
@Table(name = "pais")
public class Pais implements Serializable {

	@Id
        @GeneratedValue(generator = "pais_generator")
        @SequenceGenerator( name = "pais_generator" , sequenceName = "pais_id_seq", initialValue = 11)
	private Integer id;
	@Column(name = "pais")
	private String pais;
        @Transient
	private Long serialVersionID;



	public void finalize() throws Throwable {

	}
	public int Pais(){
		return 0;
	}

	/**
	 * 
	 * @param id
	 */
	public int Pais(Integer id){
		return 0;
	}

	public Integer getId(){
		return id;
	}

	public String getPais(){
		return pais;
	}

	/**
	 * 
	 * @param id
	 */
	public int setId(Integer id){
		return this.id=id;
	}

	/**
	 * 
	 * @param pais
	 */
	public String setPais(String pais){
		return this.pais=pais;
	}
}//end Pais