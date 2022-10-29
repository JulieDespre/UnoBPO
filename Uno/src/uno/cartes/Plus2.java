package uno.cartes;

import uno.jeu.Uno;

public class Plus2 extends Carte{

    public Plus2(Uno uno, int valeur, Couleur couleur){
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
    public boolean peutEtrePoseeSur(Plus2 c) {
        return true;
    }
}
