package view;

import controller.Controleur;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accueil extends JFrame {
    private JPanel Accueil;
    private JButton btnCreer;
    private JButton btnEditer;
    private JButton btnImporter;
    private JButton btnQuitter;
    private JPanel Creer;
    private JPanel Editer;
    private JPanel Importer;
    private JPanel Quitter;
    private JPanel AccueilInfo;

    public Accueil() {

        setContentPane(Accueil);
        setTitle("Accueil - Gestion des attestations fiscales");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnCreer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Accueil.setVisible(false);
                Creer.setVisible(true);
            }
        });
        btnEditer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnImporter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
