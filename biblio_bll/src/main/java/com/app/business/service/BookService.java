package com.app.business.service;

import java.util.List;
import java.util.Map;

import com.app.business.bo.Book;
import com.app.business.bo.Rayon;
import com.app.business.bo.Theme;
import com.genericdao.common.EntityNotFoundException;

/**
 * 
 * Interface du Service metier permettant de gerer les livres
 * 
 * @author boudaa
 *
 */
public interface BookService {

	/** Enregistrer un livre */
	public void addNewBook(Book pBook);

	/** recupere la liste des livres */
	public List<Book> getAllBooks();

	/** recupere des donnees statistiques sur les livres */
	public Map<String, Number> getBooksStat();

	/** recherche un livre par son titre */
	public List<Book> finBookByTitle(String pTitle);

	/**
	 * recherche un livre par son identifiant
	 * 
	 * @throws EntityNotFoundException
	 */
	public Book finBookById(Long idBook) throws EntityNotFoundException;

	/** recupere la liste des rayons */
	public List<Rayon> getAllRayons();

	/** recupere la liste des themes */
	public List<Theme> getAllThemes();

	/** recherche un theme par son nom */
	public Theme getThemeByNom(String pTheme);

	/** recherche un rayon par son nom */
	public Rayon getRayonByNom(String pRayon);

	/** recupere la liste des theme associes a un rayon */
	public List<String> getThemeOfRayon(String rayon);

	/** mise a jour des informations d'un livre*/
	public void updateBook(Book pBook) ;

	
	
	/** supprime un livre de la base de données 
	 * @throws EntityNotFoundException */
	public void deleteBook(Long pId) throws EntityNotFoundException;
}
