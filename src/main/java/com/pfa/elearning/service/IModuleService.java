package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Module;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IModuleService {

	Module save(Module module);

	Optional<Module> partialUpdate(Module module);

	Page<Module> findAll(Pageable pageable);

	Optional<Module> findOne(Long id);

	void delete(Long id);
}
