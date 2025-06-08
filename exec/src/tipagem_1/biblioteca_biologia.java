package tipagem_1;

public class biblioteca_biologia extends biblioteca_central{

    protected String livro_biologia;
    protected String editora_biologia;

    biblioteca_biologia (String livro_biologia, String editora_biologia){
        super(livro_biologia, editora_biologia);
        this.livro_biologia = livro_biologia;
        this.editora_biologia = editora_biologia;
    }
    public String getLivro_Biologia(){
        return livro_biologia;
    }
    public String getEditora_Biologia(){
        return editora_biologia;
    }
}
