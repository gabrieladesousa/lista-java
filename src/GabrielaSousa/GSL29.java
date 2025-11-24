package GabrielaSousa;

import java.util.Scanner;

public class GSL29 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 29 -   Contar dígitos de um número.");
		System.out.println("********************************************************************************");
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Digite um número positivo.");
        } else {
            int contador = 0;
            int temp = numero;

            // conta os dígitos
            while (temp > 0) {
                temp /= 10;  // remove o último dígito
                contador++;  // incrementa o contador
            }

            System.out.println("O número " + numero + " tem " + contador + " dígito(s).");
        }

        entrada.close();

	}

}
