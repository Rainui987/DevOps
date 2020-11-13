package com.devOps.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devOps.entity.Utilisateur;
import com.devOps.service.UtilisateurService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UtilisateurController {
	@Autowired
	UtilisateurService utilisateurService;
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Utilisateur SaveOrUpdate(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.SaveOrUpdate(utilisateur);
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		utilisateurService.deleteUtilisateur(id);
	}

	@RequestMapping(value="/utilisateurs" ,method=RequestMethod.GET)
	public List<Utilisateur> FindAll() {
		// TODO Auto-generated method stub
		return utilisateurService.FindAll();
	}

//	@RequestMapping(value="/findOne",method=RequestMethod.GET)
//		public Optional<Utilisateur> findUtilisateur(@PathParam("id") Long id) {
		@RequestMapping(value="/findOne/{id}",method=RequestMethod.GET)
		public Optional<Utilisateur> findUtilisateur(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		return utilisateurService.findUtilisateur(id);
	}
		@RequestMapping(value="/delete2",method=RequestMethod.DELETE)
	public void delete(@RequestBody Utilisateur utilisateur) {
		utilisateurService.delete(utilisateur);
	
	}
	 
		public Utilisateur update(@PathVariable Long id,@RequestBody Utilisateur utilisateur) {
		Utilisateur currentUser=utilisateurService.findOne(id).get();
		currentUser.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUser.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		return utilisateurService.SaveOrUpdate(currentUser);
		}
		
	}

