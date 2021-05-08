package com.pfa.elearning.controller;

import com.pfa.elearning.model.Avis;
import com.pfa.elearning.model.Utilisateur;
import com.pfa.elearning.service.IAvisService;
import com.pfa.elearning.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
    @Autowired
    private IUtilisateurService utilisateurService;


    @GetMapping("/")
    @ResponseBody
    public Page<Utilisateur> getAllUtilisateur(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size){
        return utilisateurService.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/find")
    public Optional<Utilisateur> getUtilisateur(@RequestParam Long id) {
        return utilisateurService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteUtilisateur(@RequestParam Long id) {

        return utilisateurService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Utilisateur> updateUtilisateur(@RequestBody  Utilisateur utilisateur) {

        return utilisateurService.partialUpdate(utilisateur);
    }
}
