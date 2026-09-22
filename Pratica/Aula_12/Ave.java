package Pratica.Aula_12;

public class Ave extends Animal{

    private String corPena;

    //construtor

    public Ave(float peso, int idade, int quantidadeMembros, String corPena) {
        super(peso, idade, quantidadeMembros);
        this.setCorPena(corPena);
    }

    //getters e setters

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //metodos da classe

    public void fazerNinho() {
        System.out.println("Fazendo ninho!");
    }

    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Minhoca!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave!");
    }

}
