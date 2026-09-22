package Pratica.Aula_12;

public class Cachorro extends Mamifero{

    //construtor
    public Cachorro(float peso, int idade, int quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros, corPelo);
    }

    //metodos da classe
    public void enterrarOsso() {
        System.out.println("Enterrando osso!");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo!");
    }
}
