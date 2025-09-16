package ex3.entities;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private HashMap<String, String> contatti  = new HashMap<>();

    //3.1
    public boolean aggiungiContatto(String nome, String numeroTelefono){
        contatti.put(nome, numeroTelefono);
        return true;
    }

    //3.2
    public boolean rimuoviContatto(String nome){
        contatti.remove(nome);
        return true;
    }

    //3.3
    public boolean ricercaPersona(String numeroTelefono){

        boolean found = false;

        for(Map.Entry<String, String> entry: contatti.entrySet() ){
            if (entry.getKey().equals(numeroTelefono)) {
                found = true;
                break;
            }
        }
        return found;
    }

    //3.4
    public boolean ricercaNumero(String Nome){
        boolean found = false;
        for(Map.Entry<String,String> entry: contatti.entrySet()){
            if(entry.getValue().equals(Nome)){
                found = true;
                break;
            }
        }
        return found;
    }

    //3.5
    public HashMap<String, String> getContatti() {
        return contatti;
    }
}
