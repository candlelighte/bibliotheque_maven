package com.app.business.service;

import com.app.business.bo.Lecteur;
import com.genericdao.common.EntityNotFoundException;

public interface LecteurService {

	public void addLecteur(Lecteur pLecteur);

	public void deleteLecteur(Long idLecteur) throws EntityNotFoundException;

	public void findLecteurByName(String pName) throws EntityNotFoundException;

}
