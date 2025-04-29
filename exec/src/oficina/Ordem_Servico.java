package oficina;

import javax.swing.*;


public class Ordem_Servico {

    public static void main (String Args[]){
        Oficina_Mecanica oficina = new Oficina_Mecanica();
        oficina.set_marca(JOptionPane.showInputDialog("Digite a marca do carro: "));
        oficina.set_modelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));

        if (oficina.get_marca().equalsIgnoreCase("Ford") && oficina.get_modelo().equalsIgnoreCase("Belina") )
        {
            Concessionaria_Ford ford = new Concessionaria_Ford();

            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digitar opção: 1 para pintura, 2 para funilaria e 3 para eletrica"));
            switch (tipo){
                case 1:
                    JOptionPane.showMessageDialog(null, ford.pintura());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, ford.funilaria());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, ford.eletrica());
                    break;
                default: {
                    System.out.println("valor inválido");
                    System.exit(0);
                }
            }


        } else if (oficina.get_marca().equalsIgnoreCase("Volkswagen") && oficina.get_modelo().equalsIgnoreCase("Fusca") ) {
            Concessionaria_Volks volks = new Concessionaria_Volks();

            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digitar opção: 1 para pintura, 2 para funilaria e 3 para eletrica"));
            switch (tipo) {
                case 1:
                    JOptionPane.showMessageDialog(null, volks.pintura());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, volks.funilaria());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, volks.eletrica());
                    break;
                default: {
                    System.out.println("valor inválido");
                    System.exit(0);
                }

            }

        }
        else {

            JOptionPane.showMessageDialog(null, oficina.toString());
        }
    }
}
