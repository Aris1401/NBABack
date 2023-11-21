package com.nba.statistics.repository;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.Joueur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface JoueurRepository extends CrudRepository<Joueur,Long>
{
    @Query("select count(idMatch) from ActionMatch where idJoueur=?1 GROUP BY idMatch")
    public double  getMatchJouerParJoueur(int idJoueur);

    @Query("select count(idMatch) from Match where idEquipeAway=?1 or idEquipeHome=?1")
     public double getMatchsJoueur(int idEquipe);

    @Query("select SUM(etat) from ActionMatch where idAction<4 AND idJoueur=?1")
    public double getPointParMatch(int idJoueur);

    @Query("select SUM(etat) from ActionMatch where idAction=6 AND idJoueur=?1")
    public double getRebondParMatch(int idJoueur);

    @Query("select SUM(etat) from ActionMatch where idAction=4 AND idJoueur=?1")
    public double getPassesDecisifParMatch(int idJoueur);

    @Query("select ")
    public double getMinutesParMatch(int idJoueur);

    @Query("")
    public double getEfficacite(int idJoueur);

    @Query("")
    public double getPourcentagesTiresReussi(int idJoueur);

    @Query("")
    public double getPourcentagesTires3P(int idJoueur);

    @Query("")
    public double getPourcentagesReussiteLancerFront(int idJoueur);


}
