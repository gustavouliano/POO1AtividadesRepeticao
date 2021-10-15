import java.util.Scanner;

public class at02 {

	public static void main(String[] args) {
		/*
		 Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
			nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
		 */

		Scanner sc = new Scanner(System.in);
		String user;
		String password;
		
		do {
			System.out.print("Usuário: ");
			user = sc.nextLine();
			System.out.print("Senha: ");
			password = sc.nextLine();
			if (user.equalsIgnoreCase(password)) {
				System.out.println("Erro, usuário e senha iguais.");
			}
		}while (user.equalsIgnoreCase(password));
		
		
		sc.close();
		
	}

}
