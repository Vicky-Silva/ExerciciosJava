package exeGeneration;

import java.util.Scanner;

public class La�oDeRepeti�aoFor {

	 public static void main(String[] args) {
		 
		 Scanner ler = new Scanner(System.in);
				 
	      int x, num, par=0, impar=0;
		  
		 for (x=1;x<=10;x++)
		 {
			  System.out.print("Digite o "+x+"� n�mero: ");
			  num = ler.nextInt();
			  
			  if(num%2==0)
			  {
				   par++;
			  } else
			      {
				          impar++;
			  }
		 }
		 System.out.println("Foram figitados "+par+" n�meros pares e "+impar+" impares!");
	 }
		         
}
