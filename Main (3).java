package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] antes = new double[8];
        double[] depois = new double[8];
        double aumentoTotal = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Salário do funcionário " + (i + 1) + ": ");
            antes[i] = sc.nextDouble();

            if (antes[i] >= 5000) {
                depois[i] = antes[i];
            } else {
                depois[i] = antes[i] * 1.10;
                if (depois[i] > 5000) {
                    depois[i] = 5000;
                }
            }

            aumentoTotal += depois[i] - antes[i];
        }

        for (int i = 0; i < 8; i++) {
            System.out.printf("Funcionário %d: antes R$ %.2f | depois R$ %.2f%n", i + 1, antes[i], depois[i]);
        }

        System.out.printf("Aumento total da folha: R$ %.2f%n", aumentoTotal);

        sc.close();
    }
}
