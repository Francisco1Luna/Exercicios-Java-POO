package Pratica.Aula_11;

public class AlunoBolsista extends Aluno{

    private int bolsa;
    private boolean bolsista;

    //construtor
    public AlunoBolsista(String nome, int idade, String sexo, String curso, int matricula) {
        super(nome, idade, sexo, curso, matricula);
        this.setBolsa(200);
        this.setBolsista(true);
    }

    //getters e setters
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    //metodos classe
    @Override
    public void pagarMensalidade() {
        if (this.isBolsista()) {
            int valorPago = this.getMensalidade() - this.getBolsa();
            System.out.println("Valor pago: " + valorPago);
        } else {
            System.out.println("Valor pago: " + this.getMensalidade());
        }

    }

    public void renovarBolsa(){
        this.setBolsista(true);
    }

    public void cancelarBolsa() {
        this.setBolsista(false);
    }

}
