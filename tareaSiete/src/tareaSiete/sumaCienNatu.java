package tareaSiete;

import java.util.Scanner;

public class sumaCienNatu {


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
        int tam = sc.nextInt();
        
	        System.out.println("La suma de los numeros, del 1 al " + tam +" es:");
	        int suma =0;
	        for(int i = 1; i <= tam; i++) {
	        	 suma += i;
	        	 
	        }
	        System.out.println("El resultado es: "+suma); 
	     

}

}