package com.pfa.elearning.service.impl;

import com.pfa.elearning.model.Inscription;
import com.pfa.elearning.repository.InscriptionRepository;
import com.pfa.elearning.service.IInscriptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
public class InscriptionServiceImpl implements IInscriptionService {


    private final InscriptionRepository inscriptionRepository;

    @Autowired
    public InscriptionServiceImpl(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    @Override
    public Inscription save(Inscription inscription) {
        log.debug("Request to save Inscription : {}", inscription);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Optional<Inscription> partialUpdate(Inscription inscription) {
        log.debug("Request to partially update Inscription : {}", inscription);

        return inscriptionRepository
                .findById(inscription.getId())
                .map(
                        existingInscription -> {
                            if (inscription.getDateInscri() != null) {
                                existingInscription.setDateInscri(inscription.getDateInscri());
                            }

                            return existingInscription;
                        }
                )
                .map(inscriptionRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Inscription> findAll(Pageable pageable) {
        log.debug("Request to get all Inscriptions");
        return inscriptionRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Inscription> findOne(Long id) {
        log.debug("Request to get Inscription : {}", id);
        return inscriptionRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Inscription : {}", id);
        inscriptionRepository.deleteById(id);
    }
}
