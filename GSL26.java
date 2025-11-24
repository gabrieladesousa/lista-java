package GabrielaSousa;

import java.util.Scanner;

public class GSL26 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 26 - Número primo com while.");
		System.out.println("********************************************************************************");
		
		 Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite um número para verificar se é primo: ");
	        int numero = entrada.nextInt();

	        if (numero < 2) {
	            System.out.println(numero + " não é primo.");
	        } else {
	            int i = 2;
	            boolean primo = true;

	            while (i <= Math.sqrt(numero)) {  
	                if (numero % i == 0) {
	                    primo = false;
	                    break;
	                }
	                i++;
	            }

	            if (primo) {
	                System.out.println(numero + " é primo.");
	            } else {
	                System.out.println(numero + " não é primo.");
	            }
	        }

	        entrada.close();
	    

	}

}
