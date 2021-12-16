package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExeCachorro cachorro1  = new ExeCachorro("Margot","Au au!",12,true);
		ExeCavalo cavalo1= new ExeCavalo("Trovão","IHIHIHIHHIHI!!",20,true);
		ExePreguiça preguica1= new ExePreguiça("Lili","zZzZzZz",30,true);
		
		cachorro1.imprimirInfo();
		cachorro1.imprimirMovimento();
		
		cavalo1.imprimirInfo();
		cavalo1.imprimirMovimento();
		
		preguica1.imprimirInfo();
		preguica1.imprimirMovimento();
	}

}