package calculoconsumo;

import java.util.Scanner;

public class CalculoConsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometragemTotal = 0; 
        int litrosTotais = 0; 
        int tanque = 1; 

        while (true) {
            System.out.print("Digite os quilômetros dirigidos no tanque " + tanque + " (ou -1 para sair): ");
            int quilometragem = scanner.nextInt();

            if (quilometragem == -1) {
                break;
            }

            System.out.print("Digite a quantidade de litros utilizados no tanque " + tanque + ": ");
            int litros = scanner.nextInt();

            float consumo = (float) quilometragem / litros;
            System.out.println("Consumo no tanque " + tanque + ": " + consumo + " km/l");

            quilometragemTotal += quilometragem; 
            litrosTotais += litros; 
            tanque++; 
        }

        if (tanque > 1) {
            float consumoMedio = (float) quilometragemTotal / litrosTotais;
            System.out.println("Consumo médio geral: " + consumoMedio + " km/l");
            System.out.println("Quilometragem total: " + quilometragemTotal + " km");
            System.out.println("Total de litros consumidos: " + litrosTotais + " litros");
        } else {
            System.out.println("Nenhum dado foi inserido. O programa foi encerrado.");
        }
    }
}
