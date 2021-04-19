package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.CoursDto;

public interface ICoursService {

	CoursDto save(CoursDto dto);

	CoursDto findById(Long id);

	List<CoursDto> findAll();

	List<CoursDto> findByCategorie(String categorie);

	List<CoursDto> findByTitre(String titreCours);

	void delete(Long id);
}
