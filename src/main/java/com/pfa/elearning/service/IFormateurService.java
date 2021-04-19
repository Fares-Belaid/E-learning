package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.FormateurDto;
import com.pfa.elearning.model.Formateur;

public interface IFormateurService {

	FormateurDto save(FormateurDto dto);

	FormateurDto findById(Long id);

	List<FormateurDto> findAll();

	List<Formateur> findBySpecialite(String specialite);

	List<Formateur> findByGrade(String grade);

	void delete(Long id);
}
