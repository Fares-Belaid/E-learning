package com.pfa.elearning.dto;

import java.util.List;

import javax.persistence.Column;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {

	private String nom;

	@Column
	private String email;

	@Column
	private String password;

	@Column
	private String photo;

	@Column
	private String role;

	private List<ReclamationDto> reclamations;
}
