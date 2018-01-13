package com.app.business.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.business.bo.Theme;
import com.app.business.dao.ThemeDao;
import com.genericdao.impl.GenericDaoImpl;

/**
 * Implementation du DAO ThemeDao. Cette classe herite toutes les
 * fonctionnalites du DAO Generic en indiquant les valeurs de T et PK
 * 
 * @author boudaa
 *
 */
@Repository
public class ThemeDaoImpl extends GenericDaoImpl<Theme, Long> implements
		ThemeDao {

	public ThemeDaoImpl() {
		// car on travail sur des objets de la classe Theme, il y a des methodes
		// hibernate qui auront besoin de cette information cf. le code de
		// generic dao
		super(Theme.class);
	}

}
