package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// caso o usuario n�o digite um n�mero ou forne�a um numero
		// maior que nosso array ent�o tratamos esses casos
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o n�o existe");
		} catch (InputMismatchException e) {
			System.out.println("Caractere digitado n�o � permitido");
		} finally {			
			sc.close();
		}
		
		
	}
}
