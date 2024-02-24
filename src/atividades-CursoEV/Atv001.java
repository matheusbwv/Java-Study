import java.io.Console;

public class Atv001 {

    public static void main(String[] args) {
        Area();
        // Var();
    }

    // calculo da Area de um triangulo
    public static void Area() {
        Console console = System.console();

        if (console == null) {
            System.out.println("console indisponivel");
            System.exit(1);
            // para dizer se o terminal está indisponivel
        }
        System.out.println("Digite o primeiro número: ");
        String input1 = console.readLine();
        int num1 = Integer.parseInt(input1);

        System.out.println("Digite o segundo numero: ");
        String input2 = console.readLine();
        int num2 = Integer.parseInt(input2);

        int area = (num1 * num2) / 2;

        System.out.println("sua área vai ser: " + area);

    }

    // static void Var() {
    // try {
    // System.out.println("digite seu nome: ");
    // String nome = System.console().readLine();
    // System.out.println("seu nome é: " + nome);

    // } catch (NumberFormatException e) {
    // System.out.println("entrada invalida, digite novamente!");
    // }

    // }
}