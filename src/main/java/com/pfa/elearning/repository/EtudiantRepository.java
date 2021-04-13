package com.pfa.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
