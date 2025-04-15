package secretaria;

public class Matricula extends Quarto_Ciclo_SI {

	public static void main(String args[]) {
		
		//objeto do tipo Quarto Ciclo
		
		Quarto_Ciclo_SI E = new Quarto_Ciclo_SI();
		E.setMatriculaAluno("RA122000");
		System.out.println("Matricula: \t" + E.getMatriculaAluno());
	}
}
