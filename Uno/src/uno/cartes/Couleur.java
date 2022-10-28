package uno.cartes;

public enum Couleur {
    JAUNE("jaune"),BLEU("bleu"),ROUGE("rouge"),VERT("vert"),NOIR("noir");
    private String couleur;

    private Couleur(String couleur) {
        this.couleur=couleur;
    }
    public String getCouleur(){
        return couleur;
    }
    public String toString() {
        return couleur;
    }

}
