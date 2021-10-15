import java.util.Scanner;

public class at14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Mostrar série até o termo: ");
		int termo = sc.nextInt();
		int denominador = 1;
		
		System.out.print("S = ");
		for (int i = 1; i <= termo; i++) {
		
		if (i == termo)
			System.out.print(i + "/" + denominador + ".");
		else
			System.out.print(i + "/" + denominador + " + ");
			denominador = denominador + 2;
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
