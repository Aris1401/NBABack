package com.nba.statistics.model;

import java.sql.Timestamp;

public class TempsJoueurMatch
{
    int idTempsJoueurMatch;
    int idJoueur;
    int idMatch;
    Timestamp tempsIn;
    Timestamp tepmsOut;

    public int getIdTempsJoueurMatch() {
        return idTempsJoueurMatch;
    }

    public void setIdTempsJoueurMatch(int idTempsJoueurMatch) {
        this.idTempsJoueurMatch = idTempsJoueurMatch;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public Timestamp getTempsIn() {
        return tempsIn;
    }

    public void setTempsIn(Timestamp tempsIn) {
        this.tempsIn = tempsIn;
    }

    public Timestamp getTepmsOut() {
        return tepmsOut;
    }

    public void setTepmsOut(Timestamp tepmsOut) {
        this.tepmsOut = tepmsOut;
    }
}
