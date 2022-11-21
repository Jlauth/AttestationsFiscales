package controller;

import outils.connexion.Connexion;
import view.Accueil;

import javax.swing.*;

public class Controleur {

    public static void main(String[] args){
        try {
            Connexion conn = new Connexion("ArkadiaPC DB");
            conn.connect();
            conn.createClient();
            conn.createAttestation();
            conn.createEntreprise();
            conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Accueil accueil = new Accueil();
    }
}

