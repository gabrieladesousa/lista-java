package GabrielaSousa;

import java.util.Scanner;

public class GSL32 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 32 - Tabuada de um número");
		System.out.println("********************************************************************************");
		
		
		 Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite um número para ver a tabuada: ");
	        int numero = entrada.nextInt();

	        int i = 1;

	        do {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	            i++;
	        } while (i <= 10);

	        entrada.close();
	}

}
