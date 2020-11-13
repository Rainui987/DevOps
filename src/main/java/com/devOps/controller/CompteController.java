package com.devOps.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.devOps.entity.Compte;
import com.devOps.service.CompteService;



@RestController
@CrossOrigin
@RequestMapping("/Compte")
public class CompteController {
@Autowired
CompteService CompteService;
@RequestMapping(value="/save",method=RequestMethod.POST)
public Compte SaveOrUpdate(@RequestBody Compte Compte) {
	return CompteService.SaveOrUpdate(Compte);
}
@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
public void deleteCompte(@PathVariable("id") Long id) {
	// TODO Auto-generated method stub
	CompteService.deleteCompte(id);
}

@RequestMapping(value="/Comptes",method=RequestMethod.GET)
public List<Compte> FindAll() {
	// TODO Auto-generated method stub
	return CompteService.FindAll();
}

@RequestMapping(value="/findOne",method=RequestMethod.GET)
public Optional<Compte> findCompte(@PathParam("id") Long id) {//http://localhost:8080/Compte/findOne?id=3 pour utiliser il faut ?=id
	// TODO Auto-generated method stub
	return CompteService.findCompte(id);
}
}
