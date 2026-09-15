package Pratica.Aula_07;
import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //construtor
    public Luta() {
    }

    //getters e setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        if (rounds > 0) {
            this.rounds = rounds;
        } else {
            System.out.println("Por favor insira um valor válido!");
        }
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //metodos da classe
    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        if (desafiante != null && desafiado != null && desafiante.getCategoria().equals(desafiado.getCategoria()) && !desafiante.getNome().equals(desafiado.getNome())) {

            this.aprovada = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;

        } else {

            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("Por favor insira dois valores diferentes no nome ou da mesma categoria");

        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("Apresentando o desafiante!");
            this.desafiante.apresentar();
            System.out.println("Apresentando o desafiado!");
            this.desafiado.apresentar();

            Random random = new Random();

            int vencedor = random.nextInt(0,3);

            if (vencedor == 0) {
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
                System.out.println("Empatou!");
            } else if (vencedor == 1) {
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println("Desafiado ganhou!");
            } else {
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                System.out.println("Desafiante ganhou!");
            }
        }
    }

}
