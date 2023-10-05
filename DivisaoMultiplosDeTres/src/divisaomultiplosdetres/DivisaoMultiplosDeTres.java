package divisaomultiplosdetres;

public class DivisaoMultiplosDeTres {
    public static void main(String[] args) {
        System.out.println("Resultado da divisão por 2 dos múltiplos de 3 entre 1 e 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {  
                int resultadoInt = i / 2;
                double resultadoDouble = (double) i / 2.0;  

                System.out.println("Número: " + i + ", Resultado (int): " + resultadoInt + ", Resultado (double): " + resultadoDouble);
            }
        }
    }
}
