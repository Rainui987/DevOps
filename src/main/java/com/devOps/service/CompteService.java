package com.devOps.service;

import java.util.List;
import java.util.Optional;

import com.devOps.entity.Compte;



public interface CompteService {
	public Compte SaveOrUpdate(Compte compte);
	public void deleteCompte(Long id);
	public List<Compte>FindAll();
	public Optional<Compte> findCompte(Long id);
}
