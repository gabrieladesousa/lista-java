package GabrielaSousa;

import java.util.Scanner;

public class GSL22 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 22 -  Soma de números até digitar zero.");
		System.out.println("********************************************************************************");
		
		 Scanner entrada = new Scanner(System.in);
	        int numero;
	        int soma = 0;

	        System.out.println("Digite números para somar (0 encerra):");

	        while (true) {
	            numero = entrada.nextInt();
	            
	            if (numero == 0) {
	                break;  // sai do loop
	            }

	            soma += numero;
	        }

	        System.out.println("A soma dos números é: " + soma);
	        
	        entrada.close();
	    }
	

	

}
