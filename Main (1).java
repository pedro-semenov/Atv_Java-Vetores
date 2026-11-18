package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] estoque = new int[10];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Estoque do produto " + (i + 1) + ": ");
            estoque[i] = sc.nextInt();
        }

        System.out.println("Produtos com estoque menor que 5:");
        for (int i = 0; i < 10; i++) {
            if (estoque[i] < 5) {
                contador++;
                System.out.println("Posição " + (i + 1) + ": " + estoque[i] + " unidade(s)");
            }
        }

        System.out.println("Quantidade de produtos críticos: " + contador);

        sc.close();
    }
}
