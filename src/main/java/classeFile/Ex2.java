package classeFile;

import java.io.File;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		try {
			File file = new File("novo.txt");
			if (file.createNewFile()) {
				System.out.println("Nome do arquivo: " + file.getName());
				System.out.println("Path: " + file.getPath());
			}

			if (file.exists()) {
				System.out.println("Arquivo já existe.");
			}
		} catch (IOException e) {
			System.out.println("Erro ao criar o arquivo...");
		}
	}
}

//2. **Verificação da Existência de um Arquivo**  
//   Modifique o programa anterior para verificar se o 
//arquivo realmente existe. Exiba uma mensagem informando 
//se o arquivo foi encontrado ou não, utilizando o método `exists()`.
