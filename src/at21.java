import java.util.Scanner;

public class at21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas: ");
		int qtdPessoa = sc.nextInt();
		int idade = 0;
		int soma = 0;
		
		for (int i = 1; i <= qtdPessoa; i++) {
			
			System.out.print(i + "° idade: ");
			idade = sc.nextInt();
			
			soma+= idade;
		}
		
		double media = soma/qtdPessoa;

		System.out.println("Média de idade: " + media);
		if ((media >= 0) && (media <= 25))
			System.out.println("Turma jovem.");
		else if (media <= 60)
			System.out.println("Turma adulta.");
		else {
			System.out.println("Turma idosa.");
		}
		
		sc.close();

	}

}		