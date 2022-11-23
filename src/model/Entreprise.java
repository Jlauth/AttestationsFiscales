package model;

public class Entreprise {
    private String nomEntreprise;
    private String adresseEntreprise;
    private int agrement;

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public String getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public int getAgrement() {
        return agrement;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public void setAdresseEntreprise(String adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }

    public void setAgrement(int agrement) {
        this.agrement = agrement;
    }
}
