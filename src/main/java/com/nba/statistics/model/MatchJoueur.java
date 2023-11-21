package com.nba.statistics.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

public class MatchJoueur
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMatchJoueur;
    int idMatch ;
    int idJoueur;
    Timestamp tempsMatch;

    public int getIdMatchJoueur() {
        return idMatchJoueur;
    }

    public void setIdMatchJoueur(int idMatchJoueur) {
        this.idMatchJoueur = idMatchJoueur;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Timestamp getTempsMatch() {
        return tempsMatch;
    }

    public void setTempsMatch(Timestamp tempsMatch) {
        this.tempsMatch = tempsMatch;
    }
}

