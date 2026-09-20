package Pratica.Aula_11;

public class AlunoTecnico extends Aluno{

    private int registroProfissional;

    //construtor
    public AlunoTecnico(String nome, int idade, String sexo, String curso, int matricula, int mensalidade, int registroProfissional) {
        super(nome, idade, sexo, curso, matricula);
        this.setRegistroProfissional(registroProfissional);
    }

    //getters e setters


    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }


    //metodos da classe
    @Override
    public void pagarMensalidade() {
        System.out.println("Valor pago: " + this.getMensalidade());
    }

    public void praticar() {
        System.out.println("Praticando...");
    }

}

