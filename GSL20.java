package GabrielaSousa;

import java.util.Scanner;

public class GSL20 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 01 -  Número positivo ou negativo");
		System.out.println("********************************************************************************");
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a quantidade de termos (n): ");
	        int n = sc.nextInt();

	        int a = 0, b = 1;

	        System.out.println("Sequência de Fibonacci:");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");

	            int proximo = a + b;
	            a = b;
	            b = proximo;
	        }

	        sc.close();
	    }

	

}
