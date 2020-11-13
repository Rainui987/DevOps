package com.devOps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devOps.entity.Utilisateur;
import com.devOps.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImple implements UtilisateurService{
	@Autowired
	UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur SaveOrUpdate(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void deleteUtilisateur(Long id) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(id);
	}

	@Override
	public List<Utilisateur> FindAll() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Optional<Utilisateur> findUtilisateur(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id);
		
}

	@Override
	public void delete(Utilisateur utilisateur) {
		utilisateurRepository.delete(utilisateur);
		
	}

//	@Override
	public Optional<Utilisateur> findOne(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id);
		
	}
}