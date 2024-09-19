//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class smartTV { // criando a classe da Smart TV //
    // definindo as variáveis //
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // criando métodos com as variáveis //
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
    // métodos para ligar e desligar a TV //

    public void aumentarVolume() {
        volume++; // incrementando +1 valor a mais no volume //
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--; // decrementando -1 valor ao volume //
        System.out.println("Diminuindo volume para: " + volume);
    }
    // métodos para aumentar ou diminuir o volume da TV //

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
    // mudar de canal com o número específico //

    public void aumentarCanal() {
        canal++;
        System.out.println("Mudando canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Mudando canal para: " + canal);
    }

    // mudar de canal aumentando e diminuindo os canais //
}