package tipagem_1;

public class biblioteca_informatica extends biblioteca_central{

    protected String livro_informatica;
    protected String editora_informatica;

    biblioteca_informatica (String livro_informatica, String editora_informatica) {
        super(livro_informatica, editora_informatica);
        this.livro_informatica = livro_informatica;
        this.editora_informatica = editora_informatica;

    }

    public String getLivro_Informatica(){
            return livro_informatica;
    }

    public String getEditora_Informatica(){
            return editora_informatica;
    }

}
