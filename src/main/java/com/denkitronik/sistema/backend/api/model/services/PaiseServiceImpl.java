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
              PaisDao.deleteById(id);
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
		return PaisDao.findById(id).orElse(null);
	}

	/**
	 * 
	 * @param pais
	 */
	@Override
	public Pais save(Pais pais){
		return PaisDao.save(pais);
	}

	/**
	 * 
	 * @param pais
	 * @param id
	 */
	@Override
	public Pais update(Pais pais, Integer id){
		if(PaisDao.findById(id).isPresent()){
                    Pais paisModificado = PaisDao.findById(id).get();
                    paisModificado.setId(id);
                    paisModificado.setPais(pais.getPais());
                    PaisDao.save(paisModificado);
                    return paisModificado;
                }else return null;
	}

}//end PaiseServiceImpl