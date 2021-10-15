import java.util.Scanner;

public class at33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double divida = 0;
		int parcela = 0;
		int juros = 0;
		double valorJuros = 0;
		double valorParcela = 0;
		
		while (true) {

			System.out.print("Valor da dívida: ");
			divida = sc.nextDouble();
			
			do {
				
				System.out.print("Quantidade de parcelas: ");
				parcela = sc.nextInt();
				
			}while(parcela != 1 && parcela != 3 && parcela != 6 && parcela != 9 && parcela != 12);
			
			if (parcela == 1)
				juros = 0;
			else if (parcela == 3)
				juros = 10;
			else if (parcela == 6)
				juros = 15;
			else if (parcela == 9)
				juros = 20;
			else
				juros = 25;
			
			valorJuros = divida * (juros / 100);
			valorParcela = divida / parcela;
			
			System.out.print("Valor da dívida : R$ " + divida
					+ "\nValor do juros: " + valorJuros
					+ "\nQuantidade de parcelas: " + parcela
					+ "\nValor da parcela: R$" + valorParcela);
			System.out.println("\n==============================");
			
		}
		
	}

}