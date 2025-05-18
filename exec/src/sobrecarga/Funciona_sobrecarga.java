package sobrecarga;

import javax.swing.JOptionPane;

public class Funciona_sobrecarga {

    public static void main(String args[]){

        Ficha_funcionario funcionarios =new Ficha_funcionario(22, 2889.09, "Gisele", "Pedagogia");
        JOptionPane.showMessageDialog(null, funcionarios.mostra_funcionarios());

        concatena_aplicacao();
    }

    public static void concatena_aplicacao(){
        Acesso_Secundario a = new Acesso_Secundario();
    }
}
