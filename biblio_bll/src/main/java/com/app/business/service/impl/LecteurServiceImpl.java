package com.app.business.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.business.bo.Lecteur;
import com.app.business.dao.LecteurDAO;
import com.app.business.service.LecteurService;
import com.genericdao.common.EntityNotFoundException;

@Service
@Transactional
public class LecteurServiceImpl implements LecteurService {

	@Autowired
	private LecteurDAO lecteurDao;

	public void addLecteur(Lecteur pLecteur) {

		// TODO : probabelement du code permettant de vérifier les régles
		// métiers

		lecteurDao.create(pLecteur);
		
		//TODO : eventuellement du code metier à ajouter

	}

	public void deleteLecteur(Long idLecteur) throws EntityNotFoundException {
		
		// TODO : probabelement du code permettant de vérifier les régles
		// métiers

		lecteurDao.delete(idLecteur);
		
		//TODO : eventuellement du code metier à ajouter

	}

	public void findLecteurByName(String pName) throws EntityNotFoundException {
		// TODO : probabelement du code permettant de vérifier les régles
		// métiers

		lecteurDao.getLecteurByName(pName);
		
		//TODO : eventuellement du code metier à ajouter
	}

	public LecteurDAO getLecteurDao() {
		return lecteurDao;
	}

	public void setLecteurDao(LecteurDAO lecteurDao) {
		this.lecteurDao = lecteurDao;
	}

}
