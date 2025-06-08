package calculadora_sobrecarga;

public class Main_Calculadora {
   public static void main (String Args[]){
       Calculadora calc = new Calculadora();

       System.out.println(calc.somar(1,2));
       System.out.println(calc.somar(1,2,3));
       System.out.println(calc.somar(1,2));
   }



}
