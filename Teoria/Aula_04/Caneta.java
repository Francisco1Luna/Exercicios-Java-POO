package Teoria.Aula_04;

public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //construtor
    public Caneta(String modelo,float ponta,String cor,boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;

    }

    //getters e setters modelo
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    //getters e setters ponta
    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    //getters e setters cor
    public String getCor(){
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    //getters e setters tampada
    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

    //exibir status da caneta
    public void status() {

        System.out.println("Sobre a caneta:");
        System.out.println("modelo:" + getModelo());
        System.out.println("Ponta:" + getPonta());
        System.out.println("Tampada:" + getTampada());
        System.out.println("Cor:" + getCor());
    }

}
