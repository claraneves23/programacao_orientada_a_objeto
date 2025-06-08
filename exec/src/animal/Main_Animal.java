package animal;

public class Main_Animal {
    public static void main (String Args[]){
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
    }
}
