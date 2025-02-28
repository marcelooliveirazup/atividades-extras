package semana1;

import java.util.Scanner;

public class Cod3 {

    public static int fatorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(fatorial(n));
}

}

