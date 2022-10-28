package uno.cartes;

import uno.jeu.Uno;

public class Chiffre extends Carte{
    protected int numero;
    public Chiffre(Uno uno, int valeur, Couleur couleur){
        super(uno, valeur, couleur);
        this.numero = valeur;
    }
    public int getNumero(){
    return numero;
    }

    @Override
    public void appliquerEffet() {
    }

    @Override
    public boolean peutEtreRecouvertPar(Carte c) {
        return false;
    }
    @Override
    public boolean peutEtrePoseeSur(Chiffre c) {
        if (estDeCouleurCompatibleAvec(c) || this.getNumero() == c.getNumero()){
            return true;
        }
        return false;
    }
    @Override
    public boolean peutEtrePoseeSur(Plus2 c) {
        return estDeCouleurCompatibleAvec(c);
    }

    @Override
    public boolean peutEtrePoseeSur(Plus4 c) {
        return estDeCouleurCompatibleAvec(c);
    }

    @Override
    public boolean peutEtrePoseeSur(Joker c) {
        return estDeCouleurCompatibleAvec(c);
    }

    @Override
    public boolean peutEtrePoseeSur(ChangementDeSens c) {
        return estDeCouleurCompatibleAvec(c);
    }

    @Override
    public boolean peutEtrePoseeSur(PasseTonTour c) {
        return estDeCouleurCompatibleAvec(c);
    }


}
