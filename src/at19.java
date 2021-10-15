import java.util.Scanner;

public class at19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número inteiro: ");
		int n = sc.nextInt();
		
		int contPrimo = 0;
		int contDivisao = 0;
		
		System.out.print("Números primos: ");
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
			
				if (i % j == 0) {
					contPrimo++;
				}
				
				contDivisao++;	
			}
			if (contPrimo == 2) {
				System.out.print(i + " | ");
			}
			contPrimo = 0;
		}
		
		System.out.println("\n" +contDivisao + " divisões executadas.");
		
		sc.close();
		
	}

}