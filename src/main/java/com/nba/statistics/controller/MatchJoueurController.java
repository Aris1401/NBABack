package com.nba.statistics.controller;

import com.nba.statistics.model.Joueur;
import com.nba.statistics.model.MatchJoueur;
import com.nba.statistics.repository.MatchJoueurRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchJoueurController
{
    private final MatchJoueurRepository matchJoueurRepository;

    public MatchJoueurController(MatchJoueurRepository matchJoueurRepository)
    {
        this.matchJoueurRepository = matchJoueurRepository;
    }

    @GetMapping("/matchJoueur")
    public Iterable<MatchJoueur> allAction()
    {
        return this.matchJoueurRepository.findAll();
    }

    @PostMapping("/matchJoueur")
    public MatchJoueur save(@RequestBody MatchJoueur matchJoueur)
    {
        return this.matchJoueurRepository.save(matchJoueur);
    }
}
