package GabrielaSousa;

import java.util.Scanner;

public class GSL12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número para ver sua tabuada: ");
	        int num = scanner.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }

	        scanner.close();
	}

}
