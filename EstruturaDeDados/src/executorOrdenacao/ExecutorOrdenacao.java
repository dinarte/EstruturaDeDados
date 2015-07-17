package executorOrdenacao;

import java.util.Date;
import java.util.List;

import metodoOrdenacao.MetodoDeOrdenacao;

/**
 * Esta classe executa os metodos de ordenação da fila de execução para cada tamanho de entrada declarado.
 * @author dinarte
 *
 */
public class ExecutorOrdenacao {

	/**
	 * Método que gera uma array com n inteiros aleatórios onde n é igual a tamanho.
	 * @param tamanho
	 * @return
	 */
	private static int[] gerarEntradaAleatoria(int tamanho){
		int[] array = new int[tamanho];
		for(int i = 0;  i< tamanho; i++){
			array[i] = (int) (Math.random() * tamanho + 1);  
		}
		return array;
	}
	
	/**
	 * Executa todos os métodos de ordenação presentes na fila de execução para cada tamanho de entrada informado.
	 * @param tamahos
	 */
	public static void executarParaCadaTamanhoDeEntrada(int[] tamahos){
		for (int tamaho : tamahos) {
			List<MetodoDeOrdenacao> metodos = FilaDeExecucao.itens;
			for (MetodoDeOrdenacao metodoDeOrdenacao : metodos) {
				int[] array = gerarEntradaAleatoria(tamaho);
				Date inicio = new Date();
				metodoDeOrdenacao.ordenar(array);
				Date fim = new Date();
				System.out.println(metodoDeOrdenacao.getClass().getSimpleName() + ": n=" + tamaho + " - tempo = " + (fim.getTime() -inicio.getTime())+"ms ");
			}
			System.out.println("-------------------------------------------------");
		}	
	}

	private static void printArrayOrdenado(int[] array) {
		for (int item : array) {
			System.out.print(item+", ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
	}
	
	public static void main(String[] args) {
		executarParaCadaTamanhoDeEntrada(new int[]{10000, 30000, 50000, 70000, 100000});
	}
	
}
