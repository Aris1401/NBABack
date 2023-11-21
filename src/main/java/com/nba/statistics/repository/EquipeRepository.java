package com.nba.statistics.repository;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.Equipe;
import org.springframework.data.repository.CrudRepository;

public interface EquipeRepository extends CrudRepository<Equipe,Long>
{
}
