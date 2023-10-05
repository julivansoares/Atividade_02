package calculadoraareacirculo;

import java.util.Scanner;

public class CalculadoraAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = calcularAreaCirculo(raio);

        System.out.println("A área do círculo é: " + Math.round(area));
    }

    public static double calcularAreaCirculo(double raio) {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}

