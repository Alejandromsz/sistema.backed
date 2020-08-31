package com.denkitronik.sistema.backend.api.model.services;

import com.denkitronik.sistema.backend.api.model.dao.IPaisDao;
import com.denkitronik.sistema.backend.api.model.entities.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author aleja
 * @version 1.0
 * @created 28-ago.-2020 04:41:20 p. m.
 */
@Service
public class PaiseServiceImpl implements IPaisServices {

	@Autowired
	private IPaisDao PaisDao;

	public PaiseServiceImpl(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param id
	 */
	@Override
	public void delete(Integer id){

	}
        
        @Transactional(readOnly = true)
	@Override
	public List<Pais> findAlll(){
		return (List<Pais>) PaisDao.findAll();
	}

	/**
	 * 
	 * @param id
	 */
	@Override
	public Pais findById(Integer id){
		return null;
	}

	/**
	 * 
	 * @param pais
	 */
	@Override
	public Pais save(Pais pais){
		return null;
	}

	/**
	 * 
	 * @param pais
	 * @param id
	 */
	@Override
	public Pais update(Pais pais, Integer id){
		return null;
	}
          /*
    @Override
    public Pais save(Pais pais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pais update(Pais pais, Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}//end PaiseServiceImpl