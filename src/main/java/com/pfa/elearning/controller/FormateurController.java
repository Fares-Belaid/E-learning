package com.pfa.elearning.controller;

import com.pfa.elearning.model.Avis;
import com.pfa.elearning.model.Formateur;
import com.pfa.elearning.service.IAvisService;
import com.pfa.elearning.service.IFormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/formateur")
public class FormateurController {

    @Autowired
    private IFormateurService formateurService ;

    @GetMapping("/")
    @ResponseBody
    public Page<Formateur> getAllFormateur(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size){
        return formateurService.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/find")
    public Optional<Formateur> getFormateur(@RequestParam Long id) {
        return formateurService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Formateur addFormateur(@RequestBody Formateur formateur) {
        return formateurService.save(formateur);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteFormateur(@RequestParam Long id) {

        return formateurService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Formateur> updateAvis(@RequestBody Formateur formateur) {

        return formateurService.partialUpdate(formateur);
    }
}
