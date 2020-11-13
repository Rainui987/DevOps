package com.devOps.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CompteCourant")
public class CompteCourant extends Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double decouvert;



	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(Date dateCreation, double solde, Utilisateur user) {
		super(dateCreation, solde, user);
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(Long idCompte, Date dateCreation, double solde, Utilisateur user) {
		super(idCompte, dateCreation, solde, user);
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
