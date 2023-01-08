package uno.cartes;

import uno.jeu.Uno;

public class PasseTonTour extends Carte{
    public PasseTonTour (Uno uno, int valeur, Couleur couleur){
        super(uno, valeur, couleur);
        assert valeur>0 && valeur==20  : "la valeur de la carte PasseTonTour n'est pas bonne";
        assert couleur != Couleur.NOIR : "la couleur de la carte PasseTonTour n'est pas bonne";
    }

    //constructeur sans uno
    public PasseTonTour (int valeur, Couleur couleur){
        super(valeur, couleur);
        assert valeur>0 && valeur==20  : "la valeur de la carte PasseTonTour n'est pas bonne";
        assert couleur != Couleur.NOIR : "la couleur de la carte PasseTonTour n'est pas bonne";
    }


    @Override
    public void appliquerEffet() {
        uno.sauterTour();
    }

    @Override
    public boolean peutEtreRecouvertPar(Carte c) {
        return c.peutEtrePoseeSur(this);
    }

    @Override

    public boolean peutEtrePoseeSur(PasseTonTour c) {
        return true;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PasseTonTour) {
            PasseTonTour c = (PasseTonTour) obj;
            boolean res = c.getCouleur() == this.getCouleur();
            return res;
        } else {
            return false;
        }
    }

    public String toString(){
        return "PasseTonTour, "+couleur;
    }
}
