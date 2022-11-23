package controler;

import model.*;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import outils.connexion.Connexion;
import view.Creer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AbstractControler {

    protected Client client;
    protected Doc doc;
    private XWPFDocument document;

    private Creer creer = new Creer(this);

    // constructeur de la classe AbstractControler
    public AbstractControler(Doc doc) {
        this.doc = doc;
    }

    // Méthode de création du Document
    public void createDoc() {
        try {
            document = new XWPFDocument();
            System.out.println("CREATED.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Méthode de sauvegarde du document
    public void saveDoc() throws IOException {
        // Constructeurs
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        // Méthodes création de fichier
        fileChooser.setDialogTitle("Enregistrer sous");
        fileChooser.setSelectedFile(new File("AttestationFiscales.docx"));
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            FileOutputStream output;
            try {
                output = new FileOutputStream(fileToSave.getAbsolutePath());
                document.write(output);
                output.close();
                System.out.println("Sauvegarde du document: " + fileToSave);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    // méthode de connexion à la DB
    public void connexionDB() {
        try {
            Connexion conn = new Connexion("ArkadiaPC DB");
            conn.connect();
            conn.createClient();
            conn.createEntreprise();
            conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}