import java.util.Scanner;

public class at17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int num = sc.nextInt();
		
		int contador = 0;
		
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				contador++;
			}
			
		}
		
		if (contador == 2) {
			System.out.println("� um n�mero primo.");
		}else {
			System.out.println("N�o � um n�mero primo.");
		}
		
		sc.close();

	}

}