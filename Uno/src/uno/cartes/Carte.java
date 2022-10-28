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

    public Carte(Uno u, int v, Couleur c) {
        this.valeur = v;
        this.couleur = c;
        this.uno = u;
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
        }
        return true;
    }
    public boolean estDeCouleurCompatibleAvec(Carte c) {
        if (this.getCouleur() == c.getCouleur()){
            return true;
        }
        return false;
    }
    public abstract boolean peutEtreRecouvertPar (Carte c);

    public abstract boolean peutEtrePoseeSur (Plus2 c);

    public abstract boolean peutEtrePoseeSur (Plus4 c);

    public abstract boolean peutEtrePoseeSur (Joker c);

    public abstract boolean peutEtrePoseeSur (ChangementDeSens c);

    public abstract boolean peutEtrePoseeSur (PasseTonTour c);

    public String toString() {
        return "Carte{" +
                "valeur=" + valeur + ", couleur=" + couleur + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}