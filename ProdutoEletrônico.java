package exeGeneration;

public class ProdutoEletrônico {


	private String nome;
	private String tamanho;
	private String cor;
	private int ano;
	
	public ProdutoEletrônico (String nome,String tamanho,String cor,int ano)
	
	{
		this.cor = cor;
		this.tamanho = tamanho;
		this.nome = nome;
		this.ano = ano;
		
	}
	
	   public void imprimirInfo()
	{
		      System.out.println("Meu iphone "+nome+", na cor "+cor+","+tamanho+", Fabricado no ano de "+ano+".");
		      
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
