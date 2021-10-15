
public class at15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 37;
		int cont = 1;
		double resultado = 0;
		
		System.out.print("S = ");
		for(int i = num; i >0; i--) {
			
			if (i != 1)
				System.out.print("(" + i + "*" + (i+1) + ")/" + cont + " + ");
			else
				System.out.print("(" + i + "*" + (i+1) + ")/" + cont + ".");
			
			resultado = resultado + ((i*(i+1))/cont);
			cont++;
			
		}
		
		System.out.println("\nResultado: " + resultado);
		
	}

}