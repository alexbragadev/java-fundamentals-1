package arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// lendo arquivo
		File file = new File("C:\\Users\\albraga\\eclipse-workspace\\Nelio-Alves-part-1\\arquivo.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		// criando arquivo
		String[] lines = new String[] {"São Paulo", "Quebec", "Porto"};
		
		String path = "C:\\Users\\albraga\\eclipse-workspace\\Nelio-Alves-part-1\\arquivo-2.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
