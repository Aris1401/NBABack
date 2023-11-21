package com.nba.statistics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Match
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMatch;
    Timestamp dateMatch;
    Timestamp dateFinMatch;
    int equipeAway;
    int equipeHome;
    int idTerrain;

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public Timestamp getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Timestamp dateMatch) {
        this.dateMatch = dateMatch;
    }

    public Timestamp getDateFinMatch() {
        return dateFinMatch;
    }

    public void setDateFinMatch(Timestamp dateFinMatch) {
        this.dateFinMatch = dateFinMatch;
    }

    public int getEquipeAway() {
        return equipeAway;
    }

    public void setEquipeAway(int equipeAway) {
        this.equipeAway = equipeAway;
    }

    public int getEquipeHome() {
        return equipeHome;
    }

    public void setEquipeHome(int equipeHome) {
        this.equipeHome = equipeHome;
    }

    public int getIdTerrain() {
        return idTerrain;
    }

    public void setIdTerrain(int idTerrain) {
        this.idTerrain = idTerrain;
    }
}
