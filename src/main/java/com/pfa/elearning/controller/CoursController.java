package com.pfa.elearning.controller;

import com.pfa.elearning.model.Avis;
import com.pfa.elearning.model.Cours;
import com.pfa.elearning.service.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cours")
public class CoursController {

    @Autowired
    private ICoursService coursService;


    @GetMapping("/")
    @ResponseBody
    public Page<Cours> getAllCours(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size){
        return coursService.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/find")
    public Optional<Cours> getCours(@RequestParam Long id) {
        return coursService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Cours addCours(@RequestBody Cours cours) {

        return coursService.save(cours);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteCours(@RequestParam Long id) {

        return coursService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Cours> updateAvis(@RequestBody  Cours cours) {

        return coursService.partialUpdate(cours);
    }
}
