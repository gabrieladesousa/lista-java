package GabrielaSousa;

import java.util.Scanner;

public class GSL33 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 33 -  Menu com opção de sair");
		System.out.println("********************************************************************************");
		
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu a mensagem!");
            } else if (opcao != 2) {
                System.out.println("Opção inválida. Tente novamente!");
            }

        } while (opcao != 2);

        System.out.println("Programa encerrado.");
        entrada.close();

	}

}
