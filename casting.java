import java.util.Locale; 

public class casting {
	
		/* Initial */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		/* Se ficasse apenas a / b, a formata��o final viria como inteiro, por isso � importante 
		 deixar no casting. */
		resultado = (double) a / b;
		System.out.println("O RESULTADO � = " + resultado);
	}
}