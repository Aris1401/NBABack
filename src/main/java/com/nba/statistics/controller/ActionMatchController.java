package com.nba.statistics.controller;


import com.nba.statistics.model.ActionMatch;
import com.nba.statistics.repository.ActionMatchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionMatchController
{
    private final ActionMatchRepository actionMatchRepository;

    public ActionMatchController(ActionMatchRepository actionMatchRepository)
    {
        this.actionMatchRepository = actionMatchRepository;
    }

    @GetMapping("/actionMatch")
    public Iterable<ActionMatch> allAction()
    {
        return this.actionMatchRepository.findAll();
    }

    @PostMapping("/actionMatch")
    public ActionMatch save(@RequestBody ActionMatch actionMatch)
    {
        return this.actionMatchRepository.save(actionMatch);
    }
}


