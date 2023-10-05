package contadorcaracteres;

import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int vogais = contarVogais(frase);
        int espacos = contarEspacos(frase);
        int consoantes = contarConsoantes(frase);

        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de espaços em branco: " + espacos);
        System.out.println("Número de consoantes: " + consoantes);
    }

    public static int contarVogais(String frase) {
        int count = 0;
        String vogais = "AEIOUaeiou";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (vogais.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static int contarEspacos(String frase) {
        int count = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    public static int contarConsoantes(String frase) {
        int count = 0;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (letras.indexOf(c) != -1 && "AEIOUaeiou".indexOf(c) == -1) {
                count++;
            }
        }

        return count;
    }
}
