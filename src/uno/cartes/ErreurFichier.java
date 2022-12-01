package uno.cartes;

import java.io.IOException;

public class ErreurFichier extends IOException {

    String message;

    public ErreurFichier(String message){

        this.message=message;
    }

    public String getMessage(){
        return "ErreurFichier: "+message;
    }
}
