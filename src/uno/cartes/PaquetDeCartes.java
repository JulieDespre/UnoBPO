package uno.cartes;


import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class PaquetDeCartes {

    private ArrayList<Carte> paquet;

    public PaquetDeCartes() {
        paquet = new ArrayList<Carte>();
    }

    public PaquetDeCartes(int size) {
        paquet = new ArrayList<Carte>(size);
    }

    public void ajouter(Carte... cartes) {
        for (Carte c : cartes) {
            paquet.add(c);
        }
    }

    public void ajouter(PaquetDeCartes pdc) {
        while (pdc.getNombreDeCartes() > 0) {
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
        //int sommet = 0;
        //if (this.estVide() == true){
            //return sommet;
       // }else {
            return (paquet.get((paquet.size()) - 1));
        //}
    }

    public Carte piocher() {
            Carte newCarte = paquet.get((paquet.size())-1);
            paquet.remove((paquet.size())-1);
            return newCarte;
        }


    public void enlever(Carte carte) {
        for (int i=0; i<paquet.size(); i++){
            if(paquet.get(i).equals(carte)){
                paquet.remove(i);
                break;
            }

            //if (paquet.contains(carte)){
            //paquet.remove(carte);
        }
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
    public void retourner() {
        for (int i=0; i< paquet.size()/2; i++) {
            int taille = paquet.size();
            swap(i, taille-1-i);
        }
        }

    public String toString() {
        StringBuilder sb=new StringBuilder("Paquet:\n");
        for (Carte c : paquet) {
            sb.append(c+"\n");
        }
        return sb.toString();
    }

    public void ecrire(String nomDeFichier) throws ErreurFichier{
        FileWriter flot;
        PrintWriter flotP;


            File monfichier=new File(nomDeFichier);
            if ( monfichier.exists()) throw new ErreurFichier("Le fichier existe déjà.");
           try {
               flot = new FileWriter(monfichier);
               flotP = new PrintWriter(flot);//buggeredwriter amélioré
               for (Carte carte : paquet) {
                   flotP.println("" + carte.getClass().getSimpleName() + " " + carte.getValeur() + " " + carte.getCouleur());
               }

               flotP.close();
           }catch (IOException e){//!IOexception message java
               System.out.println(e.getMessage());
           }

            //tentative pour utiliser l'aide


    }

    }



