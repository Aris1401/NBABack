package com.nba.statistics.model;

import com.nba.statistics.repository.JoueurRepository;
import com.nba.statistics.service.JoueurService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Entity
public class Joueur
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idJoueur;
    String nom;
    Date dateNaissance;
    int idEquipe;
@Transient
    JoueurService joueurService;


    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }
///////////////////////////////////////////////////////////////////////////
    public double getMatchJouer()
    {
        return joueurService.getMatchJouer(idJoueur);
    }
///////////////////////////////////////////////////////////////////////////
    public double getMatchs()
    {
      return joueurService.getMatchs(idEquipe);
    }
///////////////////////////////////////////////////////////////////////////
    public double getPointParMatch()
    {
        return joueurService.getPointParMatch(idJoueur);
    }
///////////////////////////////////////////////////////////////////////////
public double getRebondParMatch()
{
    return joueurService.getPointParMatch(idJoueur);
}
///////////////////////////////////////////////////////////////////////////
public double getPassesDecisif()
{
    return joueurService.getPointParMatch(idJoueur);
}
//////////////////////////////////////////////////////////////////////////
public double getMinutesParMatch()
{
    return joueurService.getMinutesParMatch(idJoueur);
}
///////////////////////////////////////////////////////////////////////////
public double getEfficacite()
{
    return joueurService.getEfficacite(idJoueur);
}
///////////////////////////////////////////////////////////////////////////
public double getPourcentagesTiresReussi()
{
    return joueurService.getPourcentagesTiresReussi(idJoueur);
}
///////////////////////////////////////////////////////////////////////////
public double getPourcentagesTires3P()
{
    return joueurService.getPourcentagesTires3P(idJoueur);
}
public double getPourcentagesReussiteLancerFront()
{
    return joueurService.getPourcentagesReussiteLancerFront(idJoueur);
}


}
