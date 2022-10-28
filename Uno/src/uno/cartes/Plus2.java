package uno.cartes;

import uno.jeu.Uno;

public class Plus2 extends Carte{

    public Plus2(Uno u, int v, Couleur c){
        super(u, v, c);
    }

    @Override
    public void appliquerEffet() {

    }

    @Override
    public boolean peutEtreRecouvertPar(Carte c) {
        return false;
    }

    @Override
    public boolean peutEtrePoseeSur(Plus2 c) {
        return false;
    }

    @Override
    public boolean peutEtrePoseeSur(Plus4 c) {
        return false;
    }

    @Override
    public boolean peutEtrePoseeSur(Joker c) {
        return false;
    }

    @Override
    public boolean peutEtrePoseeSur(ChangementDeSens c) {
        return false;
    }

    @Override
    public boolean peutEtrePoseeSur(PasseTonTour c) {
        return false;
    }
}
