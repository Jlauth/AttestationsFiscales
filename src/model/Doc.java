package model;

import controler.AbstractControler;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Doc {

    public Doc() {

        XWPFDocument document = new XWPFDocument();
        XWPFTable table = document.createTable();
        // Enlever les bordures de la table
        table.removeBorders();
        /**
         * Custom des marges du document
         * CTSectPr sectPr = document.getDocument().getBody().addNewSectPr();
         * CTPageMar pageMar = sectPr.addNewPgMar();
         * pageMar.setLeft(BigInteger.valueOf(1000L));
         * pageMar.setTop(BigInteger.valueOf(550L));
         * pageMar.setRight(BigInteger.valueOf(1000L));
         * pageMar.setBottom(BigInteger.valueOf(550L));
         * // Espacement entre les lignes
         * documentTitle.setSpacingBefore(100);
         */
        // TODO trouver une méthode pour aller à la ligne sans utiliser le "cheat"
        // Création du header partie gauche, informations entreprise
        XWPFTableRow row = table.getRow(0);
        row.addNewTableCell();
        row.addNewTableCell();

        // Import du logo
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        paragraph = row.getCell(2).

                addParagraph();

        run = paragraph.createRun();
        InputStream is;
        try {
            File imgLogo = new File("src/media/logofinal.jpg");
            String imgLogoAbsolute = imgLogo.getAbsolutePath();
            is = new FileInputStream(imgLogoAbsolute);
            run.addPicture(is, XWPFDocument.PICTURE_TYPE_JPEG, imgLogoAbsolute, Units.toEMU(110), Units.toEMU(80));
            paragraph.setAlignment(ParagraphAlignment.RIGHT);
        } catch (InvalidFormatException |
                 IOException e1) {
            e1.printStackTrace();
        }

        // Header droit
        XWPFParagraph paragraph2 = document.createParagraph();
        XWPFRun run2 = paragraph2.createRun();
        run2.setText("");
        run2.addBreak();
        run2.setText("");
        run2.addBreak();
        run2.setText("");
        run2.addBreak();
        run2.addBreak();
        run2.setText("le XXXX,");
        run2.addBreak();
        run2.addBreak();
        run2.setFontFamily("Calibri");
        paragraph2.setAlignment(ParagraphAlignment.RIGHT);

        // Titre
        XWPFParagraph paragraph3 = document.createParagraph();
        XWPFRun run3 = paragraph3.createRun();
        run3.setText("Attestation destinée au Centre des Impôts");
        run3.setFontSize(20);
        run3.addBreak();
        run3.setFontFamily("Calibri");
        run3.setUnderline(UnderlinePatterns.SINGLE);
        paragraph3.setAlignment(ParagraphAlignment.CENTER);

        // Body
        XWPFParagraph paragraph4 = document.createParagraph();
        XWPFRun run4 = paragraph4.createRun();
        run4.addBreak();
        run4.addBreak();
        run4.addTab();
        run4.setText("Je soussigné Monsieur XXX gérant de l'organisme agréé XXXX certifie que XXXX  a bénéficié d'assistance informatique à domicile, service à la personne :");
        run4.addBreak();
        run4.addBreak();
        run4.addTab();
        run4.addTab();
        run4.setText("Montant total des factures de XXX euros");
        run4.addBreak();
        run4.addTab();
        run4.addTab();
        run4.addBreak();
        run4.addBreak();
        run4.setText("Intervenants : ");
        run4.addBreak();
        run4.addBreak();
        run4.addTab();
        run4.addTab();
        run4.setText("XXX");
        run4.addBreak();
        run4.addBreak();
        run4.setText("Prestations :");
        run4.addBreak();
        run4.addBreak();
        run4.addTab();
        run4.setText("Les sommes perçues pour financer les services à la personne sont à déduire de la valeur indiquée précédemment.");
        run4.addBreak();
        run4.addBreak();
        run4.addTab();
        run4.setText("La déclaration engage la responsabilité du seul contribuable");
        run4.addBreak();
        run4.addBreak();
        // écriture font size différent : 10
        XWPFParagraph paragraph04 = document.createParagraph();
        XWPFRun run04 = paragraph04.createRun();
        run04.setText("* Pour les personnes utilisant le Chèque Emploi Service Universel, seul le montant financé personnellement est déductible. "
                + "Une attestation est délivrée par les établissements qui préfinancent le CESU.");
        run04.setFontSize(10);
        // retour au font size 11
        XWPFParagraph paragraph004 = document.createParagraph();
        XWPFRun run004 = paragraph004.createRun();
        run004.addBreak();
        run004.addBreak();
        run004.addTab();
        run004.setText("Fait pour valoir ce que de droit,");
        run004.addBreak();
        run004.addBreak();
        run004.addBreak();
        run004.addBreak();
        run004.setText("XXXX gérant.");
        run004.setFontFamily("Calibri");
        paragraph004.setIndentationLeft(0);
        paragraph004.setIndentationHanging(100);

        // import de la signature
        XWPFParagraph paragraph5 = document.createParagraph();
        XWPFRun run5 = paragraph5.createRun();
    }
}


