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

import java.util.List;
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
        return inscriptionRepository.saveAndFlush(inscription);
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
    public List<Inscription> findAll() {
        log.debug("Request to get all Inscriptions");
        return inscriptionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Inscription> findOne(Long id) {
        log.debug("Request to get Inscription : {}", id);
        return inscriptionRepository.findById(id);
    }

    @Override
    public boolean delete(Long id) {
        log.debug("Request to delete Inscription : {}", id);
        inscriptionRepository.deleteById(id);
        return false;
    }
}
