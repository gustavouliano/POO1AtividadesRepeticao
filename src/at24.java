import java.util.Scanner;

public class at24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de CDs: ");
		int qtdCd = sc.nextInt();
		
		double valor = 0;
		double soma = 0;
		double media = 0;
		
		for (int i = 1; i <= qtdCd; i++) {
			
			System.out.print("Valor do " + i + "° CD: R$ ");
			valor = sc.nextDouble();
			
			soma+= valor;
			
		}
		
		media = soma/qtdCd;
		
		System.out.println("Valor total investido: R$ " + soma
				+ "\nValor médio em cada CD: R$ " + media);
		
		sc.close();
		
	}

}