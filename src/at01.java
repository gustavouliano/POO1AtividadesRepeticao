import java.util.Scanner;

public class at01 {

	public static void main(String[] args) {
		/*
		 Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o valor
			seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma nota entre 0 e 10: ");
		double nota = sc.nextDouble();
		
		while (nota <0 || nota >10) {
			System.out.print("Valor inv�lido. Digite novamente: ");
			nota = sc.nextDouble();
		}
		
		sc.close();

	}

}
