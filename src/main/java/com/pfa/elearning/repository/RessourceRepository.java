package com.pfa.elearning.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Cours;
import com.pfa.elearning.model.Ressources;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourceRepository extends JpaRepository<Ressources, Long> {

}
