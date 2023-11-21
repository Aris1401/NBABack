package com.nba.statistics.service;

import com.nba.statistics.model.Joueur;
import com.nba.statistics.repository.JoueurRepository;
import com.nba.statistics.utility.Utility;
import jakarta.persistence.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@Service
public class JoueurService
{
    @Autowired
    private JoueurRepository joueurRepository;

    public double getMatchJouer(int idJoueur)
    {
        return joueurRepository.getMatchJouerParJoueur(idJoueur);
    }

    public double getMatchs(int idEquipe)
    {
        return joueurRepository.getMatchsJoueur(idEquipe);
    }

    public double getPointParMatch(int idJoueur)
    {
        return joueurRepository.getPointParMatch(idJoueur)/getMatchJouer(idJoueur);
    }
    public double getRebondParMatch(int idJoueur)
    {
        return joueurRepository.getRebondParMatch(idJoueur);
    }
    public double getPassesDecisifParMatch(int idJoueur)
    {
        return joueurRepository.getPassesDecisifParMatch(idJoueur);
    }

    public double getMinutesParMatch(int idJoueur)
    {
        return  joueurRepository.getMinutesParMatch(idJoueur);
    }

    public double getEfficacite(int idJoueur)
    {
        return 0;
    }

    public double getPourcentagesTiresReussi(int idJoueur)
    {
        return (joueurRepository.getTotalTirsReussis(idJoueur) / joueurRepository.getTotalTirs(idJoueur)) * 100;
    }

    public double getPourcentagesTires3P(int idJoueur)
    {
        return (joueurRepository.getTotalTirs3PReussi(idJoueur) / joueurRepository.getTotalTirs3P(idJoueur)) * 100;
    }

    public double getPourcentagesReussiteLancerFront(int idJoueur)
    {
        return joueurRepository.getTotalTirsLFReussi(idJoueur) / joueurRepository.getTotalTirsLF(idJoueur);
    }


    public ArrayList<Joueur> getClassementJoueurs() {
        ArrayList<Joueur> joueurs = (ArrayList<Joueur>) Utility.iterableToCollection(this.joueurRepository.findAll());

        joueurs.sort(Comparator.comparingDouble(joueur -> getPointParMatch(joueur.getIdJoueur())));

        return joueurs;
    }

    public ArrayList<Joueur> getClassementJoueurParEquipe(int idEquipe) {
        ArrayList<Joueur> joueurs = (ArrayList<Joueur>) Utility.iterableToCollection(this.joueurRepository.findByIdEquipe(idEquipe));

        joueurs.sort(Comparator.comparingDouble(joueur -> getPointParMatch(joueur.getIdJoueur())));

        return joueurs;
    }
}
