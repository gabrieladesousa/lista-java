package GabrielaSousa;

import java.util.Scanner;

public class GSL34 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 34 -  Pedir senha até acertar\r\n");
		System.out.println("********************************************************************************");
		
		  Scanner entrada = new Scanner(System.in);
	        int senha;

	        do {
	            System.out.print("Digite a senha: ");
	            senha = entrada.nextInt();

	            if (senha != 1111) {
	                System.out.println("Senha incorreta. Tente novamente!");
	            }
	        } while (senha != 1111);

	        System.out.println("Acesso liberado!");
	        entrada.close();
	}

}
