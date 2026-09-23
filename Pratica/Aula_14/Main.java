package Pratica.Aula_14;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("Como aprender java em 24 horas", 3.5f, 2000, true);
        Gafanhoto gafanhoto = new Gafanhoto("Francisco", 18, "M", "Chicobebres", 29);

        Assistir video1 = new Assistir(video,gafanhoto);

        System.out.println(video1);
        video1.avaliar(4.5f);
        System.out.println(video1);
        System.out.println(video.getAvaliacao());
        video1.avaliar(5.0f);
        System.out.println(video.getAvaliacao());
    }
}
