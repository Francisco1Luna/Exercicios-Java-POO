package Pratica.Aula_12;

public class Peixe extends Animal{

    private String corEscama;

    //construtor

    public Peixe(float peso, int idade, int quantidadeMembros, String corEscama) {
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

    public void soltarBolha() {
        System.out.println("Soltando bolha!");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo subtâncias!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz barulho!");
    }

}
