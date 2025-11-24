package GabrielaSousa;

import java.util.Scanner;

public class GSL37 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 37 -  Soma até o número ser múltiplo de 10");
		System.out.println("********************************************************************************");
		
		Scanner entrada = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
            soma += numero;
        } while (numero % 10 != 0);

        System.out.println("Soma total dos números: " + soma);
        entrada.close();

	}

}
