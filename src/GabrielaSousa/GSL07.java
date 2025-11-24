package GabrielaSousa;

import java.util.Scanner;

public class GSL07 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 07 - Triângulo válido");
		System.out.println("********************************************************************************");
		 
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro lado:");
		double lado1 = entrada.nextDouble();
    
		System.out.println("Digite o segundo número:");
		double lado2 = entrada.nextDouble();
		
		System.out.println("Digite o terceiro número:");
		double lado3 = entrada.nextDouble();
		
		if(lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1){
			System.out.println("Os lados formam um triangulo válido!!!");
		}else {
			System.out.println("Os lados não formam um triangulo!!!");
		}
		
	}
	

}
