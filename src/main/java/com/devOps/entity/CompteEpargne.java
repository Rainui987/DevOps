package com.devOps.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CompteEpargne")
public class CompteEpargne extends Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double taux;



	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(Date dateCreation, double solde, Utilisateur user) {
		super(dateCreation, solde, user);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(Long idCompte, Date dateCreation, double solde, Utilisateur user) {
		super(idCompte, dateCreation, solde, user);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
