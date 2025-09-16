package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex2Main {
    public static void main(String[] args) {

        // 1
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numCasuali;

        //1.1
        System.out.println("Inserisci un valore per la dimensione: ");
        int n = Integer.parseInt(scanner.nextLine());
        numCasuali = listaInteriCasuali(n);
        System.out.println("Lista di N interi casuali da  0 a 100: " + numCasuali);

        //1.2
        ArrayList<Integer> oldReversList;
        oldReversList = newList(numCasuali);
        System.out.println("Lista con i vecchi valore e gli stessi ma invertiti " + oldReversList);

        //1.3
        System.out.println("Inserisci un numero per visualizzare i valori nelle posizioni pari o nelle posizioni dispari: (0 - dispari) (1 - pari)");
        int scelta = Integer.parseInt(scanner.nextLine());

        switch (scelta){
            case 0 -> booleanList(numCasuali, false);
            case 1 -> booleanList(numCasuali, true);
            default -> System.out.println("Attenzione, inserire il numero corretto");
        }

    }

    //1.1
    public static ArrayList<Integer> listaInteriCasuali(int N){
        Random rdmInteri = new Random();
        ArrayList<Integer> numRandom = new ArrayList<>();
        for(int i = 0; i<N;i++){
            numRandom.add(rdmInteri.nextInt(0,100 ));
        }
        return numRandom;
    }

    //1.2
    public static ArrayList<Integer> newList(ArrayList<Integer> oldList){

        ArrayList<Integer> reversedList = new ArrayList<>(oldList);
        ArrayList<Integer> newList = new ArrayList<>(oldList);
        Collections.reverse(reversedList);
        newList.addAll(reversedList);
        return newList;
    }

    //1.3
    public static void booleanList(ArrayList<Integer> numList, boolean pariOdispari){

        for(int i = 0; i <= numList.size(); i++){
            if (pariOdispari) {
                if (i %2 == 0) {
                    System.out.println(numList.get(i));
                }
            } else {
                if(i % 2 != 0){
                    System.out.println(numList.get(i));
                }
            }

        }
    }
}
