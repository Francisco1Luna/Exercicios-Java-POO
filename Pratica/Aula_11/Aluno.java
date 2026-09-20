package Pratica.Aula_11;

public abstract class Aluno extends Pessoa{

    private String curso;
    private int matricula;
    private int mensalidade;

    //construtor
    public Aluno(String nome, int idade, String sexo, String curso, int matricula) {
        super(nome, idade, sexo);
        this.setCurso(curso);
        this.setMatricula(matricula);
        this.setMensalidade(500);
    }

    //getters e setters

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    //metodos da classe
    public abstract void pagarMensalidade();

}
