package heranca_1;

import javax.swing.JOptionPane;

class UsaFuncionario {
	
	public static void main(String args[]) {
		
		Funcionario funcionario = new Funcionario();
		
		PessoaJuridica func = new PessoaJuridica();
		
		String u,v,t,z;
		int x;
		
		z = JOptionPane.showInputDialog("digite 1 se contribuinte é pessoa física \n digite 2 se é pessoa jurídica");
		//conversão de string para flutuante
		x = Integer.parseInt(z) ;
		if (z.length() ==1) {
			switch (x) {
			case 1: {
				u = JOptionPane.showInputDialog ("escreva o nome do contribuinte: ");
				v = JOptionPane.showInputDialog ("escreva o RG do contribuinte: ");
				t = JOptionPane.showInputDialog ("escreva a identificação do cartão do contribuinte: ");
				
				funcionario.setNome(u);
				funcionario.setRG(v);
				funcionario.setCartao(t);
				
				System.out.println("NOME: " + funcionario.getNome());
				System.out.println("RG: " + funcionario.getRG());
				System.out.println("CARTÃO: " + funcionario.getCartao());
				
				break;
			   }
			case 2: {
				u = JOptionPane.showInputDialog ("escreva o nome do contribuinte: ");
				v = JOptionPane.showInputDialog ("escreva o RG do contribuinte: ");
				t = JOptionPane.showInputDialog ("escreva a identificação do cartão do contribuinte: ");
				
				funcionario.setNome(u);
				func.setCNPJ(v);
				funcionario.setCartao(t);
				
				System.out.println("NOME: " + funcionario.getNome());
				System.out.println("CNPJ: " + func.getCNPJ());
				System.out.println("CARTÃO: " + funcionario.getCartao());
				
				break;
				}
			}
		} 
	}	
}
