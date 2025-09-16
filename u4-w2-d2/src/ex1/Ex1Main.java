package ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            Set<String> paroleDistinte = new HashSet<>();
            Set<String> paroleDuplicate = new HashSet<>();
            System.out.println("Inserisci un valore:");
            int N = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < N; i++) {
                System.out.println("Inserisci una parola:");
                String parola = scanner.nextLine();
               boolean parolaGiaPresente = paroleDistinte.add(parola);
               if (!parolaGiaPresente){
                    paroleDuplicate.add(parola);
               } else{
                   paroleDistinte.add(parola);
               }
            }
            System.out.println("Numero di parole distinte inserite: " + paroleDistinte.size());
            System.out.println("Il set di parole distinte inserite è questo: " + paroleDistinte);

            System.out.println("Il set di parole duplicate è questo: " + paroleDuplicate);

        }catch (NumberFormatException err){
            System.out.println("ERROR: non hai inserito un numero intero valido");
        };
    }
}
