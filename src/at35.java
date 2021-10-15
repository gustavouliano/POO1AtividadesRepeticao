import java.util.Scanner;

public class at35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char flag = 's';
		int codigo = 0;
		int qtd = 0;
		double precoTotal = 0;
		
		System.out.println("Especificação   | Código | Preço");
		System.out.println("Cachorro Quente |   100  | R$ 1,20");
		System.out.println("Bauru Simples   |   101  | R$ 1,30");
		System.out.println("Bauru com ovo   |   102  | R$ 1,50");
		System.out.println("Hambúrguer 	|   103  | R$ 1,20");
		System.out.println("Cheeseburguer   |   104  | R$ 1,30");
		System.out.println("Refrigerante    |   105  | R$ 1,00");
		
		do {
			do {
				System.out.print("Código do item: ");
				codigo = sc.nextInt();
			}while (codigo != 100 && codigo != 101 && codigo != 102 && codigo != 103 && codigo != 104 && codigo != 105);
			
			System.out.print("Quantidade desejada: ");
			qtd = sc.nextInt();
			
			if (codigo == 100) {
				precoTotal = precoTotal + (1.20 * qtd);
			}
			else if (codigo == 101) {
				precoTotal = precoTotal + (1.30 * qtd);
			}
			else if (codigo == 102) {
				precoTotal = precoTotal + (1.50 * qtd);
			}
			else if (codigo == 103) {
				precoTotal = precoTotal + (1.20 * qtd);
			}
			else if (codigo == 104) {
				precoTotal = precoTotal + (1.30 * qtd);
			}
			else {
				precoTotal = precoTotal + (1.00 * qtd);
			}
			
			do {
				System.out.println("Deseja continuar a compra? [S/N]: ");
				flag = Character.toLowerCase(sc.next().charAt(0));
			}while (flag == 's' && flag == 'n');
			
		}while(flag == 's'); 

		System.out.println("Preço total: R$" + precoTotal);
		
		sc.close();
		
	}

}
