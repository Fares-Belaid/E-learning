package com.pfa.elearning.service.impl;

import com.pfa.elearning.model.Utilisateur;
import com.pfa.elearning.repository.UtilisateurRepository;
import com.pfa.elearning.service.IUtilisateurService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
public class UtilisateurServiceImpl implements IUtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        log.debug("Request to save Formateur : {}", utilisateur);
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Optional<Utilisateur> partialUpdate(Utilisateur utilisateur) {
        log.debug("Request to partially update Formateur : {}", utilisateur);

        return utilisateurRepository
                .findById(utilisateur.getId())
                .map(
                        existingUtilisateur -> {

                            if (utilisateur.getFirstName() != null) {
                                existingUtilisateur.setFirstName(utilisateur.getFirstName());
                            }
                            if (utilisateur.getLastName() != null) {
                                existingUtilisateur.setLastName(utilisateur.getLastName());
                            }
                            if (utilisateur.getEmail() != null) {
                                existingUtilisateur.setEmail(utilisateur.getEmail());
                            }
                            if (utilisateur.getPassword() != null) {
                                existingUtilisateur.setPassword(utilisateur.getPassword());
                            }
                            if (utilisateur.getRole() != null) {
                                existingUtilisateur.setRole(utilisateur.getRole());
                            }


                            return existingUtilisateur;
                        }
                )
                .map(utilisateurRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Utilisateur> findAll(Pageable pageable) {
        log.debug("Request to get all utilisateurs");
        return utilisateurRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Utilisateur> findOne(Long id) {
        log.debug("Request to get Formateur : {}", id);
        return utilisateurRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Formateur : {}", id);
        utilisateurRepository.deleteById(id);
    }
}
