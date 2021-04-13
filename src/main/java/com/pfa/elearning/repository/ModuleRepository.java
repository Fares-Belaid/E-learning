package com.pfa.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

}
