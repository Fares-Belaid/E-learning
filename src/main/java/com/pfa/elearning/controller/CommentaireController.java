package com.pfa.elearning.controller;


import com.pfa.elearning.model.Commentaire;
import com.pfa.elearning.service.ICommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/commentaire")
public class CommentaireController {

    @Autowired
    private ICommentaireService commentaireService;


    @GetMapping("/")
    @ResponseBody
    public Page<Commentaire> getAllCommentaires(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size){
        return commentaireService.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/find")
    public Optional<Commentaire> getCommentaire(@RequestParam Long id) {
        return commentaireService.findById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Commentaire addCommentaire(@RequestBody Commentaire commentaire) {
        return commentaireService.save(commentaire);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteCommentaire(@RequestParam Long id) {

        return commentaireService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Commentaire> updateCommentaire(@RequestBody  Commentaire commentaire) {

        return commentaireService.partialUpdate(commentaire);
    }
}
