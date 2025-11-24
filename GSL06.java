package GabrielaSousa;

import java.util.Scanner;

public class GSL06 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 06 - Número múltiplo de 3 e 5");
		System.out.println("********************************************************************************");
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		
		int num = entrada.nextInt();
		
		if(num % 3 == 0 && num %5 == 0) {
			System.out.println("O número é multiplo de 3 e 5.");
		}else if(num % 3 == 0) {
			System.out.println("O número é multiplo de 3!");
		}else if(num % 5 == 0) {
			System.out.println("O número é multiplo de 5!");
		}else {
			System.out.println("O número não é multiplo de 3 e nem de 5!");
		}
	    }
	
	}


