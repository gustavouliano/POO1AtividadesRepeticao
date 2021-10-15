import java.util.Scanner;

public class at32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = 0;
		double veiculo = 0;
		double acidente = 0;
		double maiorIndice = 0;
		double menorIndice = 0;
		double indice = 0;
		int codMaiorIndice = 0;
		int codMenorIndice = 0;
		double somaVeiculo = 0;
		double somaAcidente = 0;
		int contador2k = 0;
		
		for (int i = 1; i <= 5; i++ ) {
			
			System.out.print("Código da cidade: ");
			codigo = sc.nextInt();
			System.out.print("Número de veículos de passeio (em 1999): ");
			veiculo = sc.nextInt();
			System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");
			acidente = sc.nextInt();
			
			indice = ((acidente/veiculo) * 100);
			
			if (i == 1) {
				maiorIndice = indice;
				menorIndice = indice;
				codMaiorIndice = codigo;
				codMenorIndice = codigo;
			}else if (indice > maiorIndice) {
				maiorIndice = indice;
				codMaiorIndice = codigo;
			}else if (indice < menorIndice) {
				menorIndice = indice;
				codMenorIndice = codigo;
			}
			
			if (veiculo < 2000) {
				somaAcidente+= acidente;
				contador2k++;				
			}
			
			somaVeiculo+= veiculo;	
			
		}
		
		double mediaVeiculo = somaVeiculo / 5;
		double mediaAcidente2k = somaAcidente / contador2k; 
		
		System.out.println("Menor índice: " + menorIndice + " | Cidade " + codMenorIndice);
		System.out.println("Maior índice: " + maiorIndice + " | Cidade " + codMaiorIndice);
		System.out.println("Média de veículos das 5 cidades juntas: " + mediaVeiculo);
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos: " + mediaAcidente2k);
		
		sc.close();
		
	}

}