import java.util.Scanner;

public class at28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de temperaturas: ");
		int qtdTemp = sc.nextInt();
		
		double temperatura = 0;
		double maior = 0;
		double menor = 0;
		double soma = 0;
		double media = 0;
		
		
		for (int i = 1; i <= qtdTemp; i++) {
			
			System.out.print(i + "ª temperatura: ");
			temperatura = sc.nextDouble();
			
			if (i == 1) {
				maior = temperatura;
				menor = temperatura;
			}
			
			if (temperatura > maior)
				maior = temperatura;
			else if (temperatura < menor)
				menor = temperatura;
			
			soma+= temperatura;
			
		}
		
		media = soma / qtdTemp;
		
		System.out.println("Menor temperatura: " + menor + " °C"
				+ "\nMaior temperatura: " + maior + " °C"
				+ "\nMédia das temperaturas: " + media + " °C");
		
		sc.close();
		
	}

}
