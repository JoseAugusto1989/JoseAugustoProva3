package prova03;

import java.util.Scanner;

public class questao1 {
	
	static int num = 10;
	
	public static void main(String[]args) {
		
        Scanner reading = new Scanner(System.in);
		
		int nota[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Digite a nota do aluno:");
			    nota[i] = reading.nextInt();
		}
		
		reading(nota);
		
		reading.close();
	}
	public static int[] reading(int nota2[]) {
		
		int aux1 = 0;
		int aux2 = 1;
		
		for (int i = 0; i < num*2; i++) {
		    if (nota2[i] < 60) {
		    	nota2[i+1] = aux1;
		    	
		    } else if (nota2[i] > 60) {
			    nota2[i+1] = aux2;

		    }
		    System.out.println(nota2[i]);
		    
		}
		
		return reading(nota2);
	}

}
