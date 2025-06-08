package calculo;

public class Equacao_de_Segundo_Grau {
    private int a, b, c;

    public Equacao_de_Segundo_Grau(int a, int b, int c) throws Exception{
        this.a = a;
        this.b = b;
        this.c = c;

        resolverEquacao();
    }

    private void resolverEquacao() throws Exception{
        if (a == 0){
            throw new Exception("Se a é igual a 0 essa equação não é de segundo grau");
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0){
            throw new Exception("A equação possui raízes complexas (Delta < 0)");
        }

        double raiz1 = (-b + Math.sqrt(delta))/(2 * a);
        double raiz2 = (-b - Math.sqrt(delta))/(2 * a);

        System.out.println("Raiz 1:" + raiz1);
        System.out.println("Raiz 2:" + raiz2);


    }
}
