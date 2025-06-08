package calculo;

public class Simula_Exceção {
    public static void main(String[] args){
        System.out.println("Teste com delta positivo");
        try{
            Equacao_de_Segundo_Grau eq1 = new Equacao_de_Segundo_Grau(1,-3,2);
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nTeste com A negativo");
        try{
            Equacao_de_Segundo_Grau eq2 = new Equacao_de_Segundo_Grau(0,-3,2);
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nTeste com DELTA negativo");
        try{
            Equacao_de_Segundo_Grau eq3 = new Equacao_de_Segundo_Grau(1,2,5);
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
