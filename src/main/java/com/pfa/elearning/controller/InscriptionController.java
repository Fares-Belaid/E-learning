package com.pfa.elearning.controller;

import com.pfa.elearning.model.Inscription;
import com.pfa.elearning.service.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/inscription")
public class InscriptionController {

    @Autowired
    private IInscriptionService inscriptionService ;


    @GetMapping("/")
    @ResponseBody
    public List<Inscription> getAllInscriptions(){
        return inscriptionService.findAll();
    }

    @GetMapping("/find")
    public Optional<Inscription> getInscription(@RequestParam Long id) {
        return inscriptionService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Inscription addInscription(@RequestBody Inscription inscription) {
        return inscriptionService.save(inscription);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteInscription(@RequestParam Long id) {

        return inscriptionService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Inscription> updateInscription(@RequestBody  Inscription inscription) {

        return inscriptionService.partialUpdate(inscription);
    }
}
