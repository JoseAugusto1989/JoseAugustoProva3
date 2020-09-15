package prova03;

import java.util.Scanner;

public class questao3 {
	
	public static void main(String[]args) {
		
		 Scanner reading = new Scanner(System.in);
		 
		 System.out.println("Digite uma palavra:");
		     String x = reading.nextLine();
		     String saida = "";
		     
		 reading.close();
		
	}
	public static String pali(String x, String saida) {
		
		for (int i = x.length()-1; i >= 0; i--) {
			saida = saida + x.charAt(i);
		}
	}
	

}
