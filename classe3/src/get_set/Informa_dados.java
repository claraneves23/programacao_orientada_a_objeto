package get_set;
import javax.swing.JOptionPane;


public class Informa_dados {
	public static void main(String []args) {
		
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		a.setNome(JOptionPane.showInputDialog("Qual o nome do contribuinte?"));
		a.setCPF(JOptionPane.showInputDialog("Qual o CPF do contribuinte?"));
		a.setCNPJ(JOptionPane.showInputDialog("Qual o CNPJ do contribuinte?"));
		a.setCartao(JOptionPane.showInputDialog("Qual o numero do cartão do contribuinte?"));
		
		System.out.println("nome do contribuinte:\t"+ a.getNome());
		System.out.println("CPF do contribuinte:\t"+ a.geCPF());
		System.out.println("CNPF do contribuinte:\t"+ a.getCNPJ());
		System.out.println("número do cartao do contribuinte:\t"+ a.geCartao());
		
	}

}
