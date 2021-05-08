package com.pfa.elearning.service.impl;

import com.pfa.elearning.model.Etudiant;
import com.pfa.elearning.repository.EtudiantRepository;
import com.pfa.elearning.service.IEtudiantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
public class EtudiantServiceImpl implements IEtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public Etudiant save(Etudiant etudiant) {
        log.debug("Request to save Etudiant : {}", etudiant);
        return etudiantRepository.saveAndFlush(etudiant);
    }

    @Override
    public Optional<Etudiant> partialUpdate(Etudiant etudiant) {
        log.debug("Request to partially update Etudiant : {}", etudiant);

        return etudiantRepository
                .findById(etudiant.getId())
                .map(
                        existingEtudiant -> {
                            if (etudiant.getFirstName() != null) {
                                existingEtudiant.setFirstName(etudiant.getFirstName());
                            }
                            if (etudiant.getLastName() != null) {
                                existingEtudiant.setLastName(etudiant.getLastName());
                            }
                            if (etudiant.getEmail() != null) {
                                existingEtudiant.setEmail(etudiant.getEmail());
                            }
                            if (etudiant.getPassword() != null) {
                                existingEtudiant.setPassword(etudiant.getPassword());
                            }
                            if (etudiant.getRole() != null) {
                                existingEtudiant.setRole(etudiant.getRole());
                            }
                            if (etudiant.getFirstName() != null) {
                                existingEtudiant.setNiveau(etudiant.getNiveau());
                            }

                            return existingEtudiant;
                        }
                )
                .map(etudiantRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Etudiant> findAll(Pageable pageable) {
        log.debug("Request to get all Etudiants");
        return etudiantRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Etudiant> findOne(Long id) {
        log.debug("Request to get Etudiant : {}", id);
        return etudiantRepository.findById(id);
    }

    @Override
    public boolean delete(Long id) {
        log.debug("Request to delete Etudiant : {}", id);
        etudiantRepository.deleteById(id);
        return false;
    }
}
