package com.pfa.elearning.service;

import com.pfa.elearning.model.Inscription;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IInscriptionService {

    Inscription save(Inscription inscription);

    Optional<Inscription> partialUpdate(Inscription inscription);

    Page<Inscription> findAll(Pageable pageable);

    Optional<Inscription> findOne(Long id);

    boolean delete(Long id);
}
