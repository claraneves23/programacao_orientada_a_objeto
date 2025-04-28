package material;

public class Caderno extends Material_Escolar {
    private String cor;
    private String capa;
    private int qtd_paginas;

    Caderno(){
        super();
    }

    public void set_cor(String cor) {
        this.cor = cor;
    }

    public String get_cor() {
        return cor;
    }

    public void set_capa(String capa) {
        this.capa = capa;
    }

    public String get_capa() {
        return capa;
    }

    public void set_qtd_paginas(int qtd_paginas) {
        this.qtd_paginas = qtd_paginas;
    }

    public int get_qtd_paginas() {
        return qtd_paginas;
    }
}
