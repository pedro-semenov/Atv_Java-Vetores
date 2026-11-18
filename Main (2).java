package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] codigos = {101, 102, 103, 104, 105};
        double[] precos = {5.50, 12.90, 8.75, 20.00, 3.99};
        boolean achou = false;

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                System.out.printf("Preço: R$ %.2f%n", precos[i]);
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("Produto não cadastrado");
        }

        sc.close();
    }
}
