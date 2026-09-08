package Pratica.Aula_05;

public class Main {
    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();
        conta1.setNumeroConta(1111);
        conta1.setDono("Jubileuzinho");
        conta1.abrirConta("CC");
        conta1.depositar(100);

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumeroConta(2222);
        conta2.setDono("Creuza da silva");
        conta2.abrirConta("CP");
        conta2.depositar(500);
        conta2.sacar(200);


        conta1.estadoConta();
        conta2.estadoConta();

    }
}
