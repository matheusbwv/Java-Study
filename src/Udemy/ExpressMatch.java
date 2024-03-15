package Udemy;

public class ExpressMatch {

    public static void main(String[] args) {
        /**
         * A = Math.sqrt(x); --> calcula a raiz quadrada de x
         * B = Math.pow(x, y); ---> Valor B recebe o resultado de x elevado a y
         * C = Math.abs(z); ---> Variável A recebe valor absoluto de x
         */

        System.out.println("=".repeat(30));

        double x = 3.4;
        double y = 4.0;
        double z = 5.4;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        System.out.println("=".repeat(30));

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " é elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado é = " + B);
        System.out.println(5 + "elevado ao quadrado é = " + C);

        System.out.println("=".repeat(30));

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}