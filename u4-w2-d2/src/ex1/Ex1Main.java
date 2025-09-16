package ex1;

import java.util.HashSet;
import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<String> stringSet = new HashSet<>();


        System.out.println("Inserisci un valore:");
        int N = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < N; i++){
            System.out.println("Inserisci una parola:");
            stringSet.add(scanner.nextLine());
        }

        System.out.println("Il set di parole inserite è questo: " + stringSet );
    }
}
