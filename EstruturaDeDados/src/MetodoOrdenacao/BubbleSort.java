package MetodoOrdenacao;

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
	
	
	//teste do algorítimo
	public static void main(String[] args) {
		int[] n = new int[5];
		n[0] = 5;
		n[1] = 5;
		n[2] = 1;
		n[3] = 1;
		n[4] = 4;
		
		new BubbleSort().ordenar(n);
		
		for (int i : n) {
			System.out.println(i);
		}	
	}

}
