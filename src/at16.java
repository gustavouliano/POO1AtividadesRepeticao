import java.util.Scanner;

public class at16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de números que deseja digitar: ");
		int qtdNum = sc.nextInt();
		double menor = 0;
		double maior = 0;
		double soma = 0;
		double num;
		
		for (int i = 1; i <= qtdNum; i++) {
			System.out.print(i + "° número: ");
			num = sc.nextDouble();
			
			if (i == 1) {
				maior = num;
				menor = num;
			}else {
				if (num > maior) {
					maior = num;
				}else if (num < menor) {
					menor = num;
				}
			}
			soma+= num;		
				
		}
		
		System.out.println("Soma: " + soma
				+ "\nMaior: " + maior
				+ "\nMenor: " + menor);
		
		sc.close();
		
	}

}