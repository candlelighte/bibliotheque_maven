package com.genericdao.api;

import java.util.List;

import com.genericdao.common.EntityNotFoundException;

/**
 * Generic DAO (Data Access Object) definie les methodes CRUD communes a tous
 * les DAOs
 * 
 * @author <a href="mailto:tarik.boudaa@gmail.com">T.BOUDAA Ecole Nationale des Sciences Appliquees </a>
 * 
 * @param <T>
 *            le type de l'objet métier manipulé
 * @param <PK>
 *            le type utilisé pour la clé primaire de l'objet métier
 */
public interface GenericDao<T, PK> {

	/**
	 * Methode generique pour sauvgarder un objet metier
	 * 
	 * @param pObject
	 *            l'obhet a sauvgarder
	 * 
	 * @return l'objet persistant
	 */
	T create(T pObject);

	/**
	 * Methode generique pour supprimer un objet en connaissant son identifiant
	 * 
	 * @param pId
	 *            l'identifiant (cle primaire) de l'objet a supprimer
	 * @throws EntityNotFoundException 
	 */
	void delete(PK pId) throws EntityNotFoundException;

	/**
	 * Methode generique pour mettre a jour un objet modifie en dehors de la
	 * session
	 * 
	 * @param pObject
	 *            nouvelle version de l'objet
	 */
	void update(T pObject);

	/**
	 * Méthode générique permetant de récupérer tous les objets d'un type donné
	 * 
	 * @return liste des objets
	 */
	List<T> getAll();

	/**
	 * Méthode générique permetant de récupérer tous les objets d'un type donné
	 * 
	 * @param maxResult
	 *            nombre maximal des résultats
	 * @return liste des objets
	 */

	List<T> getAll(int maxResults);

	/**
	 * Méthode générique permetant de récupérer tous les objets d'un type donné,
	 * sans avoir des doublants
	 * <p>
	 * Noter que pour cette méthode fonctionne correctement, les objets métiers
	 * doivent avoir des méthodes equalset hashCode correctement définies
	 * </p>
	 * 
	 * @return liste des objets
	 */
	List<T> getAllDistinct();

	/**
	 * Méthode générique permetant de récupérer tous les objets d'un type donné
	 * sans avoir des doublants et avec limitation du nombre des résultats
	 * <p>
	 * Noter que pour cette méthode fonctionne correctement, les objets métiers
	 * doivent avoir des méthodes equalset hashCode correctement définies
	 * </p>
	 * 
	 * @param maxResult
	 *            nombre maximal des résultats
	 * @return liste des objets
	 */
	List<T> getAllDistinct(int maxResults);

	/**
	 * Méthode générique pour obtenir un objet par son identifiant, une
	 * exception de type ObjectRetrievalFailureException sera levée si l'objet
	 * est intouvable
	 * 
	 * @param pId
	 *            l'identifiant de l'objet
	 * @return l'objet recherché
	 * @throws EntityNotFoundException
	 *             si aucun objet n'est trouvé
	 */
	T findById(PK pId) throws EntityNotFoundException;

	/**
	 * Vérifie si un objet, de type T et identifiant pId, existe
	 * 
	 * @param pId
	 *            identifiant de l'objet
	 * @return true si un objet existe, fase sinon
	 */
	boolean exists(PK pId);

	/**
	 * retourne une entité par la valeur d'une colonne
	 * 
	 * @param pColumnName
	 *            le nom de la colonne
	 * @param pValue
	 *            la valeur de la colonne sur laquelle il faut faire la
	 *            selection
	 * @return l'entité recherchée
	 */
	List<T> getEntityByColumn(String pClassName, String pColumnName, String pValue);
}