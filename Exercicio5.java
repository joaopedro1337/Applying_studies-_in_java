import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner var = new Scanner(System.in);

		String nome1 , nome2;
		int idade1, idade2, diferenca;
		
		System.out.println("Infome o primeiro nome: ");
			nome1 = var.nextLine();
		System.out.println("Informe o segundo nome: ");	
			nome2 = var.nextLine();
			
		System.out.println("Informe a primeira idade: ");
			idade1 = var.nextInt();
		System.out.println("Informe a segunda idade: ");
			idade2 = var.nextInt();	
			
		if (idade1 > idade2) {
			System.out.println("Você tem mais idade " + nome1 + ", portando você é o mais velho(a).");
		}
		else 
			if (idade2 > idade1) {
			System.out.println("Você tem mais idade " + nome2 + ", portanto você é o mais velho(a).");
		}
		else {
			System.out.println("Vocês possuem a mesma idade!");
		}
		
		if (idade1 > idade2) {
			diferenca = idade1 - idade2;
			System.out.println();
			System.out.println("A diferença de idade entre as duas pessoas é de: " + diferenca + " anos.");
			System.out.println("============================================================================");
		}
		else {
			diferenca = idade2 - idade1;
			System.out.println();
			System.out.println("A diferença de idade entre as duas pessoas é de: " + diferenca + " anos.");
			System.out.println("============================================================================");
		}
	}

}
