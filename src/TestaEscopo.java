public class TestaEscopo {
    public static void main (String[] args) {
        System.out.println("testando condicionais e escopos");

        int idade = 21;
        int quantidadePessoas = 1;
        // boolean acompanhado = quantidadePessoas >= 2;

        boolean acompanhado;
        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("valor de acompanhado: " + acompanhado);
        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}