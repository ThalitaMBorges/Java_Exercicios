
public class TestaCondicional {
	
	public static void main(String[] args) {
	
		System.out.println("Testando Condicionais");
		
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de 18 anos, pode entrar!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o � maior de 18 anos, "
						+ "mas est� acompanhado, pode entrar!");
			} else {
			System.out.println("Voc� n�o � maior de 18 anos e n�o est� acompanhado, "
					+ "n�o pode entrar!");
			}
		}
	}
}
