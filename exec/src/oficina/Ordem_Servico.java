package oficina;

import javax.swing.*;


public class Ordem_Servico {
    static Oficina_Mecanica of = null;

    public Oficina_Mecanica Ordem_Servico(){
        String a;
        a = JOptionPane.showInputDialog(null, "Digite a marca do veículo: Ford ou Volks ou outra marca", "Oficina",0);

    if(a.equals("Volks")){
        of = new Concessionaria_Volks();
        of.set_marca("Volks");
        of.set_modelo("fusca");
        System.out.println(of.get_marca() + "\n" + of.get_modelo() + "\n" + of.funilaria() + "\n" + of.pintura() + "\n" + of.eletrica());
    }

    if(a.equals("Ford")){
            of = new Concessionaria_Ford();
            of.set_marca("Ford");
            of.set_modelo("belina");
            System.out.println(of.get_marca() + "\n" + of.get_modelo() + "\n" + of.funilaria() + "\n" + of.pintura() + "\n" + of.eletrica());
    }

    if(a.equals("outra marca")){
            of = new Oficina_Mecanica();
            of.set_marca("Fiat");
            of.set_modelo("Uno");
            System.out.println(of.get_marca() + "\n" + of.get_modelo() + "\n" + of.funilaria() + "\n" + of.pintura() + "\n" + of.eletrica());
    }

    return of;
    }
}
