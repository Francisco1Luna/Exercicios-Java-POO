package Pratica.Aula_11;

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;

    //construtor
    public Professor(String nome, int idade, String sexo,String especialidade, float salario) {
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
    public void receberAumento(float valor) {
        this.setSalario(this.getSalario() + valor);
        System.out.println("Novo salário: " + this.getSalario());
    }
}
