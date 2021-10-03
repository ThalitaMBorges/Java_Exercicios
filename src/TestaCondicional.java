
public class TestaCondicional {
	
	public static void main(String[] args) {
	
		System.out.println("Testando Condicionais");
		
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você é maior de 18 anos, pode entrar!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é maior de 18 anos, "
						+ "mas está acompanhado, pode entrar!");
			} else {
			System.out.println("Você não é maior de 18 anos e não está acompanhado, "
					+ "não pode entrar!");
			}
		}
	}
}
