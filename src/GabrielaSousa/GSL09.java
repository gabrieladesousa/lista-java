package GabrielaSousa;

import java.util.Scanner;

public class GSL09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int a = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int b = scanner.nextInt();

	        System.out.print("Digite o terceiro número: ");
	        int c = scanner.nextInt();

	        int temp;
	        if (a > b) { temp = a; a = b; b = temp; }
	        if (b > c) { temp = b; b = c; c = temp; }
	        if (a > b) { temp = a; a = b; b = temp; }

	        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);

	        scanner.close();
	}

}
