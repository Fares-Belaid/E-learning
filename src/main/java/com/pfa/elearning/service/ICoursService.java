package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Cours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICoursService {

	Cours save(Cours cours);

	Optional<Cours> partialUpdate(Cours cours);

	List<Cours> findAll();

	Optional<Cours> findOne(Long id);

	boolean delete(Long id);
}
