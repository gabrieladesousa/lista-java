package GabrielaSousa;

import java.util.Scanner;

public class GSL06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int num = scanner.nextInt();

	        if (num % 3 == 0 && num % 5 == 0) {
	            System.out.println("O número é múltiplo de 3 e 5.");
	        } else if (num % 3 == 0) {
	            System.out.println("O número é múltiplo de 3.");
	        } else if (num % 5 == 0) {
	            System.out.println("O número é múltiplo de 5.");
	        } else {
	            System.out.println("O número não é múltiplo de 3 nem de 5.");
	        }

	        scanner.close();
	    }
	
	}


