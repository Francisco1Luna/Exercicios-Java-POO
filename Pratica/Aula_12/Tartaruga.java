package Pratica.Aula_12;

public class Tartaruga extends Reptil{

    //construtor
    public Tartaruga(float peso, int idade, int quantidadeMembros, String corEscama) {
        super(peso, idade, quantidadeMembros, corEscama);
    }

    //metodos da classe

    @Override
    public void locomover() {
        System.out.println("Andando beem devagar!");
    }

}
