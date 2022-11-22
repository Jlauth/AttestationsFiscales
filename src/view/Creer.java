package view;

import controller.DocController;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Creer extends JFrame {

    private JPanel Creer;
    private JPanel ClientInfo;
    private JPanel AttestInfo;
    private JPanel Titre;
    private JPanel Nom;
    private JPanel Prenom;
    private JPanel Adresse;
    private JPanel CP;
    private JPanel Ville;
    private JPanel Montant;
    private JPanel AnneeFiscale;
    private JPanel DateEmission;
    private JComboBox<String> cmbTitre;
    private JTextField txtNomClient;
    private JTextField txtPrenomClient;
    private JTextField txtAdresseClient;
    private JTextField txtCPClient;
    private JTextField txtVilleClient;
    private JTextField txtPaysClient;
    private JTextField txtMontantClient;
    private JTextField txtAnneeFiscClient;
    private JTextField txtDateEmissionClient;
    private JPanel Serial;
    private JButton btnValidCreer;
    public JButton btnEnregistrerCreer;


    public String getTitreClient() {
        return (String) cmbTitre.getSelectedItem();
    }

    public String getNomClient() {
        return txtNomClient.getToolTipText();
    }

    public String getPrenomClient() {
        return txtPrenomClient.getToolTipText();
    }

    public String getAdresse() {
        return txtAdresseClient.getText();
    }

    public String getVilleClient() {
        return txtVilleClient.getText();
    }

    public String getCpClient() {
        return txtCPClient.getText();
    }

    public String getTxtMontantAttest() {
        return txtMontantClient.getText();
    }

    public Creer() {


        setContentPane(Creer);
        setTitle("Nouvelle attestation - Gestion des attestations fiscales");
        setSize(900, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // ajout des intitulés titre dans le cmbTitre
        cmbTitre.addItem("Madame");
        cmbTitre.addItem("Mademoiselle");
        cmbTitre.addItem("Monsieur");

        /**
         * Méthode de récupération du cmb sélectionné
         */
        cmbTitre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cmbTitre.getSelectedItem();
            }
        });

        /**
         * Méthode de validation du frame Créer
         */
        btnValidCreer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /**
         * Méthode de sauvegarde du frame Créer
         */
        btnEnregistrerCreer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    DocController docController = new DocController();
                    docController.saveDoc();
                } catch (InvalidFormatException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}