package controller;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import outils.connexion.Connexion;
import view.Accueil;
import view.Creer;

import java.io.IOException;

public class Controleur {


    public static void main(String[] args) throws IOException, InvalidFormatException {

        /**
         * Connexion à la DB
         */
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

        // chargement du frame Accueil
        new Accueil();

        // initialisation du Doc
        DocController docController = new DocController();
        docController.createDoc();
    }
}


