class LivroFiccao extends Livro {
    private String genero;

    public LivroFiccao(String titulo, Autor autor, String genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
