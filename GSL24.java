package GabrielaSousa;

import java.util.Scanner;

public class GSL24 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 24 - Verificar se um número é positivo.");
		System.out.println("********************************************************************************");
		
		Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("Número não é positivo. Tente novamente!");
            }

        } while (numero <= 0);

        System.out.println("Obrigado! Você digitou o número positivo: " + numero);

        entrada.close();

	}

}
