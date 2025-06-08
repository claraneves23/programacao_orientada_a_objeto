package localidades;
import javax.swing.JOptionPane;

public class Interface_Tipagem {
    public Municipio localidades(){
        String nome = JOptionPane.showInputDialog("Digite o nome do local: ");
        double populacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a população do local: "));
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo:\n1 - Cidade\n2- Bairro\n3 - Distrito"));

        if (escolha == 1){
            return new Cidade(nome,populacao);
        }
        else if (escolha == 2)
            return new Bairro(nome, populacao);
        else
            return new Distrito(nome,populacao);
    }

    public void tipoLocal(Municipio m){

        m.mostrarLocal();

        if (m instanceof Cidade){
            System.out.println("É uma instância de Cidade");

        } else if (m instanceof Bairro) {
            System.out.println("É uma instância de Bairro");

        } else if (m instanceof Distrito) {
            System.out.println("É uma instância de Distrito");
        }
    }
}
