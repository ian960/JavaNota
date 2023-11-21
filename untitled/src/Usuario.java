import java.util.ArrayList;
import java.util.List;
class Usuario {
    private String nome;
    private List<Livro> historico;

    public Usuario(String nome) {
        this.nome = nome;
        this.historico = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getHistorico() {
        return historico;
    }

    public void adicionarHistorico(Livro livro) {
        historico.add(livro);
    }
}