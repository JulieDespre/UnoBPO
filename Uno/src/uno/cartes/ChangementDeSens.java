package uno.cartes;

import uno.jeu.Uno;

public class ChangementDeSens extends Carte{

    public ChangementDeSens (Uno uno, int valeur, Couleur couleur){
        super(uno, valeur, couleur);
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

}
