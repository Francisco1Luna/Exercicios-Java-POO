package Pratica.Aula_14;

public class Gafanhoto extends Pessoa{

    private String login;
    private int totalAssistido;

    //construtor
    public Gafanhoto(String nome, int idade, String sexo, String login, int totalAssistido) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotalAssistido(totalAssistido);
    }

    //getters e setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    //metodos da classe
    public void viuMaisUm() {
        this.setTotalAssistido(this.getTotalAssistido() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
