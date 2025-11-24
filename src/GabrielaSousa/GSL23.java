package GabrielaSousa;

import java.util.Scanner;

public class GSL23 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 23 - Senha correta.");
		System.out.println("********************************************************************************");
		
		 Scanner entrada = new Scanner(System.in);

	        final String SENHA_CORRETA = "1234";
	        String senhaDigitada = "";

	        while (!senhaDigitada.equals(SENHA_CORRETA)) {
	            System.out.print("Digite a senha: ");
	            senhaDigitada = entrada.nextLine();

	            if (!senhaDigitada.equals(SENHA_CORRETA)) {
	                System.out.println("Senha incorreta. Tente novamente!");
	            }
	        }

	        System.out.println("Senha correta! Acesso permitido.");

	        entrada.close();

	}

}
