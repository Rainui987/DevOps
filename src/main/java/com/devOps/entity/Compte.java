package com.devOps.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
@Entity
@Table(name="COMPTE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE",discriminatorType = DiscriminatorType.STRING,length=25)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY, property="type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=CompteEpargne.class,name="CompteEpargne"),
	@JsonSubTypes.Type(value=CompteCourant.class,name="CompteCourant"),

})
	
public class Compte implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ID_COMPTE")
private Long idCompte ;
@Column(name="DATE_CREATION")
private Date dateCreation;
@Column(name="SOLDE")
private double solde;
@JsonBackReference
@ManyToOne(cascade=CascadeType.REMOVE,fetch = FetchType.LAZY)
@JoinColumn(name="FK_UTILISATEUR",referencedColumnName = "ID_UTILISATEUR")
private Utilisateur user;

public Compte() {
}



public Compte(Long idCompte, Date dateCreation, double solde, Utilisateur user) {
	super();
	this.idCompte = idCompte;
	this.dateCreation = dateCreation;
	this.solde = solde;
	this.user = user;
}



public Compte(Date dateCreation, double solde, Utilisateur user) {
	super();
	this.dateCreation = dateCreation;
	this.solde = solde;
	this.user = user;
}



public Long getIdCompte() {
	return idCompte;
}

public void setIdCompte(Long idCompte) {
	this.idCompte = idCompte;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}

public double getSolde() {
	return solde;
}

public void setSolde(double solde) {
	this.solde = solde;
}

@JsonGetter
public Utilisateur getUser() {
	return user;
}


@JsonSetter
public void setUser(Utilisateur user) {
	this.user = user;
}



public static long getSerialversionuid() {
	return serialVersionUID;
}



@Override
public String toString() {
	return "Compte [idCompte=" + idCompte + ", dateCreation=" + dateCreation + ", solde=" + solde + "]";
}




}
