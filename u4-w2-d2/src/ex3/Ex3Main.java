package ex3;


import ex3.entities.RubricaTelefonica;

import java.util.Scanner;

public class Ex3Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RubricaTelefonica rubrica = new RubricaTelefonica();
        int scelta;

        do{

            System.out.println("(0 - Exit) (1 - Salva Contatto) (2 - Cancella contatto) (3 - Ricerca contatto) (4 - Ricerca numero di telefono) (5 - Lista Contatti)");
            scelta = Integer.parseInt(scanner.nextLine());

            switch(scelta){
                case 0:
                    break;
                case 1:
                    System.out.println("Inserire il nome del contatto:");
                    String nomeContatto = scanner.nextLine();
                    System.out.println("Inserire il numero di telefono:");
                    String numeroContatto = scanner.nextLine();

                    if(rubrica.aggiungiContatto(nomeContatto, numeroContatto)){
                        System.out.println("Contatto aggiunto");
                    }else{
                        System.out.println("Contatto da salvare non trovato, prego riprovare");
                    }
                    break;
                case 2:
                    System.out.println("Inserire il contatto da cancellare:");
                    String contatto = scanner.nextLine();

                    if(rubrica.rimuoviContatto(contatto)){
                        System.out.println("Contatto rimosso");
                    } else{
                        System.out.println("Contatto da rimuovere non trovato, prego riprovare");
                    }
                    break;
                case 3:
                    System.out.println("Inserisci il contatto da ricercare:");
                    String ricercaContatto = scanner.nextLine();

                    boolean foundPersona = rubrica.ricercaPersona(ricercaContatto);

                    if (foundPersona){
                        System.out.println("Contatto trovato");
                    } else {
                        System.out.println("Contatto non ritrovato nella rubrica");
                    }
                    break;
                case 4:
                    System.out.println("Inserisci il numero del contatto da cercare");
                    String numeroRicercato = scanner.nextLine();
                    boolean foundNumero = rubrica.ricercaNumero(numeroRicercato);
                    if (foundNumero){
                        System.out.println("Numero del contatto trovato");
                    } else {
                        System.out.println("Numero del contatto non ritrovato nella rubrica");
                    }
                    break;
                case 5:
                    System.out.println("|La tua Rubrica|");
                    System.out.println(rubrica.getContatti());
                    break;
                default:
                    System.out.println("Attenzione, inserire il comando giusto");
            }

        }while(scelta != 0);

    }
}
