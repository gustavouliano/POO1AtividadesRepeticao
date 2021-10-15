import java.util.Scanner;

public class at13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fatorial do número: ");
		int num = sc.nextInt();
		
		int result = 1;
		
		for (int i = num; i > 0; i--) {
			result = result * i;
		}
		
		System.out.println(num + "! = " + result );
		
		sc.close();
		
	}

}