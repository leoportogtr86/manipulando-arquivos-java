package classeFile;

import java.io.File;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um nome de arquivo/diretório: ");
		String nome = sc.next();
		File fileDir = new File(nome);
		sc.close();

		if (fileDir.isFile()) {
			System.out.println("Você digitou o nome de um arquivo.");
		}

		if (fileDir.isDirectory()) {
			System.out.println("Você digitou o nome de um diretório.");
		}
	}
}

//6. **Identificação de Arquivo ou Diretório**  
//   Crie um programa que receba o nome de um arquivo ou diretório 
//e determine se é um arquivo ou diretório utilizando os métodos `isFile()` 
//e `isDirectory()`.
