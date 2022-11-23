package view;

import controler.AbstractControler;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accueil extends JFrame {

    private final JPanel contentPane = new JPanel();

    private AbstractControler abstractControler;

    public Accueil(AbstractControler abstractControler) {
        this.abstractControler = abstractControler;
        // définition du frame Accueil
        this.setTitle("Accueil - Gestion des attestations fiscales");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 457, 501);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(null);
        this.setContentPane(contentPane);
        this.setVisible(true);
        initAccueil();
    }

    private void initAccueil() {
        JButton btnCreer = new JButton("Nouvelle attestation");
        btnCreer.setBounds(34, 150, 150, 50);
        contentPane.add(btnCreer);
        btnCreer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Creer creer = new Creer(abstractControler);
                creer.setVisible(true);
                dispose();
            }
        });

        JButton btnQuitter = new JButton("Quitter");
        btnQuitter.setBounds(34, 350, 150, 50);
        contentPane.add(btnQuitter);
        btnQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
