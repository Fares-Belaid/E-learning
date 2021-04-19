package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.CoursDto;
import com.pfa.elearning.dto.EtudiantDto;
import com.pfa.elearning.model.Cours;
import com.pfa.elearning.model.Etudiant;

public interface IEtudiantService {

	EtudiantDto save(EtudiantDto dto);
	
	EtudiantDto findById(Long id);
	
	List<EtudiantDto> findAll();
	
	List<EtudiantDto> getEtudiantByCours(CoursDto dto);
	
	List<Etudiant> getEtudiantByCours(Cours cours);
	
	void delete(Long id);
}
