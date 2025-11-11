package GabrielaSousa;

import java.util.Scanner;

public class GSL04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 04 -  Pode votar?");
		System.out.println("********************************************************************************");
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite sua idade: ");
	        int idade = scanner.nextInt();

	        if (idade < 16) {
	            System.out.println("Você ainda não pode votar.");
	        } else if (idade < 18 || idade > 70) {
	            System.out.println("Seu voto é opcional.");
	        } else {
	            System.out.println("Seu voto é obrigatório.");
	        }

	        scanner.close();
	    }
	


}
