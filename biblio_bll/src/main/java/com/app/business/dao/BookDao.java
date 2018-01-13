package com.app.business.dao;

import java.util.List;

import com.app.business.bo.Book;
import com.app.business.bo.Rayon;
import com.genericdao.api.GenericDao;

/**
 * 
 * 
 * Interface du  DAO associe a l'entité metier Book. Cette Interface herite la majorite de ses
 * fonctionnalites du DAO Generic
 * 
 * @author Boudaa
 *
 */
public interface BookDao extends GenericDao<Book, Long> {

	/**
	 * Ci-dessous les methodes specifiques a ce DAO et ne sont pas definies
	 * dans generic DAO (car elles n'ont pas un caractere generiques, elles sont
	 * specifiques aux livres)
	 */

	public List<Book> getBookByTitle(String pTitle);

	public Rayon getRayonByNom(String rayon);
}
