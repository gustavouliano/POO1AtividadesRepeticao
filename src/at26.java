import java.util.Scanner;

public class at26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Pre�o do p�o: R$ ");
		double precoPao = sc.nextDouble();
		
		System.out.println("Pre�o do p�o: R$ " + precoPao
				+ "\nPanificadora P�o de Ontem - Tabela de pre�os");
		for (int i = 1; i <= 50; i++) {
			
			System.out.println(i + " - R$ " + precoPao * i);
			
		}
		
		sc.close();
		
	}

}