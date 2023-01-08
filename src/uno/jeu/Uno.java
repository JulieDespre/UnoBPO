package uno.jeu;

import uno.cartes.Carte;
import uno.cartes.Couleur;
import uno.cartes.FabriqueCartes;
import uno.cartes.PaquetDeCartes;
import uno.interfacegraphique.DialogueLigneCommande;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Uno {
    private Joueur[] joueurs;
    private int indexJoueurCourant;
    private PaquetDeCartes pioche;
    private PaquetDeCartes talon;
    private Sens sens=Sens.HORAIRE;
    private DialogueLigneCommande dlc;
    private Couleur couleur=Couleur.ROUGE;

    //Constructeur utilisé dans les premiers tests avant que le design du uno soit revelé, permet de ne pas tout réécrire dans la factory.
    public Uno(){
    }

    //passer le constructeur en private static
    public Uno(int nbJoueurs, DialogueLigneCommande dlc) {
        this.dlc=dlc;
        creerLesJoueurs(nbJoueurs);
        indexJoueurCourant=0;
        FabriqueCartes maFabrique=FabriqueCartes.getFabrique();
        pioche=maFabrique.getPaquetStandard(this);
        talon=maFabrique.getPaquetVide();
        sens=Sens.HORAIRE;
        distribuer();
    }
    private void creerLesJoueurs(int nbJoueurs){
        joueurs = new Joueur[nbJoueurs];
        joueurs[0]= new JoueurHumain(dlc);
        for (int i =1; i<nbJoueurs; i++){
            joueurs[i] = new Bot(dlc);
        }
    }

    private void distribuer(){
        pioche.melanger();
        for (int i=0;i<7;i++){
            for (Joueur joueur : joueurs){
                Carte c=pioche.piocher();
                joueur.ajouterCarte(c);
            }
        }
        Carte c=pioche.piocher();
        talon.ajouter(c);
    }

    public String toString(){
        return joueurs[0].toString();
    }

    private void remelanger(){
        for (Carte c:talon){
            pioche.ajouter(c);
        }
        talon=new PaquetDeCartes();
        pioche.melanger();
        talon.ajouter(pioche.piocher());
    }

    private boolean tourDeJeu(){
        Joueur joueur=joueurs[((indexJoueurCourant%joueurs.length)+joueurs.length)%joueurs.length];
        Carte carteJoueur=joueur.jouerCarte(talon.getSommet(),couleur);
        if (carteJoueur==null) {
            if (pioche.estVide()) remelanger();
            Carte c=pioche.piocher();
            if (talon.getSommet().peutEtreRecouvertPar(c)) talon.ajouter(c);
            else joueur.ajouterCarte(c);
        }
        else {
            talon.ajouter(carteJoueur);
            if (joueur.estVide()) return true;
            else if (joueur.estUno()) dlc.afficher("Joueur "+((indexJoueurCourant%joueurs.length)+joueurs.length)%joueurs.length+": Uno!");
            carteJoueur.appliquerEffet();
        }
        return joueur.estVide();
    }

    public void partie(){
        dlc.afficher("Talon: "+talon.getSommet());
        if (talon.getSommet().getCouleur()==Couleur.NOIR) dlc.afficher("Couleur choisie: "+couleur);
        dlc.afficher(this.toString());
        boolean fini=tourDeJeu();
        while (!fini){
            dlc.afficher("Talon (joueur "+((indexJoueurCourant%joueurs.length)+joueurs.length)%joueurs.length+"): "+talon.getSommet());
            if (sens==Sens.HORAIRE) indexJoueurCourant++;
            else indexJoueurCourant--;
            if (((indexJoueurCourant%joueurs.length)+joueurs.length)%joueurs.length==0) dlc.afficher(this.toString());
            fini=tourDeJeu();
        }
        dlc.afficher("Joueur "+((indexJoueurCourant%joueurs.length)+joueurs.length)%joueurs.length+" a gagné!");
    }

    public void changer2sens(){
        sens=sens.inverser();
    }

    public void setCouleur(){
        if (((indexJoueurCourant%joueurs.length)+joueurs.length)%joueurs.length==0) {
            String c=dlc.reagirJoker();
            switch (c) {
                case "r":
                    couleur = Couleur.ROUGE;
                    break;
                case "v":
                    couleur = Couleur.VERT;
                    break;
                case "b":
                    couleur = Couleur.BLEU;
                    break;
                case "j":
                    couleur = Couleur.JAUNE;
                    break;
            }
        } else {
            Joueur joueur=joueurs[((indexJoueurCourant%joueurs.length)+joueurs.length)%joueurs.length];
            couleur=joueur.getCouleur();
        }
    }

    public void sauterTour(){
        if (sens==Sens.HORAIRE) indexJoueurCourant++;
        else indexJoueurCourant--;
    }

    public void piocher(int nbCartes){
        Joueur joueur=joueurs[((indexJoueurCourant%joueurs.length)+joueurs.length)%joueurs.length];
        for (int i=0;i<nbCartes;i++) {
            if (pioche.estVide()) remelanger();
            Carte c = pioche.piocher();
            joueur.ajouterCarte(c);
        }
    }

}