package numerosprimos;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            boolean ehPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(i);
            }
        }
    }
}
