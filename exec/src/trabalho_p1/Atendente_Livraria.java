package trabalho_p1;
import javax.swing.JOptionPane;

public class Atendente_Livraria {
    public static void main(String args []) {

        Livraria a1 = new Livraria();

        String l, ed, au, id;
        int q;
        double pr;

        l = JOptionPane.showInputDialog("Livro: ");
        ed = JOptionPane.showInputDialog("Editora: ");
        au = JOptionPane.showInputDialog("Autor: ");
        id = JOptionPane.showInputDialog("Código no livro: ");
        q = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
        pr = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));


        a1.setLivro(l);
        a1.setEditora(ed);
        a1.setAutor(au);
        a1.setId_livro(id);
        a1.setQuantidade(q);
        a1.setPreco(pr);

        System.out.println("DADOS DA COMPRA\nLIVRO: " + a1.getLivro() +
                " \nEDITORA: " + a1.getEditora() +  "\nAUTOR: " + a1.getAutor() + "\nCÓDIGO DO LIVRO: " + a1.getId_livro() +
                "\nQUANTIDADE: " + a1.getQuantidade() + "\nPREÇO: " + a1.getPreco());

    }
}
