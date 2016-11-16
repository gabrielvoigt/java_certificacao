public class Variavel{
	
	String nome = "teste";

	public void m1(String nome1){
		System.out.println(nome);
	}

	public static void main(String[] args){
		Variavel v = new Variavel();
		v.m1("teste");
	}
}
