package Pratica.Aula_14;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;



    //construtor

    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(1);
    }


    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //metodos
    public void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }
}
