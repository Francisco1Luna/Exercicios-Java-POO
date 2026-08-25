import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) {
        
        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.tampada = false;
        caneta1.modelo = "BIC";
        caneta1.carga = 90;
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.status();

        Caneta caneta2 = new Caneta();
        caneta2.cor = "Preta";
        caneta2.ponta = 0.8f;
        caneta2.tampada = true;
        caneta2.carga = 57;
        caneta2.modelo = "BIC";
        caneta2.status();
        
    }
    
}
