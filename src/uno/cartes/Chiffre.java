package uno.cartes;

import uno.jeu.Uno;

public class Chiffre extends Carte{
    protected int numero;
    public Chiffre(Uno uno, int valeur, Couleur couleur){
        super(uno, valeur, couleur);
        this.numero = valeur;
        assert valeur>=0 && valeur<10  : "la valeur de la carte chiffre n'est pas bonne";
        assert couleur != Couleur.NOIR : "la couleur de la carte chiffre n'est pas bonne";
    }
    public int getNumero(){
        return numero;
    }

    @Override
    public void appliquerEffet() {
    }

    @Override
    public boolean peutEtreRecouvertPar(Carte c){

        return c.peutEtrePoseeSur(this);
    }

    @Override
    public boolean peutEtrePoseeSur(Chiffre c) {
        if (estDeCouleurCompatibleAvec(c) || this.getNumero() == c.getNumero()){
            return true;
        }
        return false;

    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Chiffre){
            Chiffre c = (Chiffre)obj;
            boolean res = c.getValeur() == this.getValeur() && c.getCouleur() == this.getCouleur();
            return res;
        } else {
            return false;
        }
    }

}
