import java.util.Scanner;

public class at08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1° número: ");
		int n1 = sc.nextInt();
		System.out.print("2° número: ");
		int n2 = sc.nextInt();
		
		int maior, menor, soma = 0;
		
		if (n1 > n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		
		sc.close();
		
		for(int i = menor + 1; i < maior; i++) {
			System.out.println(i);
			soma = soma + i;
		}		
		
		System.out.println("Soma dos números: " + soma);

	}

}
