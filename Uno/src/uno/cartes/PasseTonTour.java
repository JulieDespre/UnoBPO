package uno.cartes;

import uno.jeu.Uno;

public class PasseTonTour extends Carte{
    public PasseTonTour (Uno uno, int valeur, Couleur couleur){
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
    public boolean peutEtrePoseeSur(PasseTonTour c) {
        return true;
    }
}
