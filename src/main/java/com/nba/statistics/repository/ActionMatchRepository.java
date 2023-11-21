package com.nba.statistics.repository;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.ActionMatch;
import org.springframework.data.repository.CrudRepository;

public interface ActionMatchRepository extends CrudRepository<ActionMatch,Long>
{
}
