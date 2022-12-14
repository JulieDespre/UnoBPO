package uno.jeu;

import uno.cartes.PaquetDeCartes;

public class Uno {
    private Joueurs[] joueurs;
    private int indexJoueurCourant;
    private PaquetDeCartes pioche;
    private PaquetDeCartes Talon;
    private Sens sens;

    //passer le constructeur en private static
    public Uno() {
        Uno uno = new Uno();


    }
    void crerLesJoueurs(int nbJoueurs){
        joueurs = new Joueurs[nbJoueurs];
        joueurs[0]= new JoueurHumain();
        for (int i =1; i<nbJoueurs; i++){
            joueurs[i] = new Bot ("Bot" + i);
        }
    }

    void initialiserPioche(){

    }
}