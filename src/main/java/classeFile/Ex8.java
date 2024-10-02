package classeFile;

import java.io.File;

public class Ex8 {

	public static void main(String[] args) {
		File file = new File("meu_dir/a1.txt");
		File novo = new File("meu_dir/renomeado.txt");
		
		file.renameTo(novo);
	}
}


//8. **Renomeação de Arquivo**  
//   Crie um programa que renomeie um arquivo existente utilizando 
//o método `renameTo()`. Exiba uma mensagem informando se a operação
//foi bem-sucedida.
