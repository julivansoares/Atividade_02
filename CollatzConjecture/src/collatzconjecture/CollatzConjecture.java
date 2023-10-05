package collatzconjecture;

public class CollatzConjecture {
    public static void main(String[] args) {
        int x = 13; 

        while (x != 1) {
            int y;

            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }

            System.out.println("x = " + x + ", y = " + y);

            x = y; 
        }
    }
}
