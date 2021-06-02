package com.pfa.elearning.controller;

import com.pfa.elearning.model.Avis;
import com.pfa.elearning.model.Etudiant;
import com.pfa.elearning.service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    private IEtudiantService etudiantService;


    @GetMapping("/")
    @ResponseBody
    public List<Etudiant> getAllEtudiants(){
        return etudiantService.findAll();
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
