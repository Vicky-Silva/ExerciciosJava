package exeGeneration;

public class TesteAnimais2 {

	  public static void main(String[] args) {
		  
		  ExeCachorro2 Cachorro = new ExeCachorro2("Margot", 24, true);
		  Cachorro.setSom("Au au");
		  
		  ExeCavalo2 Cavalo = new ExeCavalo2("Trovão", 30, true);
		  Cavalo.setSom("RIRIRIRIRI");
		  
		  ExePreguiça2 Preguiça = new ExePreguiça2("Lili", 28, true);
		  Preguiça.setSom("ZzZzZzZz");
		  
		  
	      Cachorro.imprimirInfo();
	      Cachorro.imprimirMovimento();
	      
	      Cavalo.imprimirInfo();
	      Cavalo.imprimirMovimento();

	      Preguiça.imprimirInfo();
	      Preguiça.imprimirMovimento();
	      System.out.println(" ");
	      
	      ExeAnimaisBase[] animais = new ExeAnimaisBase[3];
	      animais[0] = Cachorro;
	      animais[1] = Cavalo;
	      animais[2] = Preguiça;
	      
	      for(ExeAnimaisBase animal:animais) {
	    	    System.out.println(animal.getSom());
	    	    
	       }
	  }
}
