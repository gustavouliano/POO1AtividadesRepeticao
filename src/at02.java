import java.util.Scanner;

public class at02 {

	public static void main(String[] args) {
		/*
		 Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao
			nome do usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.
		 */

		Scanner sc = new Scanner(System.in);
		String user;
		String password;
		
		do {
			System.out.print("Usu�rio: ");
			user = sc.nextLine();
			System.out.print("Senha: ");
			password = sc.nextLine();
			if (user.equalsIgnoreCase(password)) {
				System.out.println("Erro, usu�rio e senha iguais.");
			}
		}while (user.equalsIgnoreCase(password));
		
		
		sc.close();
		
	}

}
