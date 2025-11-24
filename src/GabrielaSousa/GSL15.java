package GabrielaSousa;

import java.util.Scanner;

public class GSL15 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 01 -  Número positivo ou negativo");
		System.out.println("********************************************************************************");
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = sc.nextInt();

	        long fatorial = 1;

	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }

	        System.out.println("O fatorial de " + numero + " é " + fatorial);
	        
	        sc.close();
	    }
	}
	


	
