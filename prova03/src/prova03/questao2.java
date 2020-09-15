package prova03;

import java.util.Scanner;

public class questao2 {
	
	public static void main(String[]args) {
		
		 Scanner reading = new Scanner(System.in);
		 
		 System.out.println("Digite uma palavra:");
		     String x = reading.nextLine();
		     String saida = "";
		 reading(x,saida);
		 
		 reading.close();
	}
	public static String reading(String x, String saida) {
		
		
		for (int i = x.length()-1; i >= 0; i--) {
			saida = saida + x.charAt(i);
		}
		System.out.println(saida);
		
		return(x);
	}

}
