package GabrielaSousa;

import java.util.Scanner;

public class GSL08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

String usuarioCorreto = "admin";
String senhaCorreta = "1234";

System.out.print("Usuário: ");
String usuario = scanner.nextLine();

System.out.print("Senha: ");
String senha = scanner.nextLine();

if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
    System.out.println("Login bem-sucedido!");
} else {
    System.out.println("Usuário ou senha incorretos.");
}

scanner.close();
}
	
}