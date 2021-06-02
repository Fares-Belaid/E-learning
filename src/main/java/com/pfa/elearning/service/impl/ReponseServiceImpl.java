package com.pfa.elearning.service.impl;

import com.pfa.elearning.model.Reponse;
import com.pfa.elearning.repository.ReponseRepository;
import com.pfa.elearning.service.IReponseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ReponseServiceImpl implements IReponseService {

    private final Logger log = LoggerFactory.getLogger(ReponseServiceImpl.class);

    @Autowired
    private ReponseRepository reponseRepository;

    @Override
    public Reponse save(Reponse reponse) {
        log.debug("Request to save Solution : {}", reponse);
        return reponseRepository.saveAndFlush(reponse);    }

    @Override
    public Optional<Reponse> findById(Long id) {
        log.debug("Request to get Solution : {}", id);
        return reponseRepository.findById(id);
    }

    @Override
    public List<Reponse> findAll() {
        log.debug("Request to get all Solutions");
        return reponseRepository.findAll();
    }


    @Override
    public boolean delete(Long id) {
        log.debug("Request to delete Solution : {}", id);
        reponseRepository.deleteById(id);
        return false;
    }

    @Override
    public Optional<Reponse> partialUpdate(Reponse reponse) {
        log.debug("Request to partially update Solution : {}", reponse);

        return reponseRepository
                .findById(reponse.getIdReponse())
                .map(
                        existingReponse -> {
                            if (reponse.getCorrection() != null) {
                                existingReponse.setCorrection(reponse.getCorrection());
                            }

                            return existingReponse;
                        }
                )
                .map(reponseRepository::save);
    }
}
