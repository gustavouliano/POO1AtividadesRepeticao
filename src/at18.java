import java.util.Scanner;

public class at18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		int contador = 0;
		String divisiveis = "É divisível por: ";
			
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				contador++;
				divisiveis = divisiveis + i + ", ";
			}
			
		}
		
		if (contador == 2) {
			System.out.println("É um número primo.");
		}else {
			System.out.println("Não é um número primo.\n" + divisiveis);
		}
		
		sc.close();

	}

}