package model;

public class Client {

    private String titre;
    private String nom;
    private String prenom;
    private String adresse;
    private String dateEmission;
    private String anneeFiscale;
    private String montant;

    // getters
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
    public String getDateEmission() {
        return dateEmission;
    }

    public String getAnneeFiscale() {
        return anneeFiscale;
    }

    public String getMontant() {
        return montant;
    }


    // setters
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

    public void setDateEmission(String dateEmission) {
        this.dateEmission = dateEmission;
    }

    public void setAnneeFiscale(String anneeFiscale) {
        this.anneeFiscale = anneeFiscale;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }
}

