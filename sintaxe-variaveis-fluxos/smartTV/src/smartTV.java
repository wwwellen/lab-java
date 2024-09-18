//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class smartTV { // criando a classe da Smart TV
    // definindo as variáveis
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // criando métodos com as variáveis
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++; // incrementando +1 valor a mais no volume
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--; // decrementando -1 valor ao volume
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal() {
        canal++;
        System.out.println("Mudando canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Mudando canal para: " + canal);
    }
}