package heranca_1;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return cnpj;
    }
}
