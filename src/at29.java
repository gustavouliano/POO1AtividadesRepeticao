import java.util.Scanner;

public class at29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int tabuada = sc.nextInt();
		System.out.print("Come�ar por: ");
		int start = sc.nextInt();
		
		int stop = 0;
		do {
			System.out.print("Terminar em (maior que in�cio): ");
			stop = sc.nextInt();
		}while (stop < start);
		
		System.out.println("Vou montar a tabuada de " + tabuada + " come�ando em " + start + " e terminando em " + stop + ": ");
		for (int i = start; i <= stop; i++) {
			System.out.println(tabuada + " x " + i + " = " + tabuada * i);
			
		}
		
		sc.close();

	}

}