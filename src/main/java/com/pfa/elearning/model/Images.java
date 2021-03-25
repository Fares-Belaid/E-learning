package com.pfa.elearning.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Images {

	@Column
	private Long idImage;
	
	@Column
	private String image;
	
	@OneToMany(mappedBy = "images")
	List<Cours> cours;
}
