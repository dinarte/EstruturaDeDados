package MetodoOrdenacao;

/**
 * @author Joao Victor
 *
 */
public class InsertionSort implements MetodoDeOrdenacao{

	/**
	 * M�todo de ordena��o do insertion sort
	 */
	public void ordenar(int[] array){
		
		//Comprimento do array recebido
		int arraySize = array.length;
				
		//Vari�vel que indica a posi��o do elemento a ser ordenado
		int start = 0;
		
		//Ponteiro para os valores anteriores ao valor atual que est� sendo analisado
		int anterior = 0;
		
		//Valor do ponteiro atual para ser comparado com os anteriores
		int escolhido = 0;
		
		for(start = 1; start < arraySize; start++){
			
			escolhido = array[start];
			anterior = start - 1;
			
			while(anterior >= 0 && escolhido < array[anterior]){
				//Avan�ar o anterior em uma posi��o no array
				array[anterior+1] = array[anterior];
				anterior = anterior - 1;
			}
			
			array[anterior+1] = escolhido;
		}
		//exibirPassos(array);
	}
	
	/**
	 * Método responsável por exibir o array a cada iteração
	 * @param array
	 * @param iteracao
	 */
	private void exibirPassos(int[] array){
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("\n");
	}
}
