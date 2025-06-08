package tipagem_1;

public class usa_biblioteca {
    public static void main(String[] parametros){

        interface_biblioteca IB= new interface_biblioteca();
        biblioteca_central BC;
        BC = IB.livro();
        IB.livraria(BC);

    }
}
