package var_static;

public class Identifica_Dispositivo_Móvel {
	public static void main(String args[]) {
		//primeira instância
		Dispositivo_Móvel a = new Dispositivo_Móvel();
		a.identifica_número("13 99655 8666");
		a.identifica_usuário("Carla");
		//segunda instância
		Dispositivo_Móvel b = new Dispositivo_Móvel();
		b.identifica_número("13 99777 6688");
		b.identifica_usuário("Giovana");
		
		System.out.println("número do telefone:\t" + a.número);
		System.out.println("usuário do telefone:\t" + a.usuário);
		
		System.out.println("número do telefone:\t" + b.número);
		System.out.println("usuário do telefone:\t" + b.usuário);
		
		b.DDD = 17;
		a.DDD = 16;
		
		System.out.println("DDD do telefone:\t" + b.DDD);
		System.out.println("DDD do telefone:\t" + a.DDD);
		
	}

}
