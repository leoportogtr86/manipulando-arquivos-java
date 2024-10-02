package classeFile;

import java.io.File;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		try {
			File file = new File("novo.txt");
			if (file.createNewFile()) {
				System.out.println("Nome do arquivo: " + file.getName());
				System.out.println("Path: " + file.getPath());
			} else {
				System.out.println("Arquivo já existe...");
			}
		} catch (IOException e) {
			System.out.println("Erro ao criar o arquivo...");
		}
	}
}

//1. **Criação de um Objeto `File`**  
//   Crie um programa que instancie um objeto `File` para um 
//arquivo inexistente e exiba seu nome e caminho completo utilizando 
//os métodos `getName()` e `getPath()`.
