import java.util.Scanner;

public class at09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tabuada do número: ");
		int tabuada = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
		}
		
		sc.close();
		
	}

}