package Pratica.Aula_10;

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;

    //construtor
    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    //getters e setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //metodos da classe
    public void receberAumeto(float valorAcrescimo) {
        this.setSalario(this.getSalario() + valorAcrescimo);
    }

    public void perderSalario(float valorDecrescimo) {
        this.setSalario(this.getSalario() - valorDecrescimo);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
