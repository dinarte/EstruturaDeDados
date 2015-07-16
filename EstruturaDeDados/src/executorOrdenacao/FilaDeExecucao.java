
package executorOrdenacao;

import java.util.LinkedList;
import java.util.List;

import metodoOrdenacao.BubbleSort;
import metodoOrdenacao.HeapSort;
import metodoOrdenacao.InsertionSort;
import metodoOrdenacao.MergeSort;
import metodoOrdenacao.MetodoDeOrdenacao;
import metodoOrdenacao.Quicksort;
import metodoOrdenacao.SelectionSort;

public class FilaDeExecucao  {
	
	 public static List<MetodoDeOrdenacao> itens = new LinkedList<MetodoDeOrdenacao>();

	 static{
		 itens.add(new BubbleSort());
		 itens.add(new HeapSort());
		 itens.add(new SelectionSort());
		 itens.add(new InsertionSort());
		 itens.add(new Quicksort());
		 itens.add(new MergeSort());
	 }
}
