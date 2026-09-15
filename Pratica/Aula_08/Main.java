package Pratica.Aula_08;

public class Main {
    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[4];
        Livro[] livros = new Livro[4];

        pessoas[0] = new Pessoa("pedro", 67, "M");
        pessoas[1] = new Pessoa("Juju fofinha", 20, "F");
        pessoas[2] = new Pessoa("chico", 18, "M");
        pessoas[3] = new Pessoa("tonho", 51, "M") ;

        livros[0] = new Livro("Aprendendo java", "José da silva", 267, pessoas[0]);
        livros[1] = new Livro("Hardcore java", "clayton barbosa", 300, pessoas[1]);
        livros[2] = new Livro("Clean code", "Antonio prado", 130, pessoas[2]);
        livros[3] = new Livro("Arquitetura de software: fundamentos", "Kanye west", 200, pessoas[3]);

        livros[0].abrir();
        livros[0].detalhes();
        livros[1].abrir();
        livros[1].detalhes();
    }
}
