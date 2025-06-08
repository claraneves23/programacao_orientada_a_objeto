package academia;

import java.util.Scanner;

public class Aulas extends Academia {

    public Aulas(String nome) {
        super(nome);
    }

    @Override
    public void fazerMatricula() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.print("Escolha o plano (BASICO, INTERMEDIARIO, PREMIUM): ");
        String plano = scanner.nextLine().toUpperCase(); // padroniza para maiúsculo

        double valor;

        switch (plano) {
            case "BASICO":
                valor = 100.00;
                break;
            case "INTERMEDIARIO":
                valor = 150.00;
                break;
            case "PREMIUM":
                valor = 200.00;
                break;
            default:
                System.out.println("Plano inválido. Matrícula cancelada.");
                return;
        }

        System.out.println("\nMatrícula realizada com sucesso!");
        System.out.println("Aluno: " + aluno);
        System.out.println("Plano escolhido: " + plano);
        System.out.println("Valor da matrícula: R$ " + String.format("%.2f", valor));
    }
}
