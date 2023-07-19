package Application;

import Entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Aluguel[] vetor = new Aluguel[10];
        System.out.println("quantos quartos seram alugados? ");
        int n = sc.nextInt();

        int i;
        for (i = 1; i <= n; i++) {
            System.out.println("Aluguel #" + i + ":");
            System.out.print("nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println();
            System.out.println("email: ");
            String email = sc.next();
            System.out.println("quarto: ");
            int quarto = sc.nextInt();

            Aluguel aluguel = new Aluguel(name, email);

            vetor[quarto] = aluguel;
        }
        System.out.println();
        System.out.println("quartos ocupados: ");

        for (i = 0; i < 10; i++) {
            if (vetor[i] != null) {

                System.out.println(i + ": " + vetor[i]);
            }
        }

        sc.close();
    }
}