package Pratica.Aula_13;


public class Cachorro {

    //metodos - sobrecarga

    public void reagir(String falarFrase) {

        if (falarFrase.equalsIgnoreCase("bom garoto") || falarFrase.equals("fofinho")) {
            System.out.println("Abanando o rabo e latindo");
        } else {
            System.out.println("GRRRRRRR!");
        }
    }

    public void reagir(float horaDia) {
        if (horaDia >= 6.00f && horaDia < 12.00f) {
           System.out.println("Abanando o rabo!");
        } else if (horaDia > 12.00f && horaDia < 18.00f) {
            System.out.println("Abanando e latindo!");
        } else if (horaDia > 18.00f && horaDia <= 24.00f || horaDia < 6.00f){

        }
    }

    public void reagir(boolean isDono) {
        if (isDono) {
            System.out.println("Abanando o rabo");
        } else {
            System.out.println("GRRRRR! e latidos");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanando o rabo!");
            } else {
                System.out.println("Latindo!");
            }

        } else {
            if (peso < 10) {
                System.out.println("GRRRR!");
            }
        }
    }
}
