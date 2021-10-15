import java.util.Scanner;

public class at01 {

	public static void main(String[] args) {
		/*
		 Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
			seja inválido e continue pedindo até que o usuário informe um valor válido.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma nota entre 0 e 10: ");
		double nota = sc.nextDouble();
		
		while (nota <0 || nota >10) {
			System.out.print("Valor inválido. Digite novamente: ");
			nota = sc.nextDouble();
		}
		
		sc.close();

	}

}
