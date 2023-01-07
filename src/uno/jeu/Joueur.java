package uno.jeu;

import uno.cartes.Carte;
import uno.cartes.Couleur;
import uno.cartes.FabriqueCartes;
import uno.cartes.PaquetDeCartes;
import uno.interfacegraphique.DialogueLigneCommande;

import java.util.Scanner;

public abstract class Joueur {

    protected PaquetDeCartes monPaquet;
    protected DialogueLigneCommande dlc;

    public Joueur(DialogueLigneCommande dlc){
        monPaquet= FabriqueCartes.getFabrique().getPaquetVide();
        this.dlc=dlc;
    }

    public void ajouterCarte(Carte c){
        monPaquet.ajouter(c);
    }

    public boolean estVide(){
        return monPaquet.estVide();
    }

    public boolean estUno(){
        return monPaquet.getNombreDeCartes()==1;
    }

    public Couleur getCouleur(){
        Couleur c= monPaquet.getByIndex(0).getCouleur();
        dlc.afficher("Couleur choisie: "+c);
        return c;
    }

    public abstract Carte jouerCarte(Carte c, Couleur couleur);

    public String toString(){
        return monPaquet.toString();
    }

}
