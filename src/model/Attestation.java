package model;

public class Attestation {
    private String dateEmission;
    private String anneeFiscale;
    private int montant;

    /**
     * Constructeur de la classe Attestation
     * @param dateEmission création de l'attestation
     * @param anneeFiscale année des prestations
     * @param montant      montant des prestations
     */
    public Attestation(String dateEmission, String anneeFiscale, int montant) {
        super();
        this.dateEmission = dateEmission;
        this.anneeFiscale = anneeFiscale;
        this.montant = montant;
    }

    public String getDateEmission() {
        return dateEmission;
    }

    public String getAnneeFiscale() {
        return anneeFiscale;
    }

    public int getMontant() {
        return montant;
    }


    public void setDateEmission(String dateEmission) {
        this.dateEmission = dateEmission;
    }

    public void setAnneeFiscale(String anneeFiscale) {
        this.anneeFiscale = anneeFiscale;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
