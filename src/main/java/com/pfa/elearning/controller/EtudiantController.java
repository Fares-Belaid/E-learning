package com.pfa.elearning.controller;

import com.pfa.elearning.model.Avis;
import com.pfa.elearning.model.Etudiant;
import com.pfa.elearning.service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    private IEtudiantService etudiantService;


    @GetMapping("/")
    @ResponseBody
    public Page<Etudiant> getAllEtudiants(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size){
        return etudiantService.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/find")
    public Optional<Etudiant> getEtudiant(@RequestParam Long id) {
        return etudiantService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.save(etudiant);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteEtudiant(@RequestParam Long id) {

        return etudiantService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Etudiant> updateAvis(@RequestBody  Etudiant etudiant) {

        return etudiantService.partialUpdate(etudiant);
    }
}
