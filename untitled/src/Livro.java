class Livro implements OperacoesLivro {
    private String titulo;
    private Autor autor;
    private boolean disponivel;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro não disponível para empréstimo: " + titulo);
        }
    }

    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido: " + titulo);
    }
}
