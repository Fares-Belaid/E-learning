package com.pfa.elearning.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idModule;
	
	@Column
	private String nom;
	
	@Column
	private String description;
	
}
