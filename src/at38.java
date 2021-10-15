import java.util.Scanner;

public class at38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número inteiro positivo para inverter: ");
		int num = sc.nextInt();
		
		int numInvertido = 0;
		
		while (num > 0) {
			numInvertido = numInvertido * 10;
			numInvertido = numInvertido + (num % 10);
			num = num / 10;
			
		}
		
		System.out.println("=> " + numInvertido);
		
		sc.close();
		
	}

}