package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Ex_scanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        // x = sc.next(); ---> // permite digitar uma palavra para ser armazenada no "x"

        // x = sc.next().charAt(0); --> leitura de caracteres

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("seu nome é: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
