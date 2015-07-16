package MetodoOrdenacao;

/**
 * Classe que implemanta o metodo de ordenacao MergeSort
 * @author dinarte
 *
 */
public class MergeSort implements MetodoDeOrdenacao {

	@Override
	public void ordenar(int[] entrada) {
		executarMergeSort(entrada, 0, entrada.length-1);
		
	}

	/**
	 * Executa o mergeSort, este método é chamado recursivamente.
	 * @param entrada
	 * @param menorIndice
	 * @param maiorIndice
	 */
	public void executarMergeSort(int[] entrada, int menorIndice, int maiorIndice) {
		
		//para a execução quando não for mais possível dividir o array
		if (maiorIndice <= menorIndice)
			return;
		
		//encontra o indice do centro
		int indiceCentral = (menorIndice + maiorIndice) / 2;
		
		//executa o mergesort para a metade da esquerda.
		executarMergeSort(entrada, menorIndice, indiceCentral);
		
		//executa o mergesort para a metade da direita.
		executarMergeSort(entrada, indiceCentral + 1, maiorIndice);
		
		//combinar as partes
		merge(entrada, menorIndice, maiorIndice, indiceCentral);
	}

	/**
	 * combina as partes da array.
	 */
	private void merge(int[] entrada, int menorIndice, int maiorIndice, int indiceCentral) {
		int[] parteEsquerda = new int[indiceCentral - menorIndice + 1];
		int[] parteDireita = new int[maiorIndice - indiceCentral];
		
		//separa a parte esquerda da array
		for (int i = 0; i <= indiceCentral - menorIndice; i++) {
			parteEsquerda[i] = entrada[menorIndice + i];
		}
		
		//separa a parte direita da array
		for (int i = 0; i <= maiorIndice - indiceCentral - 1; i++) {
			parteDireita[i] = entrada[indiceCentral + 1 + i];
		}
		
		
		int i = 0;
		int j = 0;
		for (int k = menorIndice; k <= maiorIndice; k++) {
			if (i < parteEsquerda.length && j < parteDireita.length) {
				if (parteEsquerda[i] < parteDireita[j]) {
					entrada[k] = parteEsquerda[i++];
				} else {
					entrada[k] = parteDireita[j++];
				}
			} else if (i < parteEsquerda.length) {
				entrada[k] = parteEsquerda[i++];
			} else if (j < parteDireita.length) {
				entrada[k] = parteDireita[j++];
			}
		}
	}
}
