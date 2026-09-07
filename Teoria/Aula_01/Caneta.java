package Teoria.Aula_01;

 class Caneta {

     String modelo;
     String cor;
     Float ponta;
     Integer carga;
     Boolean tampada;

     void rabiscar(){
        if (this.tampada == true) {
            
            System.out.println("Erro! Primeiro destampe a caneta!!") ;
                
        } else {
            
            System.out.println("Estou rabiscando!") ;
                
        }
    }

     void tampar(){
        this.tampada = true;
    }

     void destampar(){
       this.tampada = false;
    }

     void status(){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Uma caneta do modelo: " + this.modelo);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        
    }
}
