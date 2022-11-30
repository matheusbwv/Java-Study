public class TestaEscopo {
    public static void main(String[] args) {
        int idade = 20;
        int quantidadePessoas = 3;

        boolean acompanhado;
        if(quantidadePessoas >= 2){
            acompanhado = true;
        }else{
            acompanhado = false;
        }
        System.out.println("valor acompanhado = " + acompanhado);

        if(idade >= 18 && acompanhado){
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente não pode entrar");
        }


        
    }
}
