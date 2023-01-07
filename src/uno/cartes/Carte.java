package uno.cartes;

import uno.jeu.Uno;


import static uno.cartes.Couleur.NOIR;

public abstract class Carte {
    protected int valeur;
    protected Couleur couleur;
    protected Uno uno;

    public Carte (Uno u){
        this.uno = u;
    }

    public Carte(Uno uno, int valeur, Couleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
        this.uno = uno;
    }

    public Carte(int valeur, Couleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Couleur getCouleur() {

        return couleur;
    }

    public void setCouleur(Couleur couleur) {

        this.couleur = couleur;
    }
    public abstract void appliquerEffet();

    public boolean estSansCouleur(){
        if (this.getCouleur() == NOIR){
            return true;
        }
        return false;
    }
    public boolean estDeCouleurCompatibleAvec(Carte c) {
        if (this.getCouleur() == c.getCouleur()){
            return true;
        }
        return false;
    }
    public abstract boolean peutEtreRecouvertPar(Carte c);
    public boolean peutEtrePoseeSur(Chiffre c){

        return estDeCouleurCompatibleAvec(c);
    }

    public boolean peutEtrePoseeSur(Plus2 c){

        return estDeCouleurCompatibleAvec(c);
    }

    public boolean peutEtrePoseeSur(Plus4 c){

        return estDeCouleurCompatibleAvec(c);
    }

    public boolean peutEtrePoseeSur(Joker c){

        return estDeCouleurCompatibleAvec(c);
    }

    public boolean peutEtrePoseeSur(ChangementDeSens c){

        return estDeCouleurCompatibleAvec(c);
    }

    public boolean peutEtrePoseeSur(PasseTonTour c){

        return estDeCouleurCompatibleAvec(c);
    }
    void setUno(Uno uno){
        this.uno = uno;
    }

}