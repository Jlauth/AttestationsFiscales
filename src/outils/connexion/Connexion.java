package outils.connexion;

import model.Attestation;
import model.Client;

import java.sql.*;

public class Connexion {

    private final String DBPath;
    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pstmt = null;

    private final ResultSet rs = null;

    public Connexion(String DBPath) {
        this.DBPath = DBPath;
    }
    /**
     * Requête de connexion à la database
     */
    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:"+DBPath);
            stmt = conn.createStatement();
            System.out.println("Connexion a " + DBPath + " effectuée avec succès");
        }catch(ClassNotFoundException | SQLException notFoundException) {
            notFoundException.printStackTrace();
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
     * @param request requête du controller
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
     * Création de la table client si elle n'existe pas
     */
    public void createClient(){
        try {
            stmt = conn.createStatement();
            String sqlClientTable = "CREATE TABLE IF NOT EXISTS CLIENT" +
                    "(idClient INT PRIMARY KEY NOT NULL," +
                    "titre STRING(10) NOT NULL," +
                    "nom STRING(50) NOT NULL," +
                    "prenom STRING(50) NOT NULL," +
                    "adresse STRING(250) NOT NULL)";
            stmt.executeUpdate(sqlClientTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Création de la table attestation si elle n'existe pas
     */
    public void createAttestation(){
        try {
            stmt = conn.createStatement();
            String sqlAttestationTable = "CREATE TABLE IF NOT EXISTS ATTESTATION" +
                    "(idAttestation INT PRIMARY KEY NOT NULL," +
                    "dateEmission STRING(10) NOT NULL," +
                    "anneeFiscale STRING(4) NOT NULL," +
                    "montant INT(10) NOT NULL)";
            stmt.executeUpdate(sqlAttestationTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Création d'une table entreprise si elle n'existe pas
     */
     public void createEntreprise(){
         try{
             stmt = conn.createStatement();
             String sqlEntrepriseTable = "CREATE TABLE IF NOT EXISTS ENTREPRISE"+
                     "(idEntreprise INT PRIMARY KEY NOT NULL," +
                     "nomEntreprise STRING(30) NOT NULL," +
                     "adresseEntreprise STRING(250) NOT NULL," +
                     "agrement STRING(30) NOT NULL)";
             stmt.executeUpdate(sqlEntrepriseTable);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }


     /**
     * @param client ajout d'un client
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
     * @param attestation ajout d'une attestation
     */
    public void addAttestation(Attestation attestation){
        try{
            pstmt = conn.prepareStatement("INSERT INTO Attestation VALUES(" +
                    "?, ?, ?)");
            pstmt.setString(2, attestation.getDateEmission());
            pstmt.setString(3, attestation.getAnneeFiscale());
            pstmt.setInt(4, attestation.getMontant());
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
