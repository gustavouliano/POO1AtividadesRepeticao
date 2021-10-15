import java.util.Scanner;

public class at23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de turmas: ");
		int qtdTurma = sc.nextInt();
		
		
		int aluno;
		int soma = 0;
		double media = 0;
		
		for (int i = 1; i <= qtdTurma; i++) {
			do {
				System.out.print("Quantidade de alunos da " + i + "ª turma: ");
				aluno = sc.nextInt();
				if ((aluno < 0) || (aluno > 40))
						System.out.println("Valor inválido, digite novamente.");
			}while((aluno < 0) || (aluno > 40));
			
			soma+= aluno;
			aluno = -1;		
		}
		
		media = soma/qtdTurma;
		
		System.out.println("Média de alunos por tuma: " + media);
		
		sc.close();
		
	}

}