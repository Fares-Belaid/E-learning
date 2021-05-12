package com.pfa.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Utilisateur;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

   Optional <Utilisateur> findByEmail(String email);
}
