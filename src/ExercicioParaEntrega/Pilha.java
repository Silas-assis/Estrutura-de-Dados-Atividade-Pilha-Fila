package ExercicioParaEntrega;

public class Pilha {

	private char[] vetor;
	private int topo;

	public Pilha(int tamanho) {
		this.vetor = new char[tamanho];
		this.topo = 0;
	}

	// isEmpty
	public boolean isEmpty() {
		return topo == 0;
	}

	// isFull
	public boolean isFull() {
		return (topo == vetor.length);
	}

	// Push
	public void push(char elemento) {
		if (!isFull()) {
			vetor[topo++] = elemento;
		}
	}

	// Pop
	public char pop() {
		if (!isEmpty()) {
			char elemento = vetor[--topo];
			return elemento;
		}
		return ' ';
	}

	// Peek
	public char peek() {
		if (!isEmpty()) {
			return vetor[topo];
		} 
		return ' ';
	}

	// Size
	public int size() {
		return topo;
	}

	// Print
	public void print() {
		for (int i = 0; i < topo; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
