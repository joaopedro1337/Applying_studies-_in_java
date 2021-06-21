import java.util.Locale;
import java.util.Scanner; 
public class debug {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner var = new Scanner(System.in);
		
		double deltaS, deltaT, vm;
		
		System.out.println("Entre com o delta (S): ");
			deltaS = var.nextDouble();
		System.out.println("Entre com o delta (T):");
			deltaT = var.nextDouble();
			
		vm = deltaS / deltaT;
		
		System.out.println("A velocidade média é: " + String.format("%.2f", vm) + " KM/h");
	}

}
