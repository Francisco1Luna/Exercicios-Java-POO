package Pratica.Aula_14;

public class Assistir {

    private Video video;
    private Gafanhoto gafanhoto;


    //construtor


    public Assistir(Video video, Gafanhoto gafanhoto) {
        this.setVideo(video);
        this.setGafanhoto(gafanhoto);
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Gafanhoto getGafanhoto() {
        return gafanhoto;
    }

    public void setGafanhoto(Gafanhoto gafanhoto) {
        this.gafanhoto = gafanhoto;
    }


    @Override
    public String toString() {
        return "Informaçoes do video{" +
                "video= " + video +
                ", gafanhoto= " + gafanhoto +
                '}';
    }

    //metodos da classe
    public void avaliar() {
        this.video.setAvaliacao(5.0f);
    }

    public void avaliar(float nota) {
        this.video.setAvaliacao((video.getAvaliacao() + nota)/2f);
    }
}
