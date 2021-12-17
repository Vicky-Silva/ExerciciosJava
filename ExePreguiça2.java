package exeGeneration;

public class ExePregui�a2 extends ExeAnimaisBase{

	private boolean SubirEmArvore;
	
	public ExePregui�a2(String nome, int idade, boolean SubirEmArvore) {
		
		     super(nome, idade);
		     this.SubirEmArvore=SubirEmArvore;
		     
	}
	
	public boolean isSubirEmArvore() {
		    return SubirEmArvore;
		    
	}
	
	public void setSubirEmArvore(boolean SubirEmArvore) {
		     this.SubirEmArvore = SubirEmArvore;
		     
	}
	

	public void imprimirMovimento() {
		  if(isSubirEmArvore()==true) {
			System.out.println("Gosta de subir em �rvores!");
	 }
}		  
	
	public void imprimirInfo() {;
		     System.out.println("\n ---Informa��es da Pregui�a---\nNome: "+getNome()+"\nIdade: "+getIdade());
		     
	}
	
	public String getSom() {
		      return ("Som: "+super.getSom());
		      
	}
	
}
