package mtd_destrutor;

public class Dados_Automóvel {
	public static void main (String []args) {
	
	Automóvel auto = new Automóvel ("Volkswagen", "Fusca", "verde", 6897.99);
	System.out.println(auto.mostra_Automóvel());
	
	auto = null;
	System.gc();
	System.out.println(auto.mostra_Automóvel());
		
	}
}
