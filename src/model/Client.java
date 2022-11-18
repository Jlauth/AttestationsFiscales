package model;

public class Client {
    private int idClient;
    private String titre;
    private String nom;
    private String prenom;
    private String adresse;
    /**
     * Constructeur de la classe Client
     * @param idClient
     * @param titre
     * @param nom
     * @param prenom
     * @param adresse
     */
    public Client(int idClient, String titre, String nom, String prenom, String adresse) {
        super();
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

    public void addClient(Client client) {
        String query = "";
        query += "INSERT INTO CLIENT VALUES(";
        query += "'" + client.getIdClient() + "', ";
        query += "'" + client.getTitre() + "', ";
        query += "'" + client.getNom() + "', ";
        query += "'" + client.getPrenom() + "', ";
        query += "'" + client.getAdresse() + "' )";


    }
}
