package executorOrdenacao;

import java.util.LinkedList;
import java.util.List;

import MetodoOrdenacao.BubbleSort;
import MetodoOrdenacao.HeapSort;
import MetodoOrdenacao.MetodoDeOrdenacao;

public class FilaDeExecucao  {
	
	 public static List<MetodoDeOrdenacao> itens = new LinkedList<MetodoDeOrdenacao>();

	 static{
		 itens.add(new BubbleSort());
		 itens.add(new HeapSort());
	 }
}
