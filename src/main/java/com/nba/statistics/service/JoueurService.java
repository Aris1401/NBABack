package com.nba.statistics.service;

import com.nba.statistics.repository.JoueurRepository;
import jakarta.persistence.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return joueurRepository.getEfficacite(idJoueur);
    }

    public double getPourcentagesTiresReussi(int idJoueur)
    {
        return joueurRepository.getPourcentagesTiresReussi(idJoueur);
    }

    public double getPourcentagesTires3P(int idJoueur)
    {
        return joueurRepository.getPourcentagesTires3P(idJoueur);
    }

    public double getPourcentagesReussiteLancerFront(int idJoueur)
    {
        return joueurRepository.getPourcentagesReussiteLancerFront(idJoueur);
    }




}
