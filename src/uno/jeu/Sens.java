package uno.jeu;

public enum Sens {
       HORAIRE(1),ANTIHORAIRE(-1);
        private int sens;

        private Sens(String sens) {
            this.sens=sens;
        }


        public int getSens(){
            return sens;
        }
}
