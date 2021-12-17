package exeGeneration;

public class TesteAnimais2 {

	  public static void main(String[] args) {
		  
		  ExeCachorro2 Cachorro = new ExeCachorro2("Margot", 24, true);
		  Cachorro.setSom("Au au");
		  
		  ExeCavalo2 Cavalo = new ExeCavalo2("Trov�o", 30, true);
		  Cavalo.setSom("RIRIRIRIRI");
		  
		  ExePregui�a2 Pregui�a = new ExePregui�a2("Lili", 28, true);
		  Pregui�a.setSom("ZzZzZzZz");
		  
		  
	      Cachorro.imprimirInfo();
	      Cachorro.imprimirMovimento();
	      
	      Cavalo.imprimirInfo();
	      Cavalo.imprimirMovimento();

	      Pregui�a.imprimirInfo();
	      Pregui�a.imprimirMovimento();
	      System.out.println(" ");
	      
	      ExeAnimaisBase[] animais = new ExeAnimaisBase[3];
	      animais[0] = Cachorro;
	      animais[1] = Cavalo;
	      animais[2] = Pregui�a;
	      
	      for(ExeAnimaisBase animal:animais) {
	    	    System.out.println(animal.getSom());
	    	    
	       }
	  }
}
