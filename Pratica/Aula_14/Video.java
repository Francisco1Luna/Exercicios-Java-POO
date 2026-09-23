package Pratica.Aula_14;

public class Video implements AcoesVideo {

    private String titulo;
    private float avaliacao;
    private int curtidas;
    private boolean reproduzindo;

    //construtor

    public Video(String titulo, float avaliacao, int curtidas, boolean reproduzindo) {
       this.setTitulo(titulo);
       this.setAvaliacao(avaliacao);
       this.setCurtidas(curtidas);
       this.setReproduzindo(reproduzindo);
    }

    //getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //metodos da classe

    @Override
    public void play() {
        if (this.isReproduzindo()) {
            System.out.println("Já está reproduzindo!");
        } else {
            this.setReproduzindo(true);
        }

    }

    @Override
    public void pause() {
        if (!this.isReproduzindo()) {
            System.out.println("Já está pausado!");
        } else {
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
