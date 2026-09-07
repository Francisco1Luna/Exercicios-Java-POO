package Teoria.Aula_03;

public class Caneta {

    private String modelo;
    private String cor;
    private Float ponta;
    private Integer carga;
    private Boolean tampada;

    public void rabiscar(){
        if (this.tampada == true) {
            
            System.out.println("Erro! Primeiro destampe a caneta!!") ;
                
        } else {
            
            System.out.println("Estou rabiscando!") ;
                
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
       this.tampada = false;
    }

    public void status(){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Uma caneta do modelo: " + this.modelo);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        
    }
}
