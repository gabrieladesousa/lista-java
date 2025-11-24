package GabrielaSousa;

import java.util.Scanner;

public class GSL08 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 08 - Login Simples");
		System.out.println("********************************************************************************");
		 
     Scanner entrada = new Scanner(System.in);
     
     
     System.out.println("Digite seu usuario:");		
     String Usuario1 = entrada.nextLine();
     
     System.out.println("Digite a sua senha:");
     String Senha1 = entrada.nextLine();
     
     String Usuario = "Gabriela";
     String Senha = "123";
     
     if (Usuario1.equals(Usuario) && Senha1.equals(Senha)){
    	System.out.println("Login realizado com sucesso!!!");
     }else {
    	 System.out.println("Usuario ou senha incorreto!");
     }
}
	
}