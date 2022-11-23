import controler.AbstractControler;
import model.Client;
import model.Doc;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import outils.connexion.Connexion;
import view.Accueil;
import view.Creer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // instanciation des modèles
        Doc doc = new Doc();
        // création du contrôleur
        AbstractControler abstractControler = new AbstractControler(doc);
        // initialisation de la vue
        new Accueil(abstractControler);
        new Creer(abstractControler);
        // initialisation de la DB
        abstractControler.connexionDB();
        abstractControler.createDoc();
    }
}


