package metodoOrdenacao;
/**
 * @author Joao Victor
 *
 */
public class Quicksort implements MetodoDeOrdenacao{

	/**
	 * M�todo publico para chamada externa do quicksort
	 * @param array
	 */
	public void ordenar(int[] array){
		int inicio = 0;
		int fim = array.length - 1;
		
		quicksort(array, inicio, fim);
		
		//exibirPassos(array);
	}
	
	/**
	 * M�todo com chamada recursiva para realizar o sort.
	 * @param array
	 * @param inicio
	 * @param fim
	 */
	private void quicksort(int[] array, int inicio, int fim){
		//Condi��o de parada
		if(inicio >= fim)
			return;
		
		//Particiona o vetor e define o ponteiro para o pivo
		int ponteiroPivo = particionar(inicio,fim, array);
		
		//O pivo j� est� na posi��o correta, então n�o precisa ordenar
		
		//Aplicar recursivamente o algoritmo para o lado esquerdo do vetor
		quicksort(array, inicio, ponteiroPivo-1);
		//Aplicar recursivamente o algoritmo para o lado direito do vetor
		quicksort(array,ponteiroPivo+1,fim);
		
	}
	
	/**
	 * M�todo respons�vel por particionar o array e definir a posi��o do vetor em rela��o a cada um dos
	 * dois lados da parti��o
	 * @param inicio
	 * @param fim
	 * @param array
	 * @return
	 */
	private int particionar(int inicio, int fim, int[] array){
		//Define inicialmente o pivo como o primeiro elemento
		int pivo = array[inicio];
		
		//Ponteiro para indicar os elementos que ser�o maiores que o pivo
		int menores = inicio + 1;
		
		//Ponteiro para os elementos que ser�o maiores que o pivo
		int maiores = fim;
		
		while(menores<=maiores){
			//
			if(array[menores] <= pivo)
				menores++;
			else if(array[maiores] > pivo)
				maiores--;
			//Caso exista um elemento maior que o pivo do lado dos menores e outro menor que o pivo do lado dos maiores, trocar
			else{
				int auxMenor = array[menores];
				array[menores] = array[maiores];
				array[maiores] = auxMenor;
				menores++;
				maiores--;
			}
		}
		array[inicio] = array[maiores];
		array[maiores] = pivo;
		
		//Retorna a atual posi��o do pivo
		return maiores;
	}
	
	/**
	 * M�todo respons�vel por exibir os valores do array
	 * @param array
	 */
	private void exibirPassos(int[] array){
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("\n");
	}
}
