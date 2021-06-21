/* Biblioteca para uso do . */
/* System.out.println = Pula uma linha */
/* System.out.print = Deixa na mesma linha */
import java.util.Locale; 

public class tudo_java_raizes {
	/* Todo o programa que eu for executar, tem que estar com esse começo abaixo */
	public static void main(String[] args) {
		
		/* Aqui declara que o separador vai ser com ponto, e não vírgula */
		
		Locale.setDefault(Locale.US);
		
		int idade1;
		double salario, altura;
		char genero;
		String nome;
		
			idade1 = 30;
			salario = 5800.5;
			altura = 1.72;
			genero = 'F';
			nome = "Maria Silva";
				/* Concatenar em JAVA é usando o +, depois de ".." */
			
			System.out.println("NOME = " + nome);
			/* String.format("%.2f", variavel)) <-- Forma de colocar em casa decimal*/
			
			System.out.println("SALARIO = " + String.format("%.2f", salario));
			System.out.println("ALTURA = " + String.format("%.2f", altura));
			System.out.println("GENÊRO = " + genero);
	}
}