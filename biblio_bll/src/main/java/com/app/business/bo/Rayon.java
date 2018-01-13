package com.app.business.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Permet de definir un rayon dans la bibliotheque
 * 
 * @author BOUDAA
 *
 */
@Entity
public class Rayon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idRayon;

	private String nom;
	
	
	@OneToMany
	@JoinColumn( name = "IDRAYON" )
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Theme> themes;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public Long getIdRayon() {
		return idRayon;
	}

	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
	}

}
