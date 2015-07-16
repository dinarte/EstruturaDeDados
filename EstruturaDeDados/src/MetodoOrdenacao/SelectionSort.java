package MetodoOrdenacao;
/**
 * @author Joao Victor
 *
 */
public class SelectionSort implements MetodoDeOrdenacao{

	/**
	 * Método de ordenação do selection sort
	 */
	public void ordenar(int[] array){
		
		//Comprimento do array recebido
		int arraySize = array.length;
		
		//VariÃ¡vel que indica a posição do elemento a ser ordenado
		int start = 0;
		
		//Menor valor encontrado a cada iteração
		int menor;
		
		for(start = 0; start < arraySize - 1; start++){
			//Sempre considerar o menor como sendo o start, porque ainda não se conhece o resto
			menor = start;
			
			//Percorrer os demais elementos desconhecidos na sequencia
			for(int i = menor + 1; i < arraySize; i++){
				//Caso o elemento observador atualmente seja menor que o menor valor encontrado até então, atualizar ponteiro
				if(array[menor] > array[i])
					menor = i;
			}
			
			//Caso tenha encontrado um valor menor do que o menor inicial, trocar
			if(menor != start){
				int aux = array[menor];
				array[menor] = array[start];
				array[start] = aux;
			}	
		}
		exibirPassos(array);
	}
	
	/**
	 * Método responsável por exibir os valores do array
	 * @param array
	 * @param iteracao
	 */
	private void exibirPassos(int[] array){
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("\n");
	}
}
