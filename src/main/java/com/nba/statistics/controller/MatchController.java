package com.nba.statistics.controller;

import com.nba.statistics.model.ActionMatch;
import com.nba.statistics.model.Joueur;
import com.nba.statistics.model.Match;
import com.nba.statistics.repository.MatchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController
{
    private final MatchRepository matchRepository;

    public MatchController(MatchRepository matchRepository)
    {
        this.matchRepository = matchRepository;
    }

    @GetMapping("/match")
    public Iterable<Match> allMatch()
    {
        return this.matchRepository.findAll();
    }

    @PostMapping("/match")
    public Match save(@RequestBody Match match)
    {
        return this.matchRepository.save(match);
    }
}
