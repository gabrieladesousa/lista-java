package GabrielaSousa;

import java.util.Scanner;

public class GSL39 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 02 -  Validar número entre 1 e 5");
		System.out.println("********************************************************************************");
		
		 Scanner entrada = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.print("Digite um número entre 1 e 5: ");
	            numero = entrada.nextInt();

	            if (numero < 1 || numero > 5) {
	                System.out.println("Número inválido! Tente novamente.");
	            }
	        } while (numero < 1 || numero > 5);

	        System.out.println("Número válido: " + numero);
	        entrada.close();

	}

}
