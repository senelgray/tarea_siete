package tareaSiete;
import java.util.Scanner;


public class imprimirTreinta {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
        int tam = sc.nextInt();
        
	        System.out.println("Los numeros pares, del 1 al " + tam +" es:");
	        for(int i = 1; i <= tam/2; i++) {
	        	int pares = i*2;
	        	 System.out.println(+pares); 
	        }
		
	     

}

}