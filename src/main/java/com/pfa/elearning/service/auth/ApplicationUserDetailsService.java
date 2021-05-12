package com.pfa.elearning.service.auth;


import com.pfa.elearning.exception.EntityNotFoundException;
import com.pfa.elearning.exception.ErrorCodes;
import com.pfa.elearning.model.Utilisateur;
import com.pfa.elearning.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {

    @Autowired
    private UtilisateurRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
     Utilisateur utilisateur = repository.findByEmail(email).orElseThrow(() ->
             new EntityNotFoundException("aucun utilsateur avec l'email fourni ", ErrorCodes.UTILISATEUR_NOT_FOUND)
             );

        return new User(utilisateur.getEmail(),utilisateur.getPassword(), Collections.emptyList());
    }
}
