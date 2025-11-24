package GabrielaSousa;

import java.util.Scanner;

public class GSL02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 02 - Par ou ímpar");
		System.out.println("********************************************************************************");

		 Scanner entrada = new Scanner(System.in);
				 
				 System.out.println("Digite um número inteiro:");
		 
		 int numero = entrada.nextInt();
		if(numero % 2 == 0) {
			System.out.println("O numero é par!");
		}else{
	 System.out.println("O número é impar!");
	 }
		 
	 entrada.close();
		 
	    }
	
	

}
