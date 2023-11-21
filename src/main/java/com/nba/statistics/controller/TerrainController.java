package com.nba.statistics.controller;

import com.nba.statistics.model.MatchJoueur;
import com.nba.statistics.model.Terrain;
import com.nba.statistics.repository.MatchJoueurRepository;
import com.nba.statistics.repository.TerrainRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TerrainController
{
    private final TerrainRepository terrainRepository;

    public TerrainController(TerrainRepository terrainRepository)
    {
        this.terrainRepository = terrainRepository;
    }

    @GetMapping("/terrain")
    public Iterable<Terrain> allAction()
    {
        return this.terrainRepository.findAll();
    }

    @PostMapping("/terrain")
    public Terrain save(@RequestBody Terrain terrain)
    {
        return this.terrainRepository.save(terrain);
    }
}
