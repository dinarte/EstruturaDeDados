
package executorOrdenacao;

import java.util.LinkedList;
import java.util.List;

import MetodoOrdenacao.BubbleSort;
import MetodoOrdenacao.HeapSort;
import MetodoOrdenacao.InsertionSort;
import MetodoOrdenacao.MergeSort;
import MetodoOrdenacao.MetodoDeOrdenacao;
import MetodoOrdenacao.Quicksort;
import MetodoOrdenacao.SelectionSort;

public class FilaDeExecucao  {
	
	 public static List<MetodoDeOrdenacao> itens = new LinkedList<MetodoDeOrdenacao>();

	 static{
		 //itens.add(new BubbleSort());
		 //itens.add(new HeapSort());
		 //itens.add(new SelectionSort());
		 //itens.add(new InsertionSort());
		 //itens.add(new Quicksort());
		 itens.add(new MergeSort());
	 }
}
