package Pratica.Aula_12;

public class Reptil extends Animal{

    private String corEscama;

    //construtor
    public Reptil(float peso, int idade, int quantidadeMembros, String corEscama) {
        super(peso, idade, quantidadeMembros);
        this.setCorEscama(corEscama);
    }

    //getters e setters

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //metodos da classe

    @Override
    public void locomover() {
        System.out.println("Rastejando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptíl!");
    }

}
