package executorOrdenacao;

import java.util.Date;
import java.util.List;

import MetodoOrdenacao.MetodoDeOrdenacao;

/**
 * Esta classe executa os metodos de ordena��o da fila de execu��o para cada tamanho de entrada declarado.
 * @author dinarte
 *
 */
public class ExecutorOrdenacao {

	/**
	 * M�todo que gera uma array com n inteiros aleat�rios onde n � igual a tamanho.
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
	 * Executa todos os m�todos de ordena��o presentes na fila de execu��o para cada tamanho de entrada informado.
	 * @param tamahos
	 */
	public static void executarParaCadaTamanhoDeEntrada(int[] tamahos){
		for (int tamaho : tamahos) {
			//System.out.println("Execu��o da fila de m�todos de ordena��o para n=:" + tamaho);
			int[] array = gerarEntradaAleatoria(tamaho);
			
			List<MetodoDeOrdenacao> metodos = FilaDeExecucao.itens;
			
			for (MetodoDeOrdenacao metodoDeOrdenacao : metodos) {
				Date inicio = new Date();
				metodoDeOrdenacao.ordenar(array);
				Date fim = new Date();
				System.out.println(metodoDeOrdenacao.getClass().getSimpleName() + ": n=" + tamaho + " - tempo = " + (fim.getTime() -inicio.getTime())+"ms ");
			}
			
			System.out.println("-------------------------------------------------");
			for (int item : array) {
				System.out.print(item+", ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}	
	}
	
	public static void main(String[] args) {
		executarParaCadaTamanhoDeEntrada(new int[]{10,20,30});
	}
	
}
