package GabrielaSousa;

import java.util.Scanner;

public class GSL04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 04 -  Pode votar?");
		System.out.println("********************************************************************************");
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual sua idade?");
		
		double idade = entrada.nextDouble();
		if (idade > 18) {
			System.out.println("Você pode votar!!!");
			
		}else if(idade < 18){
			System.out.println("Você ainda não pode votar!!!");
			
		}
	}
}
