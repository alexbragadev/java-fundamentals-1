package hascodeEquals.application;

import hascodeEquals.entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Carolina", "carolina@gmail.com");
		Client c2 = new Client("Alesson", "alebraga@gmail.com");
		
		// comparando o nome com hascode e equals
		// porque o nome? pq houve sobrescrita desses metodos na classe Client
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		// compara as referencias de memoria que nesse caso são diferentes
		System.out.println(c1 == c2);
		
	}
	
}
