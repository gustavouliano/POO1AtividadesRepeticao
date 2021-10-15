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
			
			System.out.print("C�digo da cidade: ");
			codigo = sc.nextInt();
			System.out.print("N�mero de ve�culos de passeio (em 1999): ");
			veiculo = sc.nextInt();
			System.out.print("N�mero de acidentes de tr�nsito com v�timas (em 1999): ");
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
		
		System.out.println("Menor �ndice: " + menorIndice + " | Cidade " + codMenorIndice);
		System.out.println("Maior �ndice: " + maiorIndice + " | Cidade " + codMaiorIndice);
		System.out.println("M�dia de ve�culos das 5 cidades juntas: " + mediaVeiculo);
		System.out.println("M�dia de acidentes de tr�nsito nas cidades com menos de 2000 ve�culos: " + mediaAcidente2k);
		
		sc.close();
		
	}

}