package exeGeneration;

public class ExeCavalo2 extends ExeAnimaisBase {

	   private boolean correr;
	   
	   public ExeCavalo2(String nome, int idade, boolean correr) {
		   
		      super(nome, idade);
		      this.correr=correr;
		      
		      
	   }
	   
	   public boolean isCorrer() {
		      return correr;
	   }
	   
	   public void setCorrer(boolean correr) {
		      this.correr = correr;
	   }
	   
	   public void imprimirMovimento() {
	            if(isCorrer()==true) { 
	              System.out.println("Gosta muito de correr!");
	              
	         }
	           
	   }
	   
	   public void imprimirInfo() {
		   System.out.println("\n---Dados do Cavalo---\nNome: "+getNome()+"\nIdade: "+getIdade());
	   }
	   
	   public String getSom() {
		     return ("Som: "+getSom());
	   }
	   
	   
}
