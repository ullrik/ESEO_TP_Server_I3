package com.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ville {
	@JsonProperty("codeCommune")
	public String codeCommune;
	@JsonProperty("nomCommune")
	public String nomCommune;
	@JsonProperty("codePostal")
	public String codePostal;
	@JsonProperty("libelleAcheminement")
	public String libelleAcheminement;
	@JsonProperty("ligne")
	public String ligne;
	@JsonProperty("coordonnee")
	public Coordonnee coordonnee;

}
