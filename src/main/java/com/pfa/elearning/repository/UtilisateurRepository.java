package com.pfa.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
