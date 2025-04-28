package var_static;

public class Dispositivo_Movel {
    //variável com escopo de instância: pode ser alterada por uma nova instância
    public String numero;
    //variável com escopo de classe(static): prevalece o valor da última variável da instância
    public static String usuario;
    public static int DDD;

    public void identifica_numero(String numero) {
        this.numero = numero;
    }

    public void identifica_usuario(String usuario) {
        this.usuario = usuario;
    }
}
