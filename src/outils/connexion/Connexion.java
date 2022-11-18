package outils.connexion;

import model.Attestation;
import model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;

public class Connexion {

    private static String DBPath = "Chemin aux bases de donn\u00E9es SQLite";
    private static Connection conn = null;
    private static Statement stmt = null;
    private static PreparedStatement pstmt = null;

    private static ResultSet rs = null;

    public Connexion(String DBPath) {
        this.DBPath = DBPath;
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
            System.out.println("Erreur de connexion");
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

    /**
     *
     * @param request
     * @return result Objet de ResultSet
     */
    public ResultSet query(String request) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(request);
        }catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur dans la requête "+request);
        }
        return rs;
    }

    /**
     * Ajout d'un client
     * @param client
     */
    public void addClient(Client client){
        try {
             pstmt = conn.prepareStatement("INSERT INTO Client VALUES(" +
                    "?, ?, ?, ?, ?)");
                 pstmt.setInt(1, client.getIdClient());
                 pstmt.setString(2, client.getTitre());
                 pstmt.setString(3, client.getNom());
                 pstmt.setString(4, client.getPrenom());
                 pstmt.setString(5, client.getAdresse());
                 pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * Ajout d'une attestation
     * @param attestation
     */
    public void addAttestation(Attestation attestation){
        try{
            pstmt = conn.prepareStatement("INSERT INTO Attestation VALUES(" +
                    "?, ?, ?, ?)");
            pstmt.setInt(1, attestation.getIdAttestation());
            pstmt.setDate(2, (Date) attestation.getDateEmission());
            pstmt.setDate(3, (Date) attestation.getAnneeFiscale());
            pstmt.setInt(4, attestation.getMontant());
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
