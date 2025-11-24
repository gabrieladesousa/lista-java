package GabrielaSousa;

import java.util.Scanner;

public class GSL03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 03 - Maior de dois números");
		System.out.println("********************************************************************************");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite outro número:");
		
		double num2 = entrada.nextDouble();
		
		if(num1 > num2){
			System.out.println("O número maior é:"+num1);
			
		}else if(num2 > num1){
			System.out.println("O número maior é:"+num2);
		}else {
			System.out.println("Os dois são iguais!");
		}
			
		
		
		
	    }
	
	}


