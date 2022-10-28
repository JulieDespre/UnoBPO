package uno.cartes;


import java.util.ArrayList;
import java.util.Random;

public class PaquetDeCartes {

    private ArrayList<Carte> paquet;

    public PaquetDeCartes(){
        paquet = new ArrayList<Carte> ();
    }
    public PaquetDeCartes(int size){
        paquet = new ArrayList<Carte> (size);
    }

    public void ajouter (Carte... cartes){
        for (Carte c : cartes) {
            paquet.add(c);
        }
    }

    public void ajouter (PaquetDeCartes pdc){
        while (pdc.getNombreDeCartes()<0){
            Carte addCarte = pdc.piocher();
            paquet.add(addCarte);
        }
    }

    public int getNombreDeCartes() {
        return paquet.size();
    }

    public boolean estVide() {
        if (paquet.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    public int getValeur() {
        int somme = 0;
        for (Carte c : paquet) {
            somme = somme + c.getValeur();
        }
        return somme;
    }

    public Carte getSommet() {
        return (paquet.get((paquet.size())-1));
    }

    public Carte piocher() {
        Carte newCarte = paquet.get((paquet.size())-1);
        paquet.remove((paquet.size())-1);
        return newCarte;
    }

    public void melanger() {
        Random g = new Random();
        for (int i=0; i<20; i++) {
            swap(g.nextInt(paquet.size()),g.nextInt(paquet.size()));
        }
    }

    private void swap(int i,int j) {
        Carte tempCarte = paquet.get(i);
        paquet.set(i,paquet.get(j));
        paquet.set(j,tempCarte);
    }

    public String toString() {
        StringBuilder sb=new StringBuilder("Paquet:\n");
        for (Carte c : paquet) {
            sb.append(c+"\n");
        }

        return sb.toString();
    }




}