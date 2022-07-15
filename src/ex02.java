
public class ex02 {

	public static void main(String[] args) {
	
//	2 - Desenvolva um código que seja atribuido a uma variável o nome de um piloto, 
// uma distância percorrida em km e o tempo que o piloto levou para percorrê-la (em horas).
// O programa deve calcular a velocidade média em km/h, e exibir a seguinte frase:
// A velocidade média de XX foi YY km/h, onde XX é o nome do piloto, e YY é a velocidade média.
	
		String piloto = "Giovane";
		int distancia = 25;
		double tempo = 2;
		
		double vm = distancia / tempo;
		
		System.out.println("A velocidade média de " + piloto + " foi " + vm + " Km/h.");
		
		
		
		
		
	}

}
