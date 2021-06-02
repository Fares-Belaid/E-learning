package com.pfa.elearning.controller;

import com.pfa.elearning.model.Reponse;
import com.pfa.elearning.service.IReponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reponse")
public class ReponseController {
    @Autowired
    private IReponseService reponseService ;


    @GetMapping("/")
    @ResponseBody
    public List<Reponse> getAllReponse(){
        return reponseService.findAll();
    }

    @GetMapping("/find")
    public Optional<Reponse> getReponse(@RequestParam Long id) {
        return reponseService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Reponse addReponse(@RequestBody Reponse reponse) {
        return reponseService.save(reponse);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteReponse(@RequestParam Long id) {

        return reponseService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Reponse> updateReponse(@RequestBody  Reponse reponse) {

        return reponseService.partialUpdate(reponse);
    }
}
