package Pratica.Aula_06;

public class Main {

    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.play();
        controle.maisVolume(20);
        controle.menosVolume(71);
        controle.abrirMenu();
        controle.fecharMenu();
    }
}
