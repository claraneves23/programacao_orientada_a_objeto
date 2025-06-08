package hotel;

public class Cadastro {
    public static void main (String args[]){

        Departamento_Financeiro DP = new Departamento_Financeiro("MEL");
        DP.ExibirMensagem();

        Setor_RH RH = new Setor_RH("PRAIA");
        RH.ExibirMensagem();
        RH.cadastrarFuncionario("Luís","psicólogo");
        RH.cadastrarFuncionario(200,"Luis");

        Almoxarifado_Materiais armazem = new Almoxarifado_Materiais("Brasil");
        armazem.ExibirMensagem();
        armazem.cadastrarProduto("Esponja", 1000);
        armazem.cadastrarProduto("Mouse",123,10);

    }
}
