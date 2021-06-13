package com.pfa.elearning.service.impl;

import com.pfa.elearning.model.Formateur;
import com.pfa.elearning.repository.FormateurRepository;
import com.pfa.elearning.service.IFormateurService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FormateurServiceImpl implements IFormateurService {
    private final FormateurRepository formateurRepository;

    @Autowired
    public FormateurServiceImpl(FormateurRepository formateurRepository) {
        this.formateurRepository = formateurRepository;
    }

    @Override
    public Formateur save(Formateur formateur) {
        log.debug("Request to save Formateur : {}", formateur);
        return formateurRepository.save(formateur);
    }

    @Override
    public Optional<Formateur> partialUpdate(Formateur formateur) {
        log.debug("Request to partially update Formateur : {}", formateur);

        return formateurRepository
                .findById(formateur.getId())
                .map(
                        existingFormateur -> {

                            if (formateur.getFirstName() != null) {
                                existingFormateur.setFirstName(formateur.getFirstName());
                            }
                            if (formateur.getLastName() != null) {
                                existingFormateur.setLastName(formateur.getLastName());
                            }
                            if (formateur.getEmail() != null) {
                                existingFormateur.setEmail(formateur.getEmail());
                            }
                            if (formateur.getPassword() != null) {
                                existingFormateur.setPassword(formateur.getPassword());
                            }
                            if (formateur.getRole() != null) {
                                existingFormateur.setRole(formateur.getRole());
                            }
                            if (formateur.getGrade() != null) {
                                existingFormateur.setGrade(formateur.getGrade());
                            }
                            if (formateur.getSpecialite() != null) {
                                existingFormateur.setSpecialite(formateur.getSpecialite());
                            }

                            return existingFormateur;
                        }
                )
                .map(formateurRepository::save);
    }

    @Override
    public List<Formateur> findAll() {
        log.debug("Request to get all Formateurs");
        return formateurRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Formateur> findOne(Long id) {
        log.debug("Request to get Formateur : {}", id);
        return formateurRepository.findById(id);
    }

    @Override
    public boolean delete(Long id) {
        log.debug("Request to delete Formateur : {}", id);
        formateurRepository.deleteById(id);
        return false;
    }

}
