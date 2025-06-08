package tipagem_1;

public class biblioteca_historia_geografia extends biblioteca_central{

    protected String livro_hist_geo;
    protected String editora_hist_geo;

    public biblioteca_historia_geografia(String editora_hist_geo, String livro_hist_geo) {
        super(livro_hist_geo, editora_hist_geo);
        this.editora_hist_geo = editora_hist_geo;
        this.livro_hist_geo = livro_hist_geo;
    }

    public String getLivro_hist_geo() {
        return livro_hist_geo;
    }

    public String getEditora_hist_geo() {
        return editora_hist_geo;
    }

}
