package controller;

import outils.connexion.Connexion;

public class Controleur {
    public static void main(String[] args) {
        Connexion conn = new Connexion("Database.db");
        conn.connect();
        conn.close();
    }
}
