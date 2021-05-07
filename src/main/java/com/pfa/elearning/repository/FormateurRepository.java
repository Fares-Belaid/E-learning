package com.pfa.elearning.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Formateur;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Long> {

	Optional<Formateur> findBySpecialite(String specialite);

	Optional<Formateur> findByGrade(String grade);

}
