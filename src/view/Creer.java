package view;


import controler.AbstractControler;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Creer extends JFrame {

    private JPanel contentPane = new JPanel();

    private AbstractControler abstractControler;

    public Creer(AbstractControler abstractControler) {
        this.abstractControler = abstractControler;
        // définition du frame Creer
        this.setTitle("Nouvelle attestation - Gestion des attestations fiscales");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 457, 501);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setLocationRelativeTo(null);
        this.setContentPane(contentPane);
        initCreer();
        //contentPane.setLayout(null);
    }

    private void initCreer() {
        // label titre client
        JLabel lblTitre = new JLabel("Titre");
        lblTitre.setBounds(34, 36, 46, 14);
        contentPane.add(lblTitre);
        // combo-box titre client
        JComboBox<String> cmbTitreClient = new JComboBox<>();
        cmbTitreClient.setModel(new DefaultComboBoxModel<>(new String[]{"Madame", "Mademoiselle", "Monsieur"}));
        cmbTitreClient.setBounds(34, 61, 153, 22);
        cmbTitreClient.setSelectedIndex(0);
        contentPane.add(cmbTitreClient);
        cmbTitreClient.getSelectedItem();

        // label nom client
        JLabel lblNom = new JLabel("Nom");
        lblNom.setBounds(34, 100, 46, 14);
        contentPane.add(lblNom);
        // jtxtfield nom client
        JTextField txtNomClient = new JTextField();
        txtNomClient.setBounds(34, 125, 153, 20);
        txtNomClient.setColumns(10);
        contentPane.add(txtNomClient);

        // label prenom client
        JLabel lblPrenom = new JLabel("Prénom");
        lblPrenom.setBounds(240, 100, 46, 14);
        contentPane.add(lblPrenom);
        // jtxtfield prenom client
        JTextField txtPrenomClient = new JTextField();
        txtPrenomClient.setBounds(240, 125, 153, 20);
        txtPrenomClient.setColumns(10);
        contentPane.add(txtPrenomClient);

        // label adresse client
        JLabel lblAdresse = new JLabel("Adresse");
        lblAdresse.setBounds(34, 156, 153, 14);
        contentPane.add(lblAdresse);
        // jtxtfield adresse client
        JTextField txtAdresseClient = new JTextField();
        txtAdresseClient.setBounds(34, 178, 359, 20);
        txtAdresseClient.setColumns(10);
        contentPane.add(txtAdresseClient);

        // label titre ville client
        JLabel lblVille = new JLabel("Ville");
        lblVille.setBounds(34, 209, 46, 14);
        contentPane.add(lblVille);
        // jtxtfield ville client
        JTextField txtVilleClient = new JTextField();
        txtVilleClient.setColumns(10);
        txtVilleClient.setBounds(34, 234, 216, 20);
        contentPane.add(txtVilleClient);

        // label code postal client
        JLabel lblCP = new JLabel("Code Postal");
        lblCP.setBounds(298, 209, 95, 14);
        contentPane.add(lblCP);
        // jtxtfield code postal client
        JTextField txtCPClient = new JTextField();
        txtCPClient.setColumns(10);
        txtCPClient.setBounds(298, 234, 95, 20);
        contentPane.add(txtCPClient);

        // label montant attestation client
        JLabel lblMontantAttest = new JLabel("Montant attestation");
        lblMontantAttest.setBounds(34, 285, 115, 14);
        contentPane.add(lblMontantAttest);
        // jtxtfield montant attestation client
        JTextField txtMontantAttest = new JTextField();
        txtMontantAttest.setColumns(10);
        txtMontantAttest.setBounds(34, 310, 153, 20);
        contentPane.add(txtMontantAttest);

        // button enregistrer
        JButton btnEnregistrer = new JButton("Créer attestation");
        btnEnregistrer.setBounds(34, 350, 150, 50);
        contentPane.add(btnEnregistrer);
        btnEnregistrer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Creer(abstractControler);
                try {
                    abstractControler.saveDoc();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        JButton btnQuitter = new JButton("Quitter");
        btnQuitter.setBounds(250, 350, 150, 50);
        contentPane.add(btnQuitter);
        btnQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}

    /**
     * Date attestation

     JLabel lblDate = new JLabel("Date attestation");
     lblDate.setBounds(298, 285, 95, 14);
     contentPane.add(lblDate);

     JDateChooser dateChooser = new JDateChooser();
     dateChooser.setDateFormatString("dd MMMM yyyy");
     dateChooser.setCalendar(Calendar.getInstance()); // set la date du jour dans le frame
     dateChooser.setBounds(240, 310, 153, 20);
     contentPane.add(dateChooser);
     //dateChooser.setEnabled(false);
     */

