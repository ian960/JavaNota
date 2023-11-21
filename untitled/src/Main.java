public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor 1");
        LivroFiccao livroFiccao = new LivroFiccao("Livro Ficção", autor1, "Aventura");

        Autor autor2 = new Autor("Autor 2");
        LivroNaoFiccao livroNaoFiccao = new LivroNaoFiccao("Livro Não Ficção", autor2, "História");

        Usuario usuario1 = new Usuario("Usuário 1");

        livroFiccao.emprestar();
        livroNaoFiccao.emprestar();
        livroFiccao.devolver();

        usuario1.adicionarHistorico(livroFiccao);
        usuario1.adicionarHistorico(livroNaoFiccao);

        System.out.println("Histórico de empréstimos do usuário 1:");
        for (Livro livro : usuario1.getHistorico()) {
            System.out.println(livro.getTitulo());
        }
    }
}
