package encapsulamento_1;

public class Acesso_Numeros {
    int a;
    public int b;
    private int c;
    protected int d;

    public void setNumero(String id, int numero) {
        if(id=="a")
            this.a = numero;

        if(id=="c")
            this.c = numero;

        if(id=="d")
            this.d = numero;

    }

    public void mostra_numero() {
        System.out.println("numero a =" + a);
        System.out.println("numero b =" + b);
        System.out.println("numero c =" + c);
        System.out.println("numero d =" + d);

    }
}
