package com.nba.statistics.repository;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.Match;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match,Long>
{
}
