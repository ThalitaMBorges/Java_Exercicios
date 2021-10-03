public class TestaCondicional2 {
	
	public static void main(String[] args) {
	
		System.out.println("Testando Condicionais");
		
		int idade = 20;
		int quantidadePessoas = 6;
		boolean acompanhado = quantidadePessoas >= 3;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Bem vindo!");
			} else {
			System.out.println("Infelizmente você não pode entrar!");
			}
	}
}


