import java.util.Locale; 

public class saida_de_dados {
	
		/* Initial */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario;
		char sexo;
		String nome;
		
		idade = 19;
		salario = 2000.00;
		sexo = 'M';
		nome = "João Pedro";
		
		System.out.println("O funcionário " + nome + ", sexo " + sexo + ", ganha R$" + String.format("%.2f", salario) 
		+ " reais," + " e tem " + idade + " anos.");
	}
}