import java.util.Scanner;

public class at36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int voto = 0;
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		int total5 = 0;
		int total6 = 0;
		int totalErrado = 0;
		int totalVotos = 0;
		
		do {
			System.out.println("1 - José | 2 - João | 3 - Ana | 4 - Pedro | 5 - Voto Nulo | 6 - Voto em Branco");
			System.out.print("Seu voto: ");
			voto = sc.nextInt();
			
			if (voto != 0) {
				
				totalVotos++;
				
				switch (voto) {
					case 1: 
						total1++;
						break;
					case 2:
						total2++;
						break;
					case 3:
						total3++;
						break;
					case 4:
						total4++;
						break;
					case 5:
						total5++;
						break;
					case 6:
						total6++;
						break;
					default:
						totalErrado++;
						break;
				}
				
			}
			
		}while(voto != 0);
		
		double porcentagemNulo = (total5 * 100) / totalVotos;  
		double porcentagemBranco = (total6 * 100) / totalVotos;
		
		System.out.println("José: " + total1 + " votos.");
		System.out.println("João: " + total2 + " votos.");
		System.out.println("Ana: " + total3 + " votos.");
		System.out.println("Pedro: " + total4 + " votos.");
		System.out.println("Nulo: " + total5 + " votos.");
		System.out.println("Em branco: " + total6 + " votos.");
		System.out.println("Porcentagem votos nulos: " + porcentagemNulo + "%");
		System.out.println("Porcentagem votos em branco: " + porcentagemBranco + "%");
		System.out.println(totalErrado + " votos errados");
		
		sc.close();
		
	}

}