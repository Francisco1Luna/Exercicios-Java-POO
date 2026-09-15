package Pratica.Aula_08;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    //construtor
    public Livro(String titulo,
                 String autor,
                 int totalPaginas,
                 Pessoa leitor) {

        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setPaginaAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);


    }

    //getters e setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    private void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //metodos interface

    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.setAberto(true);
        } else {
            System.out.println("O livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("O livro já esta fechado!");
        }
    }

    @Override
    public void folhear(int pagina) {
        if (this.isAberto()) {
            this.setPaginaAtual(pagina);
        } else {
            System.out.println("O livro está fechado!");
        }

    }

    @Override
    public void avancarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        } else {
            System.out.println("A página não pode ser passada pois o livro está fechado!");
        }

    }

    @Override
    public void voltarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        } else {
            System.out.println("A página não pode ser passada pois o livro está fechado!");
        }

    }

    //metodos classe
    public void detalhes() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de paginas: " + this.getTotalPaginas());
        System.out.println("Leitor: " + this.getLeitor().toString());
        System.out.println("Aberto : " + this.isAberto());
        System.out.println("Pagina atual: " + this.getPaginaAtual());
    }
}
