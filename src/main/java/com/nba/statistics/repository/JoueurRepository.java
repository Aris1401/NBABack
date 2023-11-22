package com.nba.statistics.repository;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.Joueur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurRepository extends CrudRepository<Joueur, Long> {
    public Iterable<Joueur> findByIdEquipe(int idEquipe);
    @Query("select count(idMatch) from ActionMatch where idJoueur=?1 GROUP BY idMatch")
    public double getMatchJouerParJoueur(int idJoueur);

    @Query("SELECT count(idMatch) FROM Match WHERE equipeAway=?1 or equipeHome=?1")
    public double getMatchsJoueur(int idEquipe);

    @Query("select SUM(etat) from ActionMatch where idAction<4 AND idJoueur=?1")
    public double getPointParMatch(int idJoueur);

    @Query("select SUM(etat) from ActionMatch where idAction=6 AND idJoueur=?1")
    public double getRebondParMatch(int idJoueur);

    @Query("select SUM(etat) from ActionMatch where idAction=4 AND idJoueur=?1")
    public double getPassesDecisifParMatch(int idJoueur);

    @Query("select SUM(tempsIn - tempsOut) FROM TempsJoueurMatch WHERE idJoueur = ?1 GROUP BY idMatch")
    public double getMinutesParMatch(int idJoueur);

    @Query("SELECT SUM(etat) FROM ActionMatch WHERE idAction < 4 AND idJoueur = ?1 AND etat > 0 GROUP BY idJoueur")
    public double getTotalTirsReussis(int idJoueur);
    @Query("SELECT SUM(etat) FROM ActionMatch WHERE idAction < 4 AND idJoueur = ?1  GROUP BY idJoueur")

    public double getTotalTirs(int idJoueur);

    @Query("SELECT SUM(etat) FROM ActionMatch WHERE idAction = 1 AND idJoueur = ?1 AND etat = 3  GROUP BY idJoueur")

    public double getTotalTirs3PReussi(int idJoueur);
    @Query("SELECT SUM(etat) FROM ActionMatch WHERE idAction = 1 AND idJoueur = ?1  GROUP BY idJoueur")

    public double getTotalTirs3P(int idJoueur);

    @Query("SELECT SUM(etat) FROM ActionMatch WHERE idAction = 3 AND idJoueur = ?1 AND etat = 1  GROUP BY idJoueur")
    public double getTotalTirsLFReussi(int idJoueur);
    @Query("SELECT SUM(etat) FROM ActionMatch WHERE idAction = 3 AND idJoueur = ?1 GROUP BY idJoueur")
    public double getTotalTirsLF(int idJoueur);
}
