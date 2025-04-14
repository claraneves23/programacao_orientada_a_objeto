package cinema;

public class Cinemas_Antigos extends Cinemas_de_Santos {
	private String nome_do_cinema;
	
	Cinemas_Antigos(String antigo){
		System.out.println("História dos Cinemas de Santos\n"+ antigo);
	}
	
	public void setNome(String nome_do_cinema) {
		this.nome_do_cinema = nome_do_cinema;
	}
	
	public String getNome() {
		return nome_do_cinema;
	}
}
