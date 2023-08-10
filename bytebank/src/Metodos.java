public class Metodos {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);

        System.out.println(contaDoPaulo.saldo);
    }
}