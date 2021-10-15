import java.util.Scanner;

public class at10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base: ");
		double base = sc.nextDouble();
		System.out.print("Expoente: ");
		double expoente = sc.nextDouble();
		
		double resultado = base;
		
		for (int i = 1; i < expoente; i++) {
			resultado = resultado * base;
		}
		
		System.out.println("Resultado: " + resultado);
		
		sc.close();
		
	}

}
