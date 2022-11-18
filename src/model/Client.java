package model;

import outils.connexion.Connexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Client {
    private int idClient;
    private String titre;
    private String nom;
    private String prenom;
    private String adresse;

    public Client(int idClient, String titre, String nom, String prenom, String adresse) {
        this.idClient = idClient;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getTitre() {
        return titre;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }


    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



}

