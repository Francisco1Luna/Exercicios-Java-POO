package Pratica.Aula_12;

public abstract class Animal {

    private float peso;
    private int idade;
    private int quantidadeMembros;

    //construtor

    public Animal(float peso, int idade, int quantidadeMembros) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setQuantidadeMembros(quantidadeMembros);
    }

    protected Animal() {
    }

    //getters e setters

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantidadeMembros() {
        return quantidadeMembros;
    }

    public void setQuantidadeMembros(int quantidadeMembros) {
        this.quantidadeMembros = quantidadeMembros;
    }

    //metodos da classe

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}
