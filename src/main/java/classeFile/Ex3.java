package classeFile;

import java.io.File;

public class Ex3 {

	public static void main(String[] args) {
		File dir = new File("meu_dir");
		if (dir.mkdir()) {
			System.out.println("Diretório criado com sucesso!");
		} else {
			System.out.println("Diretório já existe.");
		}
	}
}

//3. **Criação de um Diretório**  
//   Crie um programa que use o método `mkdir()` para criar um 
//novo diretório chamado "meudiretorio". Verifique se o diretório 
//foi criado com sucesso e exiba uma mensagem apropriada.