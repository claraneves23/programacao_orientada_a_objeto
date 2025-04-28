package organiza_cidade;

public class Logradouro extends Regiao_de_Santos {
    private String tipo_logradouro;
    private String local_logradouro;


    public void setTipoLogradouro(String tipo_logradouro) {
        this.tipo_logradouro = tipo_logradouro;
    }

    public void setLocalLogradouro(String local_logradouro) {
        this.local_logradouro = local_logradouro;
    }

    public String getTipoLogradouro() {
        return tipo_logradouro;
    }

    public String getLocalLogradouro() {
        return local_logradouro;
    }

}
