package outils.connexion;

import java.sql.*;

public class Connexion {
    private String DBPath = "Chemin aux base de données SQLite";
    private Connection conn = null;
    private Statement stmt = null;

    public Connexion(String dBPath) {
        DBPath = dBPath;
    }

    /**
     * Reqûete de connexion à la database
     */
    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:"+DBPath);
            stmt = conn.createStatement();
            System.out.println("Connexion a " + DBPath + " effectuée avec succès");
        }catch(ClassNotFoundException notFoundException) {
            notFoundException.printStackTrace();
            System.out.println("Erreur de connexion");
        }catch(SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Erreur de connexio");
        }
    }

    /**
     * Fermeture de la requête
     */
    public void close() {
        try {
            conn.close();
            stmt.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String request) {
        ResultSet result = null;
        try {
            result = stmt.executeQuery(request);
        }catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur dans la requête "+request);
        }
        return result;
    }
}
