package model;

public class Entreprise {
    private int idEntreprise;
    private String nomEntreprise;
    private String adresseEntreprise;
    private int agrement;

    /**
     * Constructeur de la classe Entreprise
     * @param idEntreprise
     * @param nomEntreprise
     * @param adresseEntreprise
     * @param agrement
     */
    public Entreprise(int idEntreprise, String nomEntreprise, String adresseEntreprise, int agrement) {
        super();
        this.idEntreprise = idEntreprise;
        this.nomEntreprise = nomEntreprise;
        this.adresseEntreprise = adresseEntreprise;
        this.agrement = agrement;
    }

    public int getIdEntreprise() {
        return idEntreprise;
    }

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
