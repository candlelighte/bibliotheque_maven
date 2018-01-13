package com.web;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.business.bo.Lecteur;
import com.app.business.service.LecteurService;


@ResultPath("/pages/")
@Results({
	  @Result(name="error", location="/pages/error.jsp"),
	  @Result(name="showSearchForm", location="/pages/showSearchForm.jsp")
	})
public class LecteurAction extends BaseAction {

	private Lecteur lecteur;

	@Autowired
	private LecteurService lecteurService;

	@Action(value = "addLecteur", results = { @Result(name = "success", type="redirect", location = "listAction") })
	public String addLecteur() {

		lecteurService.addLecteur(lecteur);

		return SUCCESS;
	}

	public Lecteur getLecteur() {
		return lecteur;
	}

	public void setLecteur(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public LecteurService getLecteurService() {
		return lecteurService;
	}

	public void setLecteurService(LecteurService lecteurService) {
		this.lecteurService = lecteurService;
	}

}
