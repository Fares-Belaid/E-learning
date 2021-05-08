package com.pfa.elearning.controller;

import com.pfa.elearning.model.Module;
import com.pfa.elearning.service.IModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/module")
public class ModuleController {
    @Autowired
    private IModuleService moduleService ;


    @GetMapping("/")
    @ResponseBody
    public Page<Module> getAllModule(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size){
        return moduleService.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/find")
    public Optional<Module> getModule(@RequestParam Long id) {
        return moduleService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Module addModule(@RequestBody Module module) {
        return moduleService.save(module);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteModule(@RequestParam Long id) {

        return moduleService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Module> updateModule(@RequestBody  Module module) {

        return moduleService.partialUpdate(module);
    }
}
