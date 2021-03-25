package com.pfa.elearning.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class Etudiant extends Utilisateur {

	@Column
	private String niveau;
	
	@Column
	private String diplome;
	
	@ManyToMany(mappedBy = "etudiants")
	private List<Cours> cours;
}
