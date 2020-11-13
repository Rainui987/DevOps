package com.devOps.service;

import java.util.List;
import java.util.Optional;

import com.devOps.entity.Utilisateur;

public interface UtilisateurService {
	
	public Utilisateur SaveOrUpdate(Utilisateur utilisateur);
	public void deleteUtilisateur(Long id);
	public List<Utilisateur>FindAll();
	public Optional<Utilisateur> findUtilisateur(Long id);
	public Optional<Utilisateur> findOne(Long id);
	public void delete(Utilisateur utilisateur);
}
