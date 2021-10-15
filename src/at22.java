import java.util.Scanner;

public class at22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de votantes: ");
		int votantes = sc.nextInt();
		
		int voto = 0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int votoNulo = 0;
		
		for(int i = 0; i < votantes; i++) {
			System.out.println("Digite:"
					+ "\n 1 - Candidato 1"
					+ "\n 2 - Candidato 2"
					+ "\n 3 - Candidato 3");
			System.out.print("Seu voto: ");
			voto = sc.nextInt();
			
			if (voto == 1)
				c1++;
			else if (voto == 2)
				c2++;
			else if (voto == 3)
				c3++;
			else
				votoNulo++;
		}
		
		
		System.out.println("Candidato 1: " + c1 + " votos."
				+ "\nCandidato 2: " + c2 + " votos."
				+ "\nCandidato 3: " + c3 + " votos."
				+ "\nVoto nulo: " + votoNulo + " votos.");
		
		
		
		
		sc.close();
		
	}

}