package exeGeneration;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	       	Scanner leia = new Scanner(System.in);
		
		
	int anos,meses,dias,totalDias;
	
	System.out.println("\nEntre quantos anos viveu: ");
	anos=leia.nextInt();
	System.out.println("\nEntre quantos meses viveu: ");
	meses=leia.nextInt();
	System.out.println("\nEntre quantos dias viveu: ");
	dias=leia.nextInt();
	
	totalDias = anos*365 + meses*30 + dias;
	
	System.out.println("\nVoc� viceu "+totalDias+" dia(s)");
	
	}
	
}