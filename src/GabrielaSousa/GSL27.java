package GabrielaSousa;

import java.util.Scanner;

public class GSL27 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 27 - Quantidade de números ímpares digitados.");
		System.out.println("********************************************************************************");
		
		Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero;
        int quantidadeImpares = 0;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            numero = entrada.nextInt();

            if (numero % 2 != 0) {
                quantidadeImpares++;
            }

            contador++;
        }

        System.out.println("Quantidade de números ímpares digitados: " + quantidadeImpares);

        entrada.close();

	}

}
