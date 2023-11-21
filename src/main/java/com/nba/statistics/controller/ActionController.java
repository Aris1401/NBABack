package com.nba.statistics.controller;

import com.nba.statistics.model.Action;
import com.nba.statistics.repository.ActionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController
{
    private final ActionRepository actionRepository;

    public ActionController(ActionRepository actionRepository)
    {
        this.actionRepository = actionRepository;
    }

    @GetMapping("/actions")
    public Iterable<Action> allAction() {
        return this.actionRepository.findAll();
    }

    @PostMapping("/actions")
    public Action save(@RequestBody Action action) {
        return this.actionRepository.save(action);
    }
}
