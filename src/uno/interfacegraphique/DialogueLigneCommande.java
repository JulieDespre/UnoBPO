package uno.interfacegraphique;

import uno.jeu.Uno;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class DialogueLigneCommande {
    Scanner sc=new Scanner(System.in);

    public DialogueLigneCommande(){

    }

    public void lancerPartie(){
        Uno uno=new Uno(4,this);
        uno.partie();
    }

    public void afficher(String s){
        System.out.println(s);
    }

    public String reagirJoker(){
        afficher("r pour rouge, v pour vert, b pour bleu, j pour jaune");
        String c = sc.nextLine();
        while (!c.equals("r") && !c.equals("v") && !c.equals("b") && !c.equals("j")) {
            afficher("Essaie encore...");
            c = sc.nextLine();
        }
        return c;
    }

    public int reagir(){
        String str=sc.nextLine();
        if (str.equals("p")) return -1;
        return Integer.parseInt(str);
    }

    public static void main(String[] args){
        new DialogueLigneCommande().lancerPartie();
    }

}
