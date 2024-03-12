package Udemy;

import java.util.Scanner;

public class testandoSC {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
        System.out.println("digite um numero: ");
        double x1 = soma.nextDouble();
        System.out.println("digite um numero: ");
        double x2 = soma.nextDouble();

        double soma1 = x1 + x2;

        System.out.printf("sua soma vai ser: %.2f", soma1);

        soma.close();

    }
}
