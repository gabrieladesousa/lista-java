package GabrielaSousa;

import java.util.Scanner;
import java.util.Random;

public class GSL40 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 40 - Ler números e mostrar o maior (até digitar negativo)");
		System.out.println("********************************************************************************");
		
		  Scanner input = new Scanner(System.in);
	        int numero;
	        int maior = Integer.MIN_VALUE; 

	        System.out.println("Digite números (negativo finaliza):");

	        while (true) {
	            numero = input.nextInt();

	            if (numero < 0) {
	                break; 
	            }

	            if (numero > maior) {
	                maior = numero;
	            }
	        }

	        if (maior == Integer.MIN_VALUE) {
	            System.out.println("Nenhum número positivo foi digitado.");
	        } else {
	            System.out.println("O maior número digitado foi: " + maior);
	        }

	        input.close();
	    }
	
	
}	    
	    