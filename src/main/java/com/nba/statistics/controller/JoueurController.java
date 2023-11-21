package com.nba.statistics.controller;

import com.nba.statistics.model.ActionMatch;
import com.nba.statistics.model.Equipe;
import com.nba.statistics.model.Joueur;
import com.nba.statistics.repository.JoueurRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoueurController
{
    private final JoueurRepository joueurRepository;

    public JoueurController(JoueurRepository joueurRepository)
    {
        this.joueurRepository = joueurRepository;
    }

    @GetMapping("/joueur")
    public Iterable<Joueur> allJoueurs()
    {
        return this.joueurRepository.findAll();
    }
    @PostMapping("/joueur")
    public Joueur save(@RequestBody Joueur joueur)
    {
        return this.joueurRepository.save(joueur);
    }
}
