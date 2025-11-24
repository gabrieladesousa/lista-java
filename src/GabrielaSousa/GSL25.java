package GabrielaSousa;

import java.util.Scanner;

public class GSL25 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 25 - Tabuada com while.");
		System.out.println("********************************************************************************");
		
		
		 Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite um número para ver a tabuada: ");
	        int numero = entrada.nextInt();

	        int i = 1; 

	        while (i <= 10) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	            i++;
	        }

	        entrada.close();

	}

}
