package ExercicioParaEntrega;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a sua equação:");
		String equacao = sc.nextLine();
		
		sc.close();

		Pilha pilha = preencherPilhaComParenteses(equacao);

		verificarParentesesDaPilha(pilha);
	}
	
	/**
	 * Dado uma equacao matematica, retorna uma pilha com 
	 * todos os parenteses que existem na equacao.
	 * 
	 * @param equacao - String que contem formula matematica.
	 * @return pilha - Pilha que contem apenas parenteses.
	 */
	private static Pilha preencherPilhaComParenteses(String equacao) {		
		int tamanhoPilha = 25;
		
		Pilha pilha = new Pilha(tamanhoPilha);
		
		for (int i = 0; i < equacao.length(); i++) {
			if (equacao.charAt(i) == '(' || equacao.charAt(i) == ')') {
				pilha.push(equacao.charAt(i));
			}
		}
		return pilha;
	}

	/**
	 * Verifica se os parenteses da pilha estao corretos.
	 * 
	 * @param pilha - Pilha que contem apenas parenteses.
	 */
	private static void verificarParentesesDaPilha(Pilha pilha) {
		verificarTamanhoDaPilha(pilha);
		verificarOrdemDosParentes(pilha);
	}
	
	/**
	 * Dado uma pilha, ele verifica se a quantidade de parenteses e par.
	 * Caso seja impar, existe mais parenteses abertos '(' OU mais 
	 * parasenteses fechados ')' na equacao.
	 * 
	 * @param pilha - Pilha que contem apenas parenteses.
	 */
	private static void verificarTamanhoDaPilha(Pilha pilha) {
		if (pilha.size() % 2 != 0) {
			System.out.println("Equação Mal Formada!!");
			System.exit(0);
		}

	}
	
	/**
	 * Verifica a ordem dos parenteses, para cada parenteses ')' soma +1 no contador
	 * e para cada parenteses '(' subtrai -1 do contador. Caso o contador seja -1, a equacao
	 * esta com um '(' a mais. Apos o laço se o valor do contador for diferente de 0, é uma 
	 * equacao mal formada, caso contrario é uma equacao bem formada.
	 * @param pilha - Pilha que contem apenas parenteses.
	 */
	private static void verificarOrdemDosParentes(Pilha pilha) {
		int ordemDosParenteses = 0;
		
		for (int i = pilha.size(); i > 0; i--) {
			char parentes = pilha.pop();
			if (parentes == ')') {
				ordemDosParenteses++;
			}
			if (parentes == '(') {
				ordemDosParenteses--;
			}

			if (ordemDosParenteses == -1) {
				break;
			}
		}
		if (ordemDosParenteses !=0) {
			System.out.println("Equação Mal Formada!!");
		}
		else {
			System.out.println("Equação Bem Formada!!");
		}
	}
}