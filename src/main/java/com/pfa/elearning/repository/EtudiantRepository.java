package com.pfa.elearning.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Cours;
import com.pfa.elearning.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

	Optional<Etudiant> findByNiveau(String niveau);

	Optional<Etudiant> getEtudiantByCours(Cours cours);

}
