package exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] contagem = new int[11];
        int maisVotada = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do cliente " + (i + 1) + " (0 a 10): ");
            int nota = sc.nextInt();
            contagem[nota]++;
        }

        for (int nota = 0; nota <= 10; nota++) {
            System.out.println("Nota " + nota + ": " + contagem[nota] + " voto(s)");

            if (contagem[nota] > contagem[maisVotada]) {
                maisVotada = nota;
            }
        }

        System.out.println("Nota mais votada: " + maisVotada);

        sc.close();
    }
}
