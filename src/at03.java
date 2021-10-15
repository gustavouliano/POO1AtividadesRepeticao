import java.util.Scanner;

public class at03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		float salario;
		char sexo;
		char estadoCivil;
		
		do {
			System.out.print("Nome (maior que 3 caracteres): ");
			nome = sc.nextLine();
			if (nome.length() < 4)
				System.out.println("Nome inválido");
		}while (nome.length() < 4);
		do {
			System.out.print("Idade (entre 0 e 150): ");
			idade = sc.nextInt();
			if (idade < 0 || idade > 150)
				System.out.println("Idade inválida");
		}while (idade < 0 || idade > 150);		
		do {
			System.out.print("Salário (maior que zero): ");
			salario = sc.nextFloat();
			if (salario <= 0)
				System.out.println("Salário inválido");
		}while (salario <= 0);		
		do {
			System.out.print("Sexo (f ou m): ");
			sexo = sc.next().charAt(0);
			if (Character.toLowerCase(sexo) != 'f' && Character.toLowerCase(sexo) != 'm')
				System.out.println("Sexo inválido");
		}while (Character.toLowerCase(sexo) != 'f' && Character.toLowerCase(sexo) != 'm');
		do {
			System.out.print("Estado Civil ('s', 'c', 'v', 'd'): ");
			estadoCivil = sc.next().charAt(0);
			estadoCivil = Character.toLowerCase(estadoCivil);
			if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd')
				System.out.println("Sexo inválido");
		}while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
		
		System.out.println("Validação completa");
		
		sc.close();
		
	}

}