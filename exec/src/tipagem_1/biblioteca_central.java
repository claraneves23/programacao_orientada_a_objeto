package tipagem_1;

public class biblioteca_central extends biblioteca{

    protected String titulo_livro;
    protected String editora_livro;

    biblioteca_central (String titulo_livro, String editora_livro) {
        this.titulo_livro = titulo_livro;
        this.editora_livro = editora_livro;
    }

    public String getLivro(){
        return titulo_livro;
    }


    public String getEditora() {
        return editora_livro;

    }



}
