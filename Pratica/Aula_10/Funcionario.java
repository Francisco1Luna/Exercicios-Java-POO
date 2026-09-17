package Pratica.Aula_10;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;

    //construtor
    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setSetor(setor);
        this.setTrabalhando(trabalhando);
    }


    //getters e setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //metodos da classe
    public void mudaTrabalho() {
        this.setTrabalhando(!this.isTrabalhando());
    }

    @Override
    public String toString() {
        return super.toString() +
                 "Funcionario{" +
                "setor='" + setor + '\'' +
                ", trabalhando=" + trabalhando +
                '}';
    }
}
