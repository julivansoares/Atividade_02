package verificadorpalindromo;

public class VerificadorPalindromo {
    public static void main(String[] args) {
        String palavra = "arara";

        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String palavra) {
        
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }
}
