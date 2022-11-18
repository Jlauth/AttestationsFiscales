package controller;

import model.Client;
import outils.connexion.Connexion;

import java.sql.Array;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controleur {
    public static void main(String[] args) {
        Connexion conn = new Connexion("Database");
        conn.connect();
        conn.close();

    }
}
