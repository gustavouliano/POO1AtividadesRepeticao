import java.util.Scanner;

public class at12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite até qual termo deseja: ");
		int termo = sc.nextInt();
		
		int n1, n2, n3;
		n1 = 1;
		n2 = 0;
		n3 = 0;
		
		for (int i = 1; i <= termo; i++) {
			
			System.out.print(n1 + " | ");
			
			n3 = n1; // vai guardar o termo atual
			n1 = n3+n2; // vai somar o termo atual com o termo anterior
			n2 = n3; // vai guardar o termo do n3, tornando-se o termo anterior
			
			// n1 1 1 2 3 5 
			// n2 0 1 1 2 3
			// n3 0 1 1 2 3
			
		}
		
		
		
		sc.close();

	}

}
