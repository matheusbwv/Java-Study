public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;

        //float pontoFlutuante = 3.14f;  float não cabe aqui por ser 64bits
        int valor = (int)salario;
        System.out.println(valor);

        long numeroGrande = 1234567;
        System.out.println(numeroGrande);
        
        short numeroPequeno = 245;
        System.out.println(numeroPequeno);

        byte b = 127;

        System.out.println(b);
    }
}
