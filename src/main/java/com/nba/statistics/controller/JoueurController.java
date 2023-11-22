package com.nba.statistics.controller;

import com.nba.statistics.model.Joueur;
import com.nba.statistics.repository.JoueurRepository;
import com.nba.statistics.repsonse.ResponseData;
import com.nba.statistics.service.JoueurService;
import com.nba.statistics.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;

@RestController
public class JoueurController {
    private final JoueurRepository joueurRepository;
    @Autowired
    private JoueurService joueurService;

    public JoueurController(JoueurRepository joueurRepository) {
        this.joueurRepository = joueurRepository;
    }

    @GetMapping("/joueurs")
    public ResponseData<Joueur> allJoueurs() {
        ResponseData<Joueur> responseData = new ResponseData<>();
        responseData.setData((ArrayList) Utility.iterableToCollection(this.joueurRepository.findAll()));
        return responseData;
    }

    @PostMapping("/joueurs")
    public Joueur save(@RequestBody Joueur joueur) {
        return this.joueurRepository.save(joueur);
    }

    @GetMapping("/joueurs/{id}/MJ")
    public ResponseData<Double> getMatchJouee(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData(joueurRepository.getMatchJouerParJoueur(id));
        return responseData;
    }

    ///////////////////////////////////////////////////////////////////////////
    @GetMapping("/joueurs/{id}/M")
    public ResponseData<Double> getMatchs(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData(this.joueurService.getMatchs(id));
        return responseData;
    }

    ///////////////////////////////////////////////////////////////////////////
    @GetMapping("/joueurs/{id}/PMP")
    public ResponseData<Double> getPointParMatch(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData(joueurRepository.getPointParMatch(id)/ joueurRepository.getMatchJouerParJoueur(id));
        return responseData;
    }

    ///////////////////////////////////////////////////////////////////////////
    @GetMapping("/joueurs/{id}/RPM")
    public ResponseData<Double> getRebondParMatch(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData(joueurRepository.getRebondParMatch(id));
        return responseData;
    }

    ///////////////////////////////////////////////////////////////////////////
    @GetMapping("/joueurs/{id}/PDPM")
    public ResponseData<Double> getPassesDecisif(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData(joueurRepository.getPassesDecisifParMatch(id));
        return responseData;
    }

    //////////////////////////////////////////////////////////////////////////
    @GetMapping("/joueurs/{id}/MPM")
    public ResponseData<Double> getMinutesParMatch(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData(joueurRepository.getMinutesParMatch(id));
        return responseData;
    }

    ///////////////////////////////////////////////////////////////////////////
    @GetMapping("/joueurs/{id}/EFF")
    public ResponseData<Double> getEfficacite(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData(null);
        return responseData;
    }

    ///////////////////////////////////////////////////////////////////////////
    @GetMapping("/joueurs/{id}/FG")
    public ResponseData<Double> getPourcentagesTiresReussi(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData((joueurRepository.getTotalTirsReussis(id) / joueurRepository.getTotalTirs(id)) * 100);
        return responseData;
    }

    ///////////////////////////////////////////////////////////////////////////
    @GetMapping("/joueurs/{id}/3P")
    public ResponseData<Double> getPourcentagesTires3P(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData((joueurRepository.getTotalTirs3PReussi(id) / joueurRepository.getTotalTirs3P(id)) * 100);
        return responseData;
    }

    @GetMapping("/joueurs/{id}/LF")
    public ResponseData<Double> getPourcentagesReussiteLancerFront(@PathVariable("id") int id) {
        ResponseData<Double> responseData = new ResponseData<>();
        responseData.addToData(joueurRepository.getTotalTirsLFReussi(id) / joueurRepository.getTotalTirsLF(id));
        return responseData;
    }

    @GetMapping("/classement")
    public ResponseData<Joueur> getClassement() {
        ArrayList<Joueur> joueurs = (ArrayList<Joueur>) Utility.iterableToCollection(this.joueurRepository.findAll());

        joueurs.sort(Comparator.comparingDouble(joueur -> joueurRepository.getPointParMatch(joueur.getIdJoueur())));

        ResponseData<Joueur> responseData = new ResponseData<>();
        responseData.setData(joueurs);
        return responseData;
    }

    @GetMapping("/classement/equipe/{id}")
    public ResponseData<Joueur> getClassement(@PathVariable("id") int id) {
        ArrayList<Joueur> joueurs = (ArrayList<Joueur>) Utility.iterableToCollection(this.joueurRepository.findByIdEquipe(id));

        joueurs.sort(Comparator.comparingDouble(joueur -> joueurRepository.getPointParMatch(joueur.getIdJoueur())));

        ResponseData<Joueur> responseData = new ResponseData<>();
        responseData.setData(joueurs);
        return responseData;
    }
}
