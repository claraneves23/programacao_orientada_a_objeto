package trabalho_p1;

public class Livraria {
    String editora;
    String autor;
    String livro;
    String id_livro;
    int quantidade;
    double preco;

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getLivro() {
        return this.livro;
    }

    public void setId_livro(String id_livro) {
        this.id_livro = id_livro;
    }

    public String getId_livro() {
        return this.id_livro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }
}
