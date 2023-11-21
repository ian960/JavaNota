class LivroNaoFiccao extends Livro {
    private String assunto;

    public LivroNaoFiccao(String titulo, Autor autor, String assunto) {
        super(titulo, autor);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }
}
