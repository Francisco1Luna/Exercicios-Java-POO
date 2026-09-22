package Pratica.Aula_12;

public class Mamifero extends Animal{

    private String corPelo;

    //construtor
    public Mamifero(float peso, int idade, int quantidadeMembros,String corPelo) {
        super(peso,idade,quantidadeMembros);
        this.setCorPelo(corPelo);
    }

    //getters e setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //metodos da classe

    @Override
    public void locomover() {
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando!");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero!");
    }

}
