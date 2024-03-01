package curinga;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
	
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Alex", "Carol", "Alisson");
		printList(myStrs);

	}
	// podemos receber uma lista curinga para não precisarmos mudar o
	// tipo da lista que estamos recebendo. No caso abaixo usamos object
	// por ele conter tipos Integer mas ele tbm contém outros tipos
	public static void printList(List<?> list) {
		// obs: nas listas curingas não podemos adicionar valores como:
		// list.add(78) por exemplo
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
