package oficina;

public class Oficina_Mecanica {

        private String marca;
        private String modelo;

        public void set_marca(String marca){
            this.marca = marca;
        }

        public String get_marca(){
            return marca;
        }

        public void set_modelo(String modelo){
            this.modelo = modelo;
        }

        public String get_modelo(){
            return modelo;
        }

        public String pintura(){
            return "pintura de verde";
        }

        public String funilaria(){
            return "desamassar o teto";
        }

        public String eletrica(){
            return "instala alarme";
        }

        public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo;
        }

}
