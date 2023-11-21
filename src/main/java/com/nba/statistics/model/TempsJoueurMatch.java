package com.nba.statistics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class TempsJoueurMatch
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idTempsJoueurMatch;
    int idJoueur;
    int idMatch;
    Timestamp tempsIn;
    Timestamp tempsOut;

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

    public Timestamp getTempsOut() {
        return tempsOut;
    }

    public void setTempsOut(Timestamp tempsOut) {
        this.tempsOut = tempsOut;
    }
}
