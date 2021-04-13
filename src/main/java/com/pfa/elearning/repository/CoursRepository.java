package com.pfa.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {

	
}
