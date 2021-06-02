package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Module;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IModuleService {

	Module save(Module module);

	Optional<Module> partialUpdate(Module module);

	List<Module> findAll();

	Optional<Module> findOne(Long id);

	boolean delete(Long id);
}
