package Teoria.Aula_04;

public class Main {

    public static void main(String[] args) {

        Caneta caneta1 = new Caneta("BIC", 0.5f,"Preta",true);
        caneta1.status();
        Caneta caneta2 = new Caneta("COMPACTOR", 1.0f,"Azul", false);
        caneta2.status();

    }
}
