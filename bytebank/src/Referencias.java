public class Referencias {
    public static void main(String[] args) {
        Conta primConta = new Conta();
        primConta.saldo = 300;

        System.out.println("saldo da conta " + primConta.saldo);

        Conta segConta = primConta;
    }
}