package Pratica.Aula_07;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //construtor
    public Lutador
                   (String nome,
                   String nacionalidade,
                   int idade,
                   float altura,
                   float peso,
                   int vitorias,
                   int derrotas,
                   int empates) {

        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);

    }


    //getters e setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        if (this.peso < 52.2) {
            return ("Peso inválido, por favor insira um peso maior ou igual a 52.2 kg");
        } else if (this.peso >= 52.2 && this.peso < 70.3) {
            return ("Peso leve");
        } else if (this.peso >= 70.3 && this.peso < 83.9) {
            return ("Peso médio");
        } else if (this.peso >= 83.9 && this.peso <= 120.2) {
            return ("Peso pesado");
        } else {
            return ("Peso inválido, por favor insira um peso menor ou igual a 120.2");
        }
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //metodos classe
    public void apresentar() {
        System.out.println("Nome:" + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("-----------------");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void status() {
        System.out.println("Nome do lutador: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("------------");
        System.out.println("Cartel: ");
        System.out.print("Vitorias :" + this.getVitorias() + " " + "Derrotas: " + this.getDerrotas() + " " + "Empates: " + this.getEmpates());
    }

    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }


}
