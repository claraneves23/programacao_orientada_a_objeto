package trabalho_p1;

public class Padeiro extends Padaria {
	String nomeP;
	
	Padeiro(String nomeP) {
        super(); 
        this.nomeP = nomeP; 
        System.out.println("O padeiro se chama: " + this.getNomeP());
    }
	
	public void setNomeP(String nome) {
		this.nomeP = nome;
	}
	
	public String getNomeP() {
		return this.nomeP;
	}
}
