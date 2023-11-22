package com.nba.statistics.repository;

import com.nba.statistics.model.Action;
import com.nba.statistics.model.Joueur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurRepository extends CrudRepository<Joueur, Long> {
    @Query("select j from Joueur j where j.equipe=?1")

    public Iterable<Joueur> getByEquipe(int idEquipe);
    @Query("select count(distinct(idMatch)) as nombre from ActionMatch where idJoueur=?1 GROUP BY idMatch")
    public Double getMatchJouerParJoueur(int idJoueur);

    @Query("SELECT count(idMatch) as nombre FROM Match WHERE equipeAway=?1 or equipeHome=?1")
    public double getMatchsJoueur(int idEquipe);

    @Query("select COALESCE(SUM(etat), 0) as nombre from ActionMatch where idAction<4 AND idJoueur=?1")
    public Double getPointParMatch(int idJoueur);

    @Query("select COALESCE(SUM(etat), 0)  as nombre from ActionMatch where idAction=6 AND idJoueur=?1")
    public Double getRebondParMatch(int idJoueur);

    @Query("select COALESCE(SUM(etat), 0)  as nombre from ActionMatch where idAction=4 AND idJoueur=?1")
    public double getPassesDecisifParMatch(int idJoueur);

    @Query("select COALESCE(SUM(tempsIn - tempsOut), 0)  as nombre FROM TempsJoueurMatch WHERE idJoueur = ?1 GROUP BY idMatch")
    public double getMinutesParMatch(int idJoueur);

    @Query("SELECT COALESCE(SUM(etat), 0)  as nombre FROM ActionMatch WHERE idAction < 4 AND idJoueur = ?1 AND etat > 0 GROUP BY idJoueur")
    public double getTotalTirsReussis(int idJoueur);
    @Query("SELECT COALESCE(SUM(etat), 0)  as nombre FROM ActionMatch WHERE idAction < 4 AND idJoueur = ?1  GROUP BY idJoueur")
    public double getTotalTirs(int idJoueur);

    @Query("SELECT COALESCE(SUM(etat), 0)  as nombre FROM ActionMatch WHERE idAction = 1 AND idJoueur = ?1 AND etat = 3  GROUP BY idJoueur")

    public double getTotalTirs3PReussi(int idJoueur);
    @Query("SELECT COALESCE(SUM(etat), 0)  as nombre FROM ActionMatch WHERE idAction = 1 AND idJoueur = ?1  GROUP BY idJoueur")

    public double getTotalTirs3P(int idJoueur);

    @Query("SELECT COALESCE(SUM(etat), 0)  as nombre FROM ActionMatch WHERE idAction = 3 AND idJoueur = ?1 AND etat = 1  GROUP BY idJoueur")
    public double getTotalTirsLFReussi(int idJoueur);
    @Query("SELECT COALESCE(SUM(etat), 0)  as nombre FROM ActionMatch WHERE idAction = 3 AND idJoueur = ?1 GROUP BY idJoueur")
    public double getTotalTirsLF(int idJoueur);
}
