package Pratica.Aula_06;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //construtor
    public ControleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    //getters e setters

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        if (this.isLigado()) {
            System.out.println("Já está ligado!");
        } else {
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if (!this.isLigado()) {
            System.out.println("Já está desligado!");
        } else {
            this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("Abrindo menu...");
        System.out.println("-------------------");
        System.out.println("Está ligado: " + this.isLigado());
        if (this.isLigado()) {
            System.out.print("Volume: " + "");

            int quantidadeBarrinhas = this.getVolume() / 10;
            for (int i = 0; i < quantidadeBarrinhas; i++) {
                System.out.print("|");
            }

            System.out.println("");
            System.out.println("Está tocando: " + this.isTocando());
        } else {
            System.out.println("Está deslisgado");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume(int aumento) {
        if (this.isLigado()) {
            if (this.getVolume() + aumento > 100) {
                int maxAumento = 100 - this.getVolume();
                System.out.println("Aumente o volume " + maxAumento + " unidades a menos!");
            } else {
                this.setVolume(this.getVolume() + aumento);
                System.out.println("Novo volume: " + this.getVolume());
            }
        } else {
            System.out.println("Está desligado!");
        }
    }

    @Override
    public void menosVolume(int diminuicao) {
        if (this.isLigado()) {
            if (this.getVolume() - diminuicao < 0) {
                int maxDiminuicao = getVolume();
                System.out.println("O maximo que você pode diminuir é " + maxDiminuicao);
            } else {
                this.setVolume(this.getVolume() - diminuicao);
                System.out.println("Novo volume: " + this.getVolume());
            }
        } else {
            System.out.println("Está desligado!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado()) {
            this.setVolume(0);
        } else {
            System.out.println("Está desligado!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado()) {
            this.setVolume(50);

        } else {
            System.out.println("Está desligado!");
        }

    }

    @Override
    public void play() {
        if (this.isLigado()) {
            if (this.isTocando()) {
                System.out.println("Já está tocando!");
            } else {
                this.setTocando(true);
            }
        } else {
            System.out.println("Está desligado!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado()) {
            if (!this.isTocando()) {
                System.out.println("Já está pausado!");
            } else {
                this.setTocando(false);
            }
        } else {
            System.out.println("Está desligado!");
        }
    }
}
