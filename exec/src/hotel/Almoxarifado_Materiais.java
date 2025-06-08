package hotel;

public class Almoxarifado_Materiais extends Departamento_Financeiro{

    private int qtdEstoque;
    private String produto;
    private int id_produto;
    private double vl_unidade;

    @Override
    public void ExibirMensagem (){
        System.out.println("Almoxarifado");
    };

    public Almoxarifado_Materiais(String nome){
        super("Litoral");
    }

    public void cadastrarProduto(String produto, int qtdEstoque){
        System.out.println("O produto " + produto+ " tem " +qtdEstoque + " unidades");
    }

    public void cadastrarProduto(String produto, int id_produto, double vl_unidade){
        System.out.println("O id do " + produto+ " é " +id_produto+ " e o valor da unidade é " +vl_unidade);
    }

}
