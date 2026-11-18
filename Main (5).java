package exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] senhas = new int[10];
        boolean[] idoso = new boolean[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Senha da posição " + (i + 1) + ": ");
            senhas[i] = sc.nextInt();
            System.out.print("É idoso? (s/n): ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("s")) {
                idoso[i] = true;
            }
        }

        System.out.print("Fila inicial: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(senhas[i]);
            if (idoso[i]) {
                System.out.print("(idoso)");
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int atendimento = 1; atendimento <= 3; atendimento++) {
            int posChamado = 0;
            for (int i = 9; i >= 0; i--) {
                if (idoso[i]) {
                    posChamado = i;
                }
            }

            System.out.println("Atendimento " + atendimento + " - senha chamada: " + senhas[posChamado]);

            for (int i = posChamado; i < 9; i++) {
                senhas[i] = senhas[i + 1];
                idoso[i] = idoso[i + 1];
            }
            senhas[9] = 0;
            idoso[9] = false;

            System.out.print("Fila: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(senhas[i]);
                if (idoso[i]) {
                    System.out.print("(idoso)");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
