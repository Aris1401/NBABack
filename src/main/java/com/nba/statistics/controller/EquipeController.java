package com.nba.statistics.controller;

import com.nba.statistics.model.Equipe;
import com.nba.statistics.repository.EquipeRepository;
import com.nba.statistics.repsonse.ResponseData;
import com.nba.statistics.utility.Utility;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EquipeController
{
    private final EquipeRepository equipeRepository;

    public EquipeController(EquipeRepository equipeRepository)
    {
        this.equipeRepository = equipeRepository;
    }

    @GetMapping("/equipes")
    public ResponseData<Equipe> allAction()
    {
        ResponseData<Equipe> equipes = new ResponseData<>();
        equipes.setData((ArrayList<Equipe>) Utility.iterableToCollection(this.equipeRepository.findAll()));
        return equipes;
    }

    @PostMapping("/equipes")
    public Equipe save(@RequestBody Equipe equipe)
    {
        return this.equipeRepository.save(equipe);
    }
}
