package com.nba.statistics.repository;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.MatchJoueur;
import org.springframework.data.repository.CrudRepository;

public interface MatchJoueurRepository extends CrudRepository<MatchJoueur,Long>
{
}
