package classeFile;

import java.io.File;

public class Ex5 {

	public static void main(String[] args) {
		File file = new File("meu_arquivo.txt");

		if (file.canRead()) {
			System.out.println("O arquivo pode ser lido.");
		} else {
			System.out.println("O arquivo não pode ser lido.");
		}

		if (file.canWrite()) {
			System.out.println("O arquivo pode ser escrito.");
		} else {
			System.out.println("O arquivo não pode ser escrito.");
		}
	}
}

//5. **Verificação de Permissões de Leitura e Escrita**  
//   Escreva um programa que verifique se um arquivo específico 
//pode ser lido e escrito, utilizando os métodos `canRead()` e `canWrite()`. 
//Exiba as permissões do arquivo no console.