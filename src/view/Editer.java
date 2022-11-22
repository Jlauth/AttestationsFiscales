package view;

import javax.swing.*;

public class Editer extends JFrame {

    private JPanel EditerClient;

    private JPanel EditerAttestation;

    private JPanel EditerEntreprise;
    private JPanel Editer;

    public Editer(){

        setContentPane(Editer);
        setTitle("Edition - Gestion des attestations fiscales");
        setSize(800, 680);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel cmbTitre = new JPanel();
        cmbTitre.setVisible(true);

    }
}
