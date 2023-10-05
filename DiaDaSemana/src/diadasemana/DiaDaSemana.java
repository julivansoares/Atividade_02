package diadasemana;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] diasDaSemana = {
            "Segunda-feira",
            "Terça-feira",
            "Quarta-feira",
            "Quinta-feira",
            "Sexta-feira",
            "Sábado",
            "Domingo"
        };
        
        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();
        
       
        if (numero >= 1 && numero <= 7) {
            
            int indice = numero - 1;
            String diaDaSemana = diasDaSemana[indice];
            System.out.println("O dia da semana correspondente é: " + diaDaSemana);
        } else {
            System.out.println("Número fora do intervalo válido.");
        }
    }
}
