package GabrielaSousa;

import java.util.Scanner;

public class GSL01 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 01 -  Número positivo ou negativo");
		System.out.println("********************************************************************************");

		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número:");
		 
		double numero = entrada.nextDouble();
		 
		if (numero > 0){
			System.out.println("O número é positivo.");
		}else if(numero < 0 ) {
			System.out.print("O número é negativo.");
		 
		}else {
			System.out.println("O número é zero.");
		}
		entrada.close();
		
	}

}
