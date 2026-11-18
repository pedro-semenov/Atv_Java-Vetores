package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double[] vendas = new double[7];
        double total = 0;
        int posMaior = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Faturamento de " + dias[i] + ": ");
            vendas[i] = sc.nextDouble();
            total += vendas[i];

            if (vendas[i] > vendas[posMaior]) {
                posMaior = i;
            }
        }

        double media = total / 7;

        System.out.printf("Total da semana: R$ %.2f%n", total);
        System.out.printf("Média diária: R$ %.2f%n", media);
        System.out.printf("Dia que mais vendeu: %s (R$ %.2f)%n", dias[posMaior], vendas[posMaior]);

        sc.close();
    }
}
