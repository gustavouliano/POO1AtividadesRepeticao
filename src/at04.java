import java.util.Scanner;
import java.lang.Math;

public class at04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int ano = 0;
		double taxaAnualA, taxaAnualB;
		double popA, popB = 0;
		int flag = 1;
		
		while (flag != 0) {
			do {
				System.out.print("Popula��o A: ");
				popA = sc.nextInt();
				if (popA < 1)
					System.out.println("Valor inv�lido");
			}while (popA < 1);
		
			do {
				System.out.print("Taxa de crescimento anual A (%): ");
				taxaAnualA = sc.nextDouble();
				if (taxaAnualA <= 0)
					System.out.println("Valor inv�lido");
			}while (taxaAnualA <=0);
		
			do {
				System.out.print("Popula��o B: ");
				popB = sc.nextInt();
				if (popB < 1)
					System.out.println("Valor inv�lido");
			}while (popB < 1);
		
			do {
				System.out.print("Taxa de crescimento anual B (%): ");
				taxaAnualB = sc.nextDouble();
				if (taxaAnualB <= 0)
					System.out.println("Valor inv�lido");
			}while (taxaAnualB <= 0);
		
			if (popB > popA) {
				while (popA < popB) {
					popA = Math.round(popA + (popA*(taxaAnualA/100)));
					popB = Math.round(popB + (popB*(taxaAnualB/100)));
			
					ano++;
				}
				System.out.println(ano + " anos necess�rios para a Popula��o A ultrapassar ou igualar a Popula��o B.");
			}else {
				while (popB < popA) {
					popA = Math.round(popA + (popA*(taxaAnualA/100)));
					popB = Math.round(popB + (popB*(taxaAnualB/100)));
			
					ano++;
				}
				System.out.println(ano + " anos necess�rios para a Popula��o B ultrapassar ou igualar a Popula��o A.");
			}
			System.out.println("[0] Fechar programa"
					+ "\n[1] Continuar programa");
			flag = sc.nextInt();
		}
		sc.close();
		
	}

}
