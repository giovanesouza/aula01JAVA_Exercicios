
public class ex01 {

	public static void main(String[] args) {

// 1 - O custo de um carro novo ao consumidor é a soma
// do custo de fábrica com a porcentagem do distribuidor
// e dos impostos (aplicados ao custo de fábrica).
//Supondo que o percentual do distribuidor seja de 28%
// e os impostos de 45%, escrever um código para processar
// e mostrar o custo final ao consumidor.

		double precoCarro = 45000;
		double porcDistribuidor = precoCarro * 0.28;
		double imposto = precoCarro * 0.45;
		
		double valorFinal = precoCarro + porcDistribuidor + imposto;
		
		
		System.out.println("O preço final é de R$: " + valorFinal);
		
		
		
	}

}
