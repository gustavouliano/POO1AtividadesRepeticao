import java.util.Scanner;

public class at37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char flag = 'S';
		char q1 = 'a';
		char q2 = 'a';
		char q3 = 'a';
		char q4 = 'a';
		char q5 = 'a';
		char q6 = 'a';
		char q7 = 'a';
		char q8 = 'a';
		char q9 = 'a';
		char q10 = 'a';
		int nota = 0;
		int contAluno = 0;
		int maiorAcerto = 0;
		int menorAcerto = 0;
		int somaNota = 0;
		
		while (flag == 'S') {
			System.out.print("Questão 1: ");
			q1 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 2: ");
			q2 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 3: ");
			q3 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 4: ");
			q4 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 5: ");
			q5 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 6: ");
			q6 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 7: ");
			q7 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 8: ");
			q8 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 9: ");
			q9 = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Questão 10: ");
			q10 = Character.toLowerCase(sc.next().charAt(0));
			
			if (q1 == 'a')
				nota++;
			if (q2 == 'b')
				nota++;
			if (q3 == 'c')
				nota++;
			if (q4 == 'd')
				nota++;
			if (q5 == 'e')
				nota++;
			if (q6 == 'e')
				nota++;
			if (q7 == 'd')
				nota++;
			if (q8 == 'c')
				nota++;
			if (q9 == 'b')
				nota++;
			if (q10 == 'a')
				nota++;
			
			contAluno++;
			
			if (contAluno == 1) {
				maiorAcerto = nota;
				menorAcerto = nota;
			}else if (nota > maiorAcerto) {
				maiorAcerto = nota;
			}else if (nota < menorAcerto) {
				menorAcerto = nota;
			}
			
			somaNota = somaNota + nota;
			
			System.out.println("Nota: " + nota);
			nota = 0;
			
			System.out.println("Outro aluno vai utilizar o sistema? [S/N]");
			flag = Character.toUpperCase(sc.next().charAt(0));
			
		} 
		
		double mediaNota = somaNota / contAluno;
		
		System.out.println("Maior acerto: " + maiorAcerto);
		System.out.println("Menor acerto: " + menorAcerto);
		System.out.println("Total de alunos que utilizaram o sistema: " + contAluno);
		System.out.println("Média das notas: " + mediaNota);
		
		sc.close();

	}

}