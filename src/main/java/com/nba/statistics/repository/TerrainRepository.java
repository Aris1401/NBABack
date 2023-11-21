package com.nba.statistics.repository;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.Terrain;
import org.springframework.data.repository.CrudRepository;

public interface TerrainRepository extends CrudRepository<Terrain,Long>
{
}
