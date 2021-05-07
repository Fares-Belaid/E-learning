package com.pfa.elearning.service.impl;

import com.pfa.elearning.model.Module;
import com.pfa.elearning.repository.ModuleRepository;
import com.pfa.elearning.service.IModuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
public class ModuleServiceImpl implements IModuleService {

    private final ModuleRepository moduleRepository;

    public ModuleServiceImpl(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public Module save(Module module) {
        log.debug("Request to save Module : {}", module);
        return moduleRepository.save(module);
    }

    @Override
    public Optional<Module> partialUpdate(Module module) {
        log.debug("Request to partially update Module : {}", module);

        return moduleRepository
                .findById(module.getId())
                .map(
                        existingModule -> {
                            if (module.getName() != null) {
                                existingModule.setName(module.getName());
                            }
                            if (module.getDescription() != null) {
                                existingModule.setDescription(module.getDescription());
                            }
                            if (module.getImage() != null) {
                                existingModule.setImage(module.getImage());
                            }
                            if (module.getImageContentType() != null) {
                                existingModule.setImageContentType(module.getImageContentType());
                            }
                            if (module.getPdf() != null) {
                                existingModule.setPdf(module.getPdf());
                            }
                            if (module.getPdfContentType() != null) {
                                existingModule.setPdfContentType(module.getPdfContentType());
                            }

                            return existingModule;
                        }
                )
                .map(moduleRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Module> findAll(Pageable pageable) {
        log.debug("Request to get all Modules");
        return moduleRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Module> findOne(Long id) {
        log.debug("Request to get Module : {}", id);
        return moduleRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Module : {}", id);
        moduleRepository.deleteById(id);
    }
}
