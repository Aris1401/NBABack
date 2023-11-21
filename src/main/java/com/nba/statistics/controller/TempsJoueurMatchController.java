package com.nba.statistics.controller;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.TempsJoueurMatch;
import com.nba.statistics.repository.ActionRepository;
import com.nba.statistics.repository.TempsJoueurMatchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempsJoueurMatchController
{
    private final TempsJoueurMatchRepository tempsJoueurMatchRepository;

    public TempsJoueurMatchController(TempsJoueurMatchRepository tempsJoueurMatchRepository)
    {
        this.tempsJoueurMatchRepository = tempsJoueurMatchRepository;
    }

    @GetMapping("/tempsJoueurMatch")
    public Iterable<TempsJoueurMatch> allAction() {
        return this.tempsJoueurMatchRepository.findAll();
    }

    @PostMapping("/tempsJoueurMatch")
    public TempsJoueurMatch save(@RequestBody TempsJoueurMatch tempsJoueurMatch) {
        return this.tempsJoueurMatchRepository.save(tempsJoueurMatch);
    }
}
