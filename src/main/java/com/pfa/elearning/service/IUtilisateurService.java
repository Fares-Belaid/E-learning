package com.pfa.elearning.service;

import com.pfa.elearning.model.Utilisateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IUtilisateurService {

    Utilisateur save(Utilisateur utilisateur);

    Optional<Utilisateur> partialUpdate(Utilisateur utilisateur);

    List<Utilisateur> findAll();

    Optional<Utilisateur> findOne(Long id);

    boolean delete(Long id);
}
