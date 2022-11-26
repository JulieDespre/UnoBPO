package uno.cartes;

import uno.jeu.Uno;

public class ChangementDeSens extends Carte{

    public ChangementDeSens (Uno uno, int valeur, Couleur couleur){
        super(uno, valeur, couleur);
        assert valeur>0 && valeur==20  : "la valeur de la carte changement de sens n'est pas bonne";
        assert couleur != Couleur.NOIR : "la couleur de la carte changemet de sens n'est pas bonne";

    }

    //constructeur sans uno
    public ChangementDeSens (int valeur, Couleur couleur){
        super(valeur, couleur);
        assert valeur>0 && valeur==20  : "la valeur de la carte changement de sens n'est pas bonne";
        assert couleur != Couleur.NOIR : "la couleur de la carte changemet de sens n'est pas bonne";

    }
    @Override
    public void appliquerEffet() {

    }

    @Override
    public boolean peutEtreRecouvertPar(Carte c) {
        return c.peutEtrePoseeSur(this);
    }

    @Override
    public boolean peutEtrePoseeSur(ChangementDeSens c) {
        return true;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChangementDeSens) {
            ChangementDeSens c = (ChangementDeSens) obj;
            boolean res = c.getCouleur() == this.getCouleur();
            return res;
        } else {
            return false;
        }
    }

}
