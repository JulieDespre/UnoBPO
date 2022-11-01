package uno.cartes;

import uno.jeu.Uno;

public class Plus2 extends Carte{

    public Plus2(Uno uno, int valeur, Couleur couleur){
        super(uno, valeur, couleur);
        assert valeur>0 && valeur == 20 : "la valeur de la carte Plus2 n'est pas bonne";
        assert couleur != Couleur.NOIR : "la couleur de la carte Plus2 n'est pas bonne";
    }

    @Override
    public void appliquerEffet() {

    }

    @Override
    public boolean peutEtreRecouvertPar(Carte c) {
        return c.peutEtrePoseeSur(this);
    }

    @Override
    public boolean peutEtrePoseeSur(Plus2 c) {
        return true;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Plus2) {
            Plus2 c = (Plus2) obj;
            boolean res = c.getCouleur() == this.getCouleur();
            return res;
        } else {
            return false;
        }
    }
}
