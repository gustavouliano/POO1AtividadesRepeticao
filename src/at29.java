import java.util.Scanner;

public class at29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int tabuada = sc.nextInt();
		System.out.print("Começar por: ");
		int start = sc.nextInt();
		
		int stop = 0;
		do {
			System.out.print("Terminar em (maior que início): ");
			stop = sc.nextInt();
		}while (stop < start);
		
		System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + start + " e terminando em " + stop + ": ");
		for (int i = start; i <= stop; i++) {
			System.out.println(tabuada + " x " + i + " = " + tabuada * i);
			
		}
		
		sc.close();

	}

}