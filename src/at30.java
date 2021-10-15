import java.util.Scanner;

public class at30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo = 0;
		double altura = 0;
		double peso = 0;
		int codigoAlto = 0;
		int codigoBaixo = 0;
		int codigoMagro = 0;
		int codigoGordo = 0;
		double alto = 0;
		double baixo = 0;
		double magro = 0;
		double gordo = 0;
		double somaAltura = 0;
		double somaPeso = 0;
		int cont = 0;
		
		do {
			System.out.print("Código do cliente: ");
			codigo = sc.nextInt();
			if (codigo == 0) {
				break;
			}
			
			cont++;
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			
			if (cont == 1) {
				codigoAlto = codigo;
				codigoBaixo = codigo;
				codigoMagro = codigo;
				codigoGordo = codigo;
				alto = altura;
				baixo = altura;
				magro = peso;
				gordo = peso;
			}
			somaAltura+= altura;
			somaPeso+= peso;
			
			if (altura > alto) {
				codigoAlto = codigo;
				alto = altura;
			}else if (altura < baixo) {
				codigoBaixo = codigo;
				baixo = altura;
			}
			
			if (peso < magro) {
				codigoMagro = codigo;
				magro = peso;
			}
			else if (peso > gordo) {
				codigoGordo = codigo;
				gordo = peso;
			}
			
		}while (true); 
		
		double mediaAltura = somaAltura / cont;
		double mediaPeso = somaPeso / cont;
		
		System.out.println("================");
		System.out.println("Mais alto: "
				+ "\nCódigo: " + codigoAlto
				+ "\nAltura: " + alto);
		System.out.println("================");
		System.out.println("Mais baixo: "
				+ "\nCódigo: " + codigoBaixo
				+ "\nAltura: " + baixo);
		System.out.println("================");
		System.out.println("Mais magro: "
				+ "\nCódigo: " + codigoMagro
				+ "\nPeso: " + magro + " kg");
		System.out.println("================");
		System.out.println("Mais gordo: "
				+ "\nCódigo: " + codigoGordo
				+ "\nPeso: " + gordo + " kg");
		System.out.println("================");
		System.out.println("Média altura: " + mediaAltura
				+ "\nMédia peso: " + mediaPeso + " kg");
		
		sc.close();	
		
	}

}
