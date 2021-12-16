package exeGeneration;

public class Patinete {

	private String nome;
	private String cor;
	private String tamanho;
	private int ano;
	
	public Patinete (String nome,String cor,String tamanho,int ano) 
	{
	
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
		this.ano = ano;
		
    }
	public void imprimirInfo()
	{
		   System.out.println("Aqui você encontra patinete "+nome+","+tamanho+", na cor "+cor+" fabricado no ano "+ano+".");
		   
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
