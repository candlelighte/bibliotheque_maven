package com.app.business.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.business.bo.Rayon;
import com.app.business.dao.RayonDao;
import com.genericdao.impl.GenericDaoImpl;


/**
 * 
 * Implementation du DAO RayonDao. Cette classe herite toutes les
 * fonctionnalites du DAO Generic en indiquant les valeurs de T et PK
 * 
 * 
 * @author boudaa
 *
 */
@Repository
public class RayonDaoImpl extends GenericDaoImpl<Rayon, Long> implements
		RayonDao {

	public RayonDaoImpl() {

		// car on travail sur des objets de la classe Rayon, il y a des méthodes
		// hibernate qui auront besoin de cette information cf. le code de
		// generic dao
		super(Rayon.class);
	}
}
