package model;

import java.util.Date;

public class Attestation {
    private int idAttestation;
    private Date dateEmission;
    private Date anneeFiscale;
    private int montant;

    /**
     * Constructeur de la classe Attestation
     * @param idAttestation
     * @param dateEmission
     * @param anneeFiscale
     * @param montant
     */
    public Attestation(int idAttestation, Date dateEmission, Date anneeFiscale, int montant) {
        super();
        this.idAttestation = idAttestation;
        this.dateEmission = dateEmission;
        this.anneeFiscale = anneeFiscale;
        this.montant = montant;
    }

    public int getIdAttestation() {
        return idAttestation;
    }

    public Date getDateEmission() {
        return dateEmission;
    }

    public Date getAnneeFiscale() {
        return anneeFiscale;
    }

    public int getMontant() {
        return montant;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    public void setAnneeFiscale(Date anneeFiscale) {
        this.anneeFiscale = anneeFiscale;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
