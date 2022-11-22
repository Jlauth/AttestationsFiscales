package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accueil extends JFrame {
    private JPanel Accueil;
    private JButton btnCreer;
    private JButton btnEditerClient;
    private JButton btnImporter;
    private JButton btnQuitter;
    private JPanel Creer;
    private JPanel Editer;
    private JPanel Importer;
    private JPanel Quitter;
    private JPanel AccueilInfo;
    private JButton btnEditerEntreprise;

    public Accueil() {

        setContentPane(Accueil);
        setTitle("Accueil - Gestion des attestations fiscales");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnCreer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Creer creer = new Creer();
                creer.setVisible(true);
                dispose();
            }
        });
        btnEditerClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Editer editer = new Editer();
                editer.setVisible(true);
                dispose();
            }
        });
        btnImporter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Importer importer = new Importer();
                importer.setVisible(true);
                dispose();
            }
        });
        btnQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


}
