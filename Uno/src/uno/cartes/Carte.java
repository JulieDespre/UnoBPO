package uno.cartes;

import uno.jeu.Uno;

public abstract class Carte {
    protected int valeur;
    protected Couleur couleur;
    protected Uno uno;

    public Carte (Uno u){
        this.uno = u;
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



    public String toString() {
        return "Carte{" +
                "valeur=" + valeur + ", couleur=" + couleur + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}