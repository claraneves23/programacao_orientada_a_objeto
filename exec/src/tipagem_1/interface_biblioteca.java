package tipagem_1;
import javax.swing.*;

public class interface_biblioteca {
    String m, n;
    public biblioteca_central livro() {
        m = JOptionPane.showInputDialog("DIGITAR NOME DO LIVRO");
        n = JOptionPane.showInputDialog("DIGITAR NOME DA EDITORA");
        int tipo_livro = Integer.parseInt(JOptionPane.showInputDialog("geral 1 \n informática 2 \n biologia 3 \n historia e geografia 4"));

        if (tipo_livro == 1)
            return new biblioteca_central(m, n);
        else if (tipo_livro == 2)
            return new biblioteca_informatica(m, n);
        else if (tipo_livro == 3)
            return new biblioteca_biologia(m, n);
        else if (tipo_livro == 4) {
            return new biblioteca_historia_geografia(m, n);
        } else
            return null;
        }
        public void livraria (biblioteca a) {
            if (a instanceof biblioteca_informatica)
                System.out.println("livro é de informática \n" + ((biblioteca_informatica)a).getLivro_Informatica() + "\n biblioteca" + ((biblioteca_informatica)a).getEditora());
            else if (a instanceof biblioteca_biologia)
                System.out.println("livro é de biologia \n" + ((biblioteca_biologia)a).getLivro_Biologia() + "\n biblioteca " + ((biblioteca_biologia)a).getEditora_Biologia());
            else if (a instanceof biblioteca_historia_geografia)
                System.out.println("livro é de historia e geografia \n" + ((biblioteca_historia_geografia)a).getLivro_hist_geo() + "\n biblioteca " + ((biblioteca_historia_geografia)a).getEditora_hist_geo());
            else
                System.out.println("livro é geral \n" + ((biblioteca_central)a).getLivro()+ "\n biblioteca " + ((biblioteca_central)a).getEditora());
        }
}
