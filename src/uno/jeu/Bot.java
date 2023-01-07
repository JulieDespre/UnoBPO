package uno.jeu;

import uno.cartes.Carte;
import uno.cartes.Couleur;
import uno.interfacegraphique.DialogueLigneCommande;

import java.util.Scanner;

public class Bot extends Joueur {
    public Bot(DialogueLigneCommande dlc) {
        super(dlc);
    }

    @Override
    public Carte jouerCarte(Carte c, Couleur couleur) {
        if (c.getCouleur()==Couleur.NOIR){
            for (Carte carte : monPaquet) {
                if (carte.getCouleur()==couleur) {
                    monPaquet.enlever(carte);
                    return carte;
                }
            }
        } else {
            for (Carte carte : monPaquet) {
                if (c.peutEtreRecouvertPar(carte)) {
                    monPaquet.enlever(carte);
                    return carte;
                }
            }
        }
        return null;
    }
}
