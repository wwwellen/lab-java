public class CriaConta {
    public static void main (String[] args) {
        Conta primConta = new Conta();
        primConta.saldo = 200;
        System.out.println(primConta.saldo);

        primConta.saldo += 100;
        System.out.println(primConta.saldo);

        Conta segConta = new Conta();
        segConta.saldo = 50;

        System.out.println("primeira conta tem " + primConta.saldo);
        System.out.println("segunda conta tem " + segConta.saldo);

        System.out.println(primConta.agencia);
        System.out.println(primConta.numero);
    }
}