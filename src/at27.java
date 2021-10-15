import java.util.Scanner;

public class at27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = 0;
		int contador = 1;
		double soma = 0;
		double valorPagamento = 0;
		double troco = 0;
		
		while (true){
			
			System.out.println("Lojas Tabajara");
			do {
				System.out.print("Produto " + contador + ": R$ ");
				valor = sc.nextDouble();
				contador++;
				soma+= valor;
			}while (valor != 0);
			
			
			System.out.println("Total: R$ " + soma);
			System.out.print("Dinheiro fornecido do cliente: R$ ");
			valorPagamento = sc.nextDouble();
			troco = valorPagamento - soma;
			System.out.println("Troco: R$ " + troco);
			
			contador = 1;
			soma = 0;
			
			System.out.println("====================");

			sc.close();
			
		}

	}

}