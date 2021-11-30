package com.dao;

import org.springframework.stereotype.Repository;

import com.dto.Ville;

@Repository
public class VilleDAOImpl implements VilleDAO{

	@Override
	public Ville findVille() {
		Ville villeTmp = new Ville();
		villeTmp.setCodeCommune("plop");
		villeTmp.setNomCommune("plop");
		return villeTmp;
	}
	
	@Override
	public Ville saveVille(Ville ville) {
		Ville villeTmp = new Ville();
		villeTmp.setCodeCommune("plop");
		villeTmp.setNomCommune("plop");
		return villeTmp;
	}
}
