package com.pfa.elearning.controller;

import com.pfa.elearning.model.Avis;
import com.pfa.elearning.service.IAvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/avis")
public class AvisController {

    @Autowired
    private IAvisService avisService;


    @GetMapping("/")
    @ResponseBody
    public List<Avis> getAllAvis(){
        return avisService.findAll();
    }

    @GetMapping("/find")
    public Optional<Avis> getAvis(@RequestParam Long id) {
        return avisService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Avis addAvis(@RequestBody Avis avis) {
        return avisService.save(avis);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteAvis(@RequestParam Long id) {

        return avisService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Avis> updateAvis(@RequestBody  Avis avis) {

        return avisService.partialUpdate(avis);
    }
}
