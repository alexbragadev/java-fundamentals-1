package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Funcionarios {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");

	    String userName = myObj.nextLine();
	    
		
		Funcionario func1 = new Funcionario("Ana", 4100);
		Funcionario func2 = new Funcionario("Alesson", 1050);
		Funcionario func3 = new Funcionario("Delma", 1300);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(func1);
		funcionarios.add(func2);
		funcionarios.add(func3);
		int posicaoArray = -1;
		for (int x = 0; x < funcionarios.size(); x++) {
			System.out.println(x);
			posicaoArray = funcionarios.get(x).getNome().indexOf(userName);	
		}
		
		System.out.println(posicaoArray);
		if (posicaoArray >= 0) {
			
			Funcionario funcSelecionado = new Funcionario();
			
			funcSelecionado = funcionarios.get(posicaoArray);
			
			funcSelecionado.setSalario((funcSelecionado.getSalario() * 0.10) + funcSelecionado.getSalario());
		
			System.out.println("O funcionário: " + funcSelecionado.getNome() + " agora tem o salário de " + funcSelecionado.getSalario());
		} else {
			System.out.println("Usuário inexistente");
		}
		

	}

}
