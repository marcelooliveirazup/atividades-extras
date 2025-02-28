package semana1;

import java.util.Scanner;

public class Cod1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int soma = a + b;
        System.out.println(soma);
    }

}

