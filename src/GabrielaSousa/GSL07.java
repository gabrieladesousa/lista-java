package GabrielaSousa;

import java.util.Scanner;

public class GSL07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }

        scanner.close();
    
	}

}
