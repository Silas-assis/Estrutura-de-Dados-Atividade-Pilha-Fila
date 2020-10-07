package ExercicioParaEntrega;

public class Fila {

	private int vetorFila[];
	private int fim;
	
	public Fila(int maxSize) {
		this.vetorFila = new int[maxSize];
		this.fim = -1;
	}

	// isFull
	public boolean isFull() {
		return (fim == vetorFila.length - 1);
	}

	// Enqueue
	public void enqueue(int j) {
		if (!isFull()) {
			fim++;
			vetorFila[fim] = j;
		}
	}

	// Print Fila
	public void display() {
		System.out.println("**** Imprimindo a fila ****");
		for (int i = 0; i <= fim; i++) {
			System.out.print(vetorFila[i] + " ");
		}
		System.out.println("\n********");
	}

	// Empty
	public boolean isEmpty() {
		return (fim == -1);
	}
	
	// Dequeue - remove
	public int dequeue() {
		int elemento;
		if (!isEmpty()) {
			elemento = vetorFila[0];
			for (int i = 0; i < fim; i++) {
				vetorFila[i] = vetorFila[i + 1];
			}
			fim--;
			return elemento;
		} else {
			return -1;
		}
	}

	public int size() {
		return vetorFila.length;
	}
	
}
