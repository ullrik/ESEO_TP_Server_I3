package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBLO;
import com.dto.Ville;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class VilleController {

	@Autowired
	VilleBLO villeService;

	@RequestMapping(value = "/ville", method = RequestMethod.GET)
	@ResponseBody
	public Ville appelGet(@RequestParam(required = false, value = "codePostal") String codePostal) {
		System.out.println("Appel Get");
		System.out.println("codePostal : " + codePostal);
		
		
		return villeService.getInfoVilles();
	}
	
	@RequestMapping(value="/ville", method=RequestMethod.POST)
	@ResponseBody
	public String insert(@RequestBody Ville ville, Model model) {
	//public String insert(@RequestBody String num) {
	    System.out.println("Appel POST");
	    System.out.println("ville Post : " + ville.toString());
 
	    villeService.insertVille(ville);
		return "index";
	}
}
