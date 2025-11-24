package GabrielaSousa;

import java.util.Scanner;

public class GSL30 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 30 -   Menu até escolher sair.");
		System.out.println("********************************************************************************");
		
		 Scanner entrada = new Scanner(System.in);
	        int opcao = 0;

	        while (opcao != 3) { 
	            System.out.println("\n--- MENU ---");
	            System.out.println("1 - Opção 1");
	            System.out.println("2 - Opção 2");
	            System.out.println("3 - Sair");
	            System.out.print("Escolha uma opção: ");
	            
	            opcao = entrada.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Você escolheu a Opção 1!");
	                    break;
	                case 2:
	                    System.out.println("Você escolheu a Opção 2!");
	                    break;
	                case 3:
	                    System.out.println("Saindo do programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente!");
	            }
	        }

	        entrada.close();

	}

}
