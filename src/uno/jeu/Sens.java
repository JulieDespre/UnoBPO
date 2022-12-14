package uno.jeu;

public enum Sens {
       HORAIRE(1),ANTIHORAIRE(-1);
        private int sens;

        private Sens(int sens) {

            this.sens=sens;
        }


        public int getSens(){

            return sens;
        }
        //public int inverser(){
       // }
}
