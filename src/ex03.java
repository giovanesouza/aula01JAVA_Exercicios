
public class ex03 {

	public static void main(String[] args) {

// 3 - Considerando que para um consórcio, sabe-se o número total de prestações,
// a quantidade de prestações pagas e o valor atual da prestação, escreva um algoritmo
// que determine o total pago pelo consorciado e o saldo devedor.
		
		
		int totalPrestacoes = 12;
		int prestacoesPagas = 5;
		double valor = 150;
		
		double totalPago = valor * prestacoesPagas;
		double saldoDevedor = (valor * totalPrestacoes) - totalPago ;
		
		System.out.println("Total pago: R$ " + totalPago + " e Saldo Devedor: R$ " + saldoDevedor);
		

	}

}
