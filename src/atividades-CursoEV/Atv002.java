import java.io.Console;

//calculo da media ponderada
public class Atv002 {
    public static void main(String[] args) {
        Nota();
    }

    public static void Nota() {
        Console console = System.console();
        System.out.println("digite a primeira nota: ");
        String nota1 = console.readLine();
        float num1 = Float.parseFloat(nota1); // Integer.parseInt (para inteiros)

        System.out.println("digite a primeira nota: ");
        String nota2 = console.readLine();
        float num2 = Float.parseFloat(nota2);

        System.out.println("digite a primeira nota: ");
        String nota3 = console.readLine();
        float num3 = Float.parseFloat(nota3);

        System.out.println("digite a primeira nota: ");
        String nota4 = console.readLine();
        float num4 = Float.parseFloat(nota4);

        float media = (num1 + num2 + num3 + num4) / 4;

        System.out.printf("sua media ponderada vai ser: %.1f ", media);
        /**
         * System.err.println(); --> sem a função a virgula para por a média não
         * funciona e sim o sinal de +
         */

    }

}
