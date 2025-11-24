package GabrielaSousa;

import java.util.Scanner;

public class GSL05 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 05 - Notas e aprovação?");
		System.out.println("********************************************************************************");
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite sua nota:");
		double nota = entrada.nextDouble();
		
		
		System.out.println("Digite sua segunda nota");
		double nota1 = entrada.nextDouble();
		
		double media = (nota + nota1)/2;
		
		System.out.println("Média:"+media);
		
		if(media >= 7) {
			System.out.println("Parabéns você foi aprovada!!!");
		}else if (media >= 6){
			System.out.println("Recuperação.");
		}else
			System.out.println("Reprovado.");
	
		}
}
		
		
		