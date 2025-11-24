package GabrielaSousa;

import java.util.Scanner;

public class GSL38 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 38 - Confirmar saída com 's'");
		System.out.println("********************************************************************************");
		
		 Scanner entrada = new Scanner(System.in);
	        String resposta;

	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("Digite 's' para sair ou qualquer outra tecla para continuar.");
	            System.out.print("Deseja sair? ");
	            resposta = entrada.nextLine().toLowerCase();

	        } while (!resposta.equals("s"));

	        System.out.println("Programa encerrado.");
	        entrada.close();

	}

}
