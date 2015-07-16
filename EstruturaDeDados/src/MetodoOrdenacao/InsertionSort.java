package MetodoOrdenacao;

/**
 * @author Joao Victor
 *
 */
public class InsertionSort implements MetodoDeOrdenacao{

	/**
	 * Método de ordenação do insertion sort
	 */
	public void ordenar(int[] array){
		
		//Comprimento do array recebido
		int arraySize = array.length;
				
		//Variável que indica a posição do elemento a ser ordenado
		int start = 0;
		
		//Ponteiro para os valores anteriores ao valor atual que está sendo analisado
		int anterior = 0;
		
		//Valor do ponteiro atual para ser comparado com os anteriores
		int escolhido = 0;
		
		for(start = 1; start < arraySize; start++){
			
			escolhido = array[start];
			anterior = start - 1;
			
			while(anterior >= 0 && escolhido < array[anterior]){
				//Avançar o anterior em uma posição no array
				array[anterior+1] = array[anterior];
				anterior = anterior - 1;
			}
			
			array[anterior+1] = escolhido;
		}
		//exibirPassos(array);
	}
	
	/**
	 * MÃ©todo responsÃ¡vel por exibir o array a cada iteraÃ§Ã£o
	 * @param array
	 * @param iteracao
	 */
	private void exibirPassos(int[] array){
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("\n");
	}
}
