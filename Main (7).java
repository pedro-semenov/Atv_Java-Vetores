package exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de vendas da filial A: ");
        int tamA = sc.nextInt();
        double[] a = new double[tamA];
        for (int x = 0; x < tamA; x++) {
            System.out.print("Filial A, venda " + (x + 1) + " (ordem crescente): ");
            a[x] = sc.nextDouble();
        }

        System.out.print("Quantidade de vendas da filial B: ");
        int tamB = sc.nextInt();
        double[] b = new double[tamB];
        for (int x = 0; x < tamB; x++) {
            System.out.print("Filial B, venda " + (x + 1) + " (ordem crescente): ");
            b[x] = sc.nextDouble();
        }

        double[] resultado = new double[tamA + tamB];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < tamA && j < tamB) {
            if (a[i] <= b[j]) {
                resultado[k] = a[i];
                i++;
            } else {
                resultado[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < tamA) {
            resultado[k] = a[i];
            i++;
            k++;
        }

        while (j < tamB) {
            resultado[k] = b[j];
            j++;
            k++;
        }

        System.out.println("Relatório unificado:");
        for (int x = 0; x < resultado.length; x++) {
            System.out.printf("R$ %.2f%n", resultado[x]);
        }

        sc.close();
    }
}
