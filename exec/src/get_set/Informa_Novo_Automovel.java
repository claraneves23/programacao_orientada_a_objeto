package get_set;
import javax.swing.JOptionPane;

public class Informa_Novo_Automovel {
    public static void main(String []args) {
        Novo_Automovel a = new Novo_Automovel();

        a.setMarca(JOptionPane.showInputDialog("Qual a marca do carro?"));
        a.setModelo(JOptionPane.showInputDialog("Qual o modelo do carro?"));
        a.setCor(JOptionPane.showInputDialog("Qual a cor do carro?"));
        a.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o preco do carro?")));

        System.out.println("marca do carro:\t"+ a.getMarca());
        System.out.println("modelo do carro:\t"+ a.getModelo());
        System.out.println("cor do carro:\t"+ a.getCor());
        System.out.println("preco do carro:\t"+ a.getPreco());
    }
}
