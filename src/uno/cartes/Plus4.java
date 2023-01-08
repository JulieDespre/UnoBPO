package uno.cartes;

import uno.jeu.Uno;

public class Plus4 extends Joker{
    public Plus4(Uno uno, int valeur, Couleur couleur){
        super(uno, valeur, couleur);
        assert valeur>0 && valeur==50  : "la valeur de la carte Plus4 n'est pas bonne";
        assert couleur == Couleur.NOIR : "la couleur de la carte Plus4 n'est pas bonne";
    }

    //constructeur sans uno
    public Plus4(int valeur, Couleur couleur){
        super(valeur, couleur);
        assert valeur>0 && valeur==50  : "la valeur de la carte Plus4 n'est pas bonne";
        assert couleur == Couleur.NOIR : "la couleur de la carte Plus4 n'est pas bonne";
    }
    @Override
    public void appliquerEffet() {
        super.appliquerEffet();
        uno.sauterTour();
        uno.piocher(4);
    }
    @Override
    public boolean peutEtrePoseeSur(Plus4 c) {
        return true;
    }

    @Override
    public String toString(){
        return "Plus4";
    }
}
