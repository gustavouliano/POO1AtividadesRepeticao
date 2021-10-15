import java.util.Scanner;

public class at20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de notas: ");
		int qtdNota = sc.nextInt();
		double nota = 0;
		double soma = 0;
		
		for (int i = 1; i <= qtdNota; i++) {
			System.out.print(i + "° nota: ");
			nota = sc.nextDouble();
			soma+= nota;
		}
		
		double resultado = soma/qtdNota;
		
		System.out.println("Média = " + resultado);
		
		sc.close();
		
	}

}