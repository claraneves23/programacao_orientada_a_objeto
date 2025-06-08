package hotel;

public class Setor_RH extends Departamento_Financeiro{

    private String funcionario;
    private String funcao;
    private int id_funcionario;

    @Override
    public void ExibirMensagem (){
        System.out.println("Setor RH");
    };

    public Setor_RH(String nome){
        super("Paris");

    }

    public void cadastrarFuncionario(String funcionario, String funcao){
        System.out.println("O funcionário " + funcionario + " trabalha na função de " + funcao);
    }

    public void cadastrarFuncionario(int id_funcionario, String funcionario){
        System.out.println("O número de cadastro é " + id_funcionario + " e o nome dele é " + funcionario);
    }

}
