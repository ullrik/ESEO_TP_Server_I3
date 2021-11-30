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
public class Coordonnee {
	@JsonProperty("latitude")
	public String latitude;
	@JsonProperty("longitude")
	public String longitude;
}
