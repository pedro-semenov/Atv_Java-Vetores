package exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[6];
        double[] totais = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Nome do vendedor " + (i + 1) + " (sem espaços): ");
            nomes[i] = sc.next();
            System.out.print("Total vendido: ");
            totais[i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            int posMaior = i;

            for (int j = i + 1; j < 6; j++) {
                if (totais[j] > totais[posMaior]) {
                    posMaior = j;
                }
            }

            double auxTotal = totais[i];
            totais[i] = totais[posMaior];
            totais[posMaior] = auxTotal;

            String auxNome = nomes[i];
            nomes[i] = nomes[posMaior];
            nomes[posMaior] = auxNome;
        }

        System.out.println("Ranking de vendedores:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%dº - %s: R$ %.2f%n", i + 1, nomes[i], totais[i]);
        }

        sc.close();
    }
}
