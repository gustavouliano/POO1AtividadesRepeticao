import java.util.Scanner;

public class at11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num, qtd_par, qtd_impar;
		
		qtd_par = 0;
		qtd_impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "� n�mero inteiro: ");
			num = sc.nextInt();
			
			if (num % 2 == 0)
				qtd_par++;
			else
				qtd_impar++;
		}
		
		System.out.println("Quantidade de n�meros PARES: " + qtd_par
				+ "\nQuantidade de n�meros �MPARES: " + qtd_impar);
		
		sc.close();
		
	}

}
