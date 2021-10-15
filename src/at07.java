import java.util.Scanner;

public class at07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1° número: ");
		int n1 = sc.nextInt();
		System.out.print("2° número: ");
		int n2 = sc.nextInt();
		
		int maior, menor;
		
		if (n1 > n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		
		sc.close();
		
		for(menor++; menor < maior; menor++) {
			System.out.println(menor);
		}		
		
	}

}
