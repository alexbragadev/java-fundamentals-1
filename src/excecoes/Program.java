package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// caso o usuario não digite um número ou forneça um numero
		// maior que nosso array então tratamos esses casos
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição não existe");
		} catch (InputMismatchException e) {
			System.out.println("Caractere digitado não é permitido");
		} finally {			
			sc.close();
		}
		
		
	}
}
