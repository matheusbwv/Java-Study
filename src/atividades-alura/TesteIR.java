public class TesteIR {
    public static void main(String[] args) {
        double salario = 3300.0;

        if(salario >= 1900.0&& salario <= 2800.0){
            System.out.println("o IR é 7.5% = " + 142);
        } if (salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("o IR é de 15% = " + 350);
        } if (salario >= 3751.0 &&salario <= 4664.00 ) {
            System.out.println("o IR é de 22.5% = " + 636);
        
        }

    }
}
