package uno.cartes;

import uno.jeu.Uno;

public class ChangementDeSens extends Carte{


    public /**
     * Constructeur de carte type spécifique à parti d'un uno, d'un entier et d'une couleur issue de l'énumération Couleur
     * @param uno
     * @param valeur qui correspond soit au chiffre de la carte soit à sa valeur
     * @param couleur qui est définie dans l'énumération couleur
     */ChangementDeSens (Uno uno, int valeur, Couleur couleur){
        super(uno, valeur, couleur);
        assert valeur>0 && valeur==20  : "la valeur de la carte changement de sens n'est pas bonne";
        assert couleur != Couleur.NOIR : "la couleur de la carte changemet de sens n'est pas bonne";

    }
    /**
     * Constructeur de carte type spécifique à parti d'un uno, d'un entier et d'une couleur issue de l'énumération Couleur
     * @param valeur qui correspond soit au chiffre de la carte soit à sa valeur
     * @param couleur qui est définie dans l'énumération couleur
     */
    //constructeur sans uno
    public ChangementDeSens (int valeur, Couleur couleur){
        super(valeur, couleur);
        assert valeur>0 && valeur==20  : "la valeur de la carte changement de sens n'est pas bonne";
        assert couleur != Couleur.NOIR : "la couleur de la carte changemet de sens n'est pas bonne";

    }
    @Override
    public void appliquerEffet() {
        uno.changer2sens();
    }

    /**
     * permet de savoir si une carte peut être recouvert
     * @param c carte qui reconvre notre
     */
    @Override
    public boolean peutEtreRecouvertPar(Carte c) {
        return c.peutEtrePoseeSur(this);
    }

    /**
     * permet de savoir si une carte peut être poser sur notre carte
     * @param c carte spé  qui reconvre notre
     */
    @Override
    public boolean peutEtrePoseeSur(ChangementDeSens c) {
        return true;
    }

    /**
     * compare le type et la couleur de la carte
     * @param obj avec lequel on veut comparer notre carte
     */
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

    /**
     * affiche le type et la couleur de notre carte
     * sans paramètre
     */
    public String toString(){
        return "ChangementDeSens, "+couleur;
    }
}
