package Pratica.Aula_12;

public class Canguru extends Mamifero{

    //construtor
    public Canguru(float peso, int idade, int quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros, corPelo);
    }

    //metodos da classe
    public void usarBolsa() {
        System.out.println("Usando bolsa!");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando!");
    }
}
