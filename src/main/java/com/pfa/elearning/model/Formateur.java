package com.pfa.elearning.model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
public class Formateur extends Utilisateur{

	@Column
	private String grade;
	
	@Column
	private String specialite;
	
	@OneToMany(mappedBy = "formateur")
	List<Cours> cours;
}
