package Pratica.Aula_10;

public class Aluno extends Pessoa{

    private boolean matricula;
    private String curso;

    //construtor
    public Aluno(String nome, int idade, String sexo, boolean matricula, String curso) {
        super(nome, idade, sexo);
        this.setMatricula(false);
        this.setCurso(curso);
    }

    //getters e setters

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //metodos da classe
    public void cancelarMatricula() {
        if (this.isMatricula()) {
            this.setMatricula(false);
        } else {
            System.out.println("O aluno não está matriculado");
        }
    }

    public void matricular() {
        if (!this.isMatricula()) {
            this.setMatricula(true);
        } else {
            System.out.println("O aluno já está matriculado!");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
