package var_static;

public class Identifica_Dispositivo_Movel {
    public static void main(String args[]) {
        //primeira instância
        Dispositivo_Movel a = new Dispositivo_Movel();
        a.identifica_numero("13 99655 8666");
        a.identifica_usuario("Carla");
        //segunda instância
        Dispositivo_Movel b = new Dispositivo_Movel();
        b.identifica_numero("13 99777 6688");
        b.identifica_usuario("Giovana");

        System.out.println("número do telefone:\t" + a.numero);
        System.out.println("usuário do telefone:\t" + a.usuario);

        System.out.println("número do telefone:\t" + b.numero);
        System.out.println("usuário do telefone:\t" + b.usuario);

        b.DDD = 17;
        a.DDD = 16;

        System.out.println("DDD do telefone:\t" + b.DDD);
        System.out.println("DDD do telefone:\t" + a.DDD);

    }
}
