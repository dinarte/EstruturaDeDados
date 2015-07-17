package metodoOrdenacao;
/**
 * Classe que implementa o m�todo de ordena��o HeapSort
 * @author dinarte
 *
 */
public class HeapSort implements MetodoDeOrdenacao{
	
	 	/**
	 	 * constroi um heap onde o o valor do pai sempre � maior que os filhos.
	 	 * @param entrada
	 	 */
	    private void construirHeapMaximo(int entrada[]) {
	        for (int i = entrada.length / 2 - 1; i >= 0; i--)
	            verificarHeapMaximo(entrada, i, entrada.length);
	    }

	    /**
	     * verifica se a estrutura est� atendendo a dfini��o de heap m�ximo, caso n�o, 
	     * efetua as trocas de posi��es necess�rias
	     */
	    private void verificarHeapMaximo(int[] entrada, int posicao, int tamanho) {
	        int max = 2 * posicao + 1;
	        int filhoDaDireita = max + 1;
	        if (max < tamanho) {
	            if (filhoDaDireita < tamanho && ( entrada[max] < entrada[filhoDaDireita]))
	                max = filhoDaDireita;
	            if (entrada[max] > entrada[posicao]) {
	                trocar(entrada, max, posicao);
	                verificarHeapMaximo(entrada, max, tamanho);
	            }
	        }
	    }

	    /**
	     * Troca a posi��o do filho pela posi��o do pai
	     * @param entrada
	     * @param j
	     * @param posicao
	     */
	    public void trocar(int[] entrada, int j, int posicao) {
	        int aux = entrada[j];
	        entrada[j] = entrada[posicao];
	        entrada[posicao] = aux;
	    }
	    
	    /**
	     * ]executa a ordena��o utilizando o heapSort
	     * @param entrada
	     */
	    public void ordenar(int[] entrada) {
	        construirHeapMaximo(entrada);
	        int n = entrada.length;

	        for (int i = entrada.length - 1; i > 0; i--) {
	            trocar(entrada, i, 0);
	            verificarHeapMaximo(entrada, 0, --n);
	        }
	    }

}
