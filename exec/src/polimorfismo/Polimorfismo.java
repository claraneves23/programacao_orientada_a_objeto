package polimorfismo;
import javax.swing.*;

public class Polimorfismo {
    public static void main (String args[]){

        /*declaração de objetos do tipo da superclasse inicializado como "vazio" */

        Contribuinte pessoa = null;

        //leitura de variável que definirá como o objeto será instanciado
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digitar opção: valor numérico entre 1 e 4"));

        //definição de como o objeto será instanciado
        switch (tipo){
            case 1:
                pessoa = new Contribuinte();
                break;
            case 2:
                pessoa = new PessoaFisica();
                break;
            case 3:
                pessoa = new PessoaJuridica();
                break;
            case 4:
                pessoa = new Funcionario();
                break;

            default: {
                System.out.println("tipo não pertence à família");
                System.exit(0);
            }

        }

        pessoa.mostraClasse();
    }
}
