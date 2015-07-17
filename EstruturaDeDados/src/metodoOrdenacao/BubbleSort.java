package metodoOrdenacao;

/**
 * Classe que implementa o metodo de ordenação BubbleSort
 * @author dinarte
 *
 */
public class BubbleSort implements MetodoDeOrdenacao{
	
	
	/**
	 * Ordena uma array de inteiros usando o BubbleSort
	 */
	public void ordenar(int[] n){
		int aux = 0;
		for(int i=n.length-1; i >= 1; i--){ 
			//System.out.println(i);
			for (int j = 0 ; j < i; j++) {
				if (n[j+1] < n[j]){
					aux = n[j+1];
					n[j+1] = n[j];
					n[j] = aux;
				}
			}
		}	
	}
	
}
