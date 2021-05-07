package com.pfa.elearning.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Cours;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {

	Optional<Cours> findByCategorie(String categorie);

	Optional<Cours> findByTitre(String titreCours);

}
