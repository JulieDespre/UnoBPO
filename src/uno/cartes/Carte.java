package uno.cartes;

import uno.jeu.Uno;
import static uno.cartes.Couleur.NOIR;

/**
 * @author Julie Despré
 * @version janvier 2023
 */

public abstract class Carte {
    protected int valeur;
    protected Couleur couleur;
    protected Uno uno;

    /**
     * Constructeur de carte
     * @param u qui correspond a un uno
     */
    public Carte (Uno u){
        this.uno = u;
    }

    /**
     * Constructeur de carte à parti d'un uno, d'un entier et d'une couleur issue de l'énumération Couleur
     * @param uno
     * @param valeur qui correspond soit au chiffre de la carte soit à sa valeur
     * @param couleur qui est définie dans l'énumération couleur
     */
    public Carte(Uno uno, int valeur, Couleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
        this.uno = uno;
    }
    /**
     * Constructeur de carte sans uno
     * @param valeur qui correspond soit au chiffre de la carte soit à sa valeur
     * @param couleur qui est définie dans l'énumération couleur
     */

    public Carte(int valeur, Couleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }
    /**
     * Retourne valeur d'une carte
     * @return la valeur d'une carte
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * Modifie la valeur d'une carte
     * @param valeur qui est la nouvelle valeur a attribuer à la carte
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /**
     * permet d'accéder à la valeur de la carte choisie
     * sans paramètre
     */
    public Couleur getCouleur() {

        return couleur;
    }

    /**
     * Modifie la couleur d'une carte
     * @param couleur qui est la nouvelle valeur a attribuer à la carte
     */
    public void setCouleur(Couleur couleur) {

        this.couleur = couleur;
    }

    /**
     * permet à la carte d'avoir un effet lors d'une partie de uno, hiéritée aux classes filles
     */
    public abstract void appliquerEffet();

    /**
     * retour true s'il s'agit d'une carte noire (joker ou plus4) sinon retourne false
     */
    public boolean estSansCouleur(){
        if (this.getCouleur() == NOIR){
            return true;
        }
        return false;
    }

    /**
     * retourne true si l'instance de la carte en cours est de la de la même couleur qu'une carte choisie
     * @param c qui est la carte avec laquelle on veut comparer notre carte
     */
    public boolean estDeCouleurCompatibleAvec(Carte c) {
        if (this.getCouleur() == c.getCouleur()){
            return true;
        }
        return false;
    }

    /**
     * abstraite permet de savoir si une carte peut être recouverte par une autre
     * @param c qui peut être recouvrir notre carte
     */
    public abstract boolean peutEtreRecouvertPar(Carte c);

    /**
     * savoir si l'on peut poser carte chiffre sur notre carte
     * @param c qui peut être posée sur notre carte
     */
    public boolean peutEtrePoseeSur(Chiffre c){

        return estDeCouleurCompatibleAvec(c);
    }

    /**
     * savoir si l'on peut poser carte plus2 sur notre carte
     * @param c qui peut être posée sur notre carte
     */
    public boolean peutEtrePoseeSur(Plus2 c){

        return estDeCouleurCompatibleAvec(c);
    }

    /**
     * savoir si l'on peut poser carte plus4 sur notre carte
     * @param c qui peut être posée sur notre carte
     */
    public boolean peutEtrePoseeSur(Plus4 c){

        return estDeCouleurCompatibleAvec(c);
    }

    /**
     * savoir si l'on peut poser carte joker sur notre carte
     * @param c qui peut être posée sur notre carte
     */
    public boolean peutEtrePoseeSur(Joker c){

        return estDeCouleurCompatibleAvec(c);
    }

    /**
     * savoir si l'on peut poser carte changement de sens sur notre carte
     * @param c qui peut être posée sur notre carte
     */
    public boolean peutEtrePoseeSur(ChangementDeSens c){

        return estDeCouleurCompatibleAvec(c);
    }

    /**
     * savoir si l'on peut poser carte passe ton tour sur notre carte
     * @param c qui peut être posée sur notre carte
     */
    public boolean peutEtrePoseeSur(PasseTonTour c){

        return estDeCouleurCompatibleAvec(c);
    }
    void setUno(Uno uno){
        this.uno = uno;
    }

}