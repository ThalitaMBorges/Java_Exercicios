
public class TesteIR {
	
	public static void main(String[] args) {
		System.out.println("Teste IR");
		
		// De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142
		// De 2800.01 at� 3751.0 o IR � de 15% e pode deduzir R$ 350
		// De 3751.01 at� 4664.00 o IR � de 22.5% e pode deduzir R$ 636
		
		double salario = 2800.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota � de 7.5%");
			System.out.println("Pode deduzir na declara��o o valor de R$142,00");
		
		} else if(salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Pode deduzir na declara��o o valor de R$ 350");
		
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("A sua aliquota � de 22.5%");
			System.out.println("Pode deduzir na declara��o o valor de R$ 636");
		}
	}
	
}
