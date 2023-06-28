package tareaSiete;

import java.util.Scanner;

public class multiplicaSiete {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int tam =7;
		int multi =0;
		 int[]nums = new int[15];
		 System.out.println("La tabla de multiplicar de " +tam); 
	        for(int i = 1; i <= 10; i++) {
	        	multi = tam*i;
	        	 System.out.println(+tam + "x" + i + "="+multi); 
	        }
		
	     

}

}