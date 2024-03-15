package PooJumpscare;

public class Biruleibe {

    class Clarissa {
        public String beleza;
        public String personalidade;
        public String cabelo;
        public String game;
        public String jeito;
        public String esperar;

        public void mensagem() {
            System.out.println("Essa mensagem é para dizer que você é uma " + beleza + " e tem uma personalidade muito "
                    + personalidade + " eu adoro sua " + cabelo + " e ainda mais o seu " + jeito
                    + " espero que a gente não pare de se falar e jogar aquele " + game + "que você gosta "
                    + " e apesar de tudo, você sabe que sempre " + esperar
                    + " e é isso, tentando ser fofo com coisas que aprendi recentemente a fazer :3 kkkkkk");
        }
    }

    public static void main(String[] args) {

        Biruleibe biruleibe = new Biruleibe();

        Clarissa clarissa = biruleibe.new Clarissa();

        clarissa.beleza = "Lindona <3";
        clarissa.personalidade = "Fofa mas ao mesmo tempo divertida";
        clarissa.cabelo = "franjinha :p";
        clarissa.game = "jogo de fazenda";
        clarissa.jeito = "jeitinho doce";
        clarissa.esperar = "tenho paciencia de esperar";

        clarissa.mensagem();
    }
}
