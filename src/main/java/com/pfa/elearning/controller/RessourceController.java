package com.pfa.elearning.controller;

import com.pfa.elearning.model.Avis;
import com.pfa.elearning.model.Ressources;
import com.pfa.elearning.service.IAvisService;
import com.pfa.elearning.service.IRessourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ressource")
public class RessourceController {

    @Autowired
    private IRessourceService ressourceService;


    @GetMapping("/")
    @ResponseBody
    public List<Ressources> getAllAvis(){
        return ressourceService.findAll();
    }

    @GetMapping("/find")
    public Optional<Ressources> getRessources(@RequestParam Long id) {
        return ressourceService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Ressources addRessources(@RequestBody Ressources ressources) {
        return ressourceService.save(ressources);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteRessources(@RequestParam Long id) {

        return ressourceService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Ressources> updateRessources(@RequestBody  Ressources ressources) {

        return ressourceService.partialUpdate(ressources);
    }
}
