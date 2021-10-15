import java.util.Scanner;

public class at31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numAluno = 0;
		double alturaAluno = 0;
		int numAlto = 0;
		int numBaixo = 0;
		double alto = 0;
		double baixo = 0;
		
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Número do aluno: ");
			numAluno = sc.nextInt();
			System.out.print("Altura do aluno (cm): ");
			alturaAluno = sc.nextDouble();
			
			if (i == 1) {
				numAlto = numAluno;
				numBaixo = numAluno;
				alto = alturaAluno;
				baixo = alturaAluno;
			}else if (alturaAluno > alto) {
				alto = alturaAluno;
				numAlto = numAluno;
			}else if (alturaAluno < baixo) {
				baixo = alturaAluno;
				numBaixo = numAluno;
			}
			
		}
		
		System.out.println("Número alto: " + numAlto
				+ "\nAltura: " + alto);
		System.out.println("--------");
		System.out.println("Número baixo: " + numBaixo
				+ "\nAltura: " + baixo);
		
		sc.close();

	}

}
