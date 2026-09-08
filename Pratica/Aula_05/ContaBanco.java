package Pratica.Aula_05;

public class ContaBanco {

    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean statusConta;

    //construtor padrão
    public ContaBanco(){
        this.setStatusConta(false);
        this.setSaldo(0f);
    }

    //getters e setters
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta( int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatusConta() {
        return this.statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    //metodos da conta
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatusConta(true);

        if (tipo.equals("CC")) {
            this.setSaldo(50f);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() != 0) {
            System.out.println("Você não pode fechar a conta, pois tem debito/saldo em conta!");
        } else {
            this.setStatusConta(false);
            System.out.println("Sua conta foi fechada com sucesso! ");
        }
    }

    public void depositar(float valor) {
        if (this.getStatusConta()) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Você precisar ter uma conta ativa para depositar!");
        }
    }

    public void pagarMensal() {
        int valorMensalidade = 0;
        if (this.getTipo().equals("CC")){
            valorMensalidade = 12;
        } else if (this.getTipo().equals("CP")) {
            valorMensalidade = 20;
        }
        if (this.getStatusConta()) {
            if (this.getSaldo() >= valorMensalidade) {
                this.setSaldo(getSaldo()-valorMensalidade);
            } else {
                System.out.println("Saldo insuficiente para realizar a compra!");
            }
        } else {
            System.out.println("A conta não existe, logo, nenhum valor pode ser cobrado!");
        }
    }

    public void sacar(float valorSaque) {
        if (this.getStatusConta()) {
            if (this.getSaldo() >= valorSaque) {
                this.setSaldo(this.getSaldo()- valorSaque);
            } else {
                System.out.println("Impossivel sacar, saldo insuficiente!");
            }
        } else {
            System.out.println("A conta não está ativa!");
        }
    }

    //mostrar status da conta

    public void estadoConta() {
        System.out.println("----------------------");
        System.out.println("Número da conta: " + this.getNumeroConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatusConta());

    }
}
