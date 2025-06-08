package excessao;

import java.util.Scanner;

public class divisao {

    public static void main (String Args[]){

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira o primeiro número: ");
            int a = sc.nextInt();

            System.out.println("Insira o segundo número: ");
            int b = sc.nextInt();

            int resultado = a/b;

            System.out.println("O resultado da divisão de " + a + " por " + b + " é igual a: " + resultado);

        } catch(ArithmeticException e) {
            System.out.println("Não é permitido divisão por 0");

        }

        finally {
            System.out.println("Acabou");
        }
    }


}
