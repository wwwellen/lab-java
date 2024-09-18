public class Usuario { // criando a classe usuário
    public static void main (String[] args) throws Exception { // o throws exception é para declarar que pode gerar uma exceção
        smartTV smartTV = new smartTV(); // criando um objeto da classe Smart TV

        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("NS - TV ligada: " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("NS - Volume atual: " + smartTV.volume);

        smartTV.mudarCanal(15);
        System.out.println("NS - Canal Atual: " + smartTV.canal);
    }
}
