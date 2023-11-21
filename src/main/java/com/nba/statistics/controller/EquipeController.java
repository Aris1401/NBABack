package com.nba.statistics.controller;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.ActionMatch;
import com.nba.statistics.model.Equipe;
import com.nba.statistics.repository.ActionRepository;
import com.nba.statistics.repository.EquipeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipeController
{
    private final EquipeRepository equipeRepository;

    public EquipeController(EquipeRepository equipeRepository)
    {
        this.equipeRepository = equipeRepository;
    }

    @GetMapping("/equipe")
    public Iterable<Equipe> allAction()
    {
        return this.equipeRepository.findAll();
    }

    @PostMapping("/equipe")
    public Equipe save(@RequestBody Equipe equipe)
    {
        return this.equipeRepository.save(equipe);
    }
}
