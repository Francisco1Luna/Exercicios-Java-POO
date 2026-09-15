package Pratica.Aula_07;

public class Main {
    public static void main(String[] args) {

        Lutador[] lutadores = new Lutador[6];
        lutadores[0] = new Lutador("pretty boy","frança", 31, 1.75f, 68.9f, 11, 2, 1);
        lutadores[1] = new Lutador("putscript", "brasil", 29, 1.68f, 57.8f, 14, 2 , 3);
        lutadores[2] = new Lutador("sanpshadow", "eua", 35, 1.65f, 80.9f,  12, 2, 1);
        lutadores[3] = new Lutador("deadocode", "australia", 28, 1.93f, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("ufocobol", "brasil", 37, 1.70f, 119.3f, 5, 4 , 3);
        lutadores[5] = new Lutador("nerdaard", "eua", 30, 1.81f, 105.7f,12, 2 ,4 );

        Luta ufc0 = new Luta();

        ufc0.marcarLuta(lutadores[0],lutadores[1]);
        ufc0.lutar();
        lutadores[0].status();
        lutadores[1].status();

    }
}
