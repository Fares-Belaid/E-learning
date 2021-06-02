package com.pfa.elearning.controller;

import com.pfa.elearning.model.Reclamation;
import com.pfa.elearning.service.IReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reclamation")
public class ReclamationController {
    @Autowired
    private IReclamationService reclamationService ;


    @GetMapping("/")
    @ResponseBody
    public List<Reclamation> getAllReclamations(){
        return reclamationService.findAll();
    }

    @GetMapping("/find")
    public Optional<Reclamation> getReclamation(@RequestParam Long id) {
        return reclamationService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Reclamation addReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.save(reclamation);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteReclamation(@RequestParam Long id) {

        return reclamationService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Reclamation> updateReclamation(@RequestBody  Reclamation reclamation) {

        return reclamationService.partialUpdate(reclamation);
    }
}
