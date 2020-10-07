package ExercicioParaEntrega;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		int tamanhoFila = 25;
		
		Fila fila = new Fila(tamanhoFila);
		
		preencherFila(fila);
		
		imprimirFilaComRegraAcimaDe1000(fila);
		
	}
	
	public static void imprimirFilaComRegraAcimaDe1000(Fila fila) {
		for(int i=0; i < fila.size(); i++) {
			int valor = fila.dequeue();
			
			if(valor > 1000) {
				System.out.println("O seguinte arquivo está corrompido: " + valor);
			}
			else {
				System.out.println("Imprimindo o arquivo: " + valor);
			}
		}
	}

	public static void preencherFila(Fila fila) {
		Random random = new Random();
		
		for (int i = 0; i < fila.size(); i++) {
			fila.enqueue(random.nextInt(1500));
		}
	}
}
