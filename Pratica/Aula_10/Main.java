package Pratica.Aula_10;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[4];
        pessoas[0] = new Professor("Leandro", 30, "M", "java", 8050.00f);
        pessoas[1] = new Aluno("Francisco", 18, "M", true, "BCC" );
        pessoas[2] = new Funcionario("Clovis de barros", 30, "M", "Assistente de Ti", true);
        pessoas[3] = new Pessoa("Lului", 19, "F");

        for(int i = 0; i < pessoas.length; i++ ) {
            System.out.println(pessoas[i]);

        }
    }
}
