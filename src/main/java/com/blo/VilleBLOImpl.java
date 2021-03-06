package com.blo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDAO;
import com.dto.Ville;

@Service
public class VilleBLOImpl implements VilleBLO {

	@Autowired
	private VilleDAO villeDAO;

	@Override
	public Ville getInfoVilles() {
		// code metier
		Ville ville = villeDAO.findVille();
		return ville;
	}
	
	@Override
	public Ville insertVille(Ville ville) {
		// code metier
		Ville villeTmp = villeDAO.saveVille(ville);
		return villeTmp;
	}

}
