import java.util.Scanner;

public class at34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num = 0;
		int intervalo1 = 0;
		int intervalo2 = 0;
		int intervalo3 = 0;
		int intervalo4 = 0;
		
		while(num >=0) {
			
			System.out.print("N�mero: ");
			num = sc.nextDouble();
			
			if (num >= 0 && num < 26)
				intervalo1++;
			else if (num < 51)
				intervalo2++;
			else if (num < 76)
				intervalo3++;
			else if (num <= 100)
				intervalo4++;
		}		
		
		System.out.println("[0-25] - " + intervalo1 + " n�meros"
				+ "\n[26-50] - " + intervalo2 + " n�meros"
				+ "\n[51-75] - " + intervalo3 + " n�meros"
				+ "\n[76-100] - " + intervalo4 + " n�meros");
		
		sc.close();

	}

}
