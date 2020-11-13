package com.devOps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devOps.entity.Compte;
import com.devOps.repository.CompteRepository;



@Service
public class CompteServiceImp implements CompteService{
@Autowired
CompteRepository compteRepository;

@Override
public Compte SaveOrUpdate(Compte compte) {
	// TODO Auto-generated method stub
	return compteRepository.save(compte);
}

@Override
public void deleteCompte(Long id) {
	// TODO Auto-generated method stub
	compteRepository.deleteById(id);
}

@Override
public List<Compte> FindAll() {
	// TODO Auto-generated method stub
	return compteRepository.findAll();
}

@Override
public Optional<Compte> findCompte(Long id) { 
	// TODO Auto-generated method stub
	return compteRepository.findById(id);
}

}
