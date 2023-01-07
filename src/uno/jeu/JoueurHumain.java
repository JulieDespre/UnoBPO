package uno.jeu;

import uno.cartes.Carte;
import uno.cartes.Couleur;
import uno.interfacegraphique.DialogueLigneCommande;

import java.util.Scanner;

public class JoueurHumain extends Joueur {
    public JoueurHumain(DialogueLigneCommande dlc) {
        super(dlc);
    }

    @Override
    public Carte jouerCarte(Carte c, Couleur couleur) {
        dlc.afficher("Choississez une carte (p pour piocher):");
            int index=dlc.reagir();
            if (index==-1) return null;
            else if (index<monPaquet.getNombreDeCartes()) {
                Carte carte = monPaquet.getByIndex(index);
                if (c.getCouleur() == Couleur.NOIR) {
                    if (carte.getCouleur() == couleur) {
                        monPaquet.enlever(carte);
                        return carte;
                    }
                } else {
                    if (c.peutEtreRecouvertPar(carte)) {
                        monPaquet.enlever(carte);
                        return carte;
                    }
                }
            }
            return null;

    }
}
