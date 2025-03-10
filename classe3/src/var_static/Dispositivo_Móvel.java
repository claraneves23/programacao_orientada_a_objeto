package var_static;

public class Dispositivo_Móvel {
	//variável com escopo de instância: pode ser alterada por uma nova instância
	public String número;
	//variável com escopo de classe(static): prevalece o valor da última variável da instância
	public static String usuário;
	public static int DDD;
	
	public void identifica_número(String número) {
		this.número = número;
	}
	
	public void identifica_usuário(String usuário) {
		this.usuário = usuário;
	}

}
