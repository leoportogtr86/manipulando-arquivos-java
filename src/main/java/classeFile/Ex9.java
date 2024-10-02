package classeFile;

import java.io.File;

public class Ex9 {

	public static void main(String[] args) {
		File dirVazio = new File("vazio");
		dirVazio.delete();
	}
}

//9. **Exclusão de Arquivo ou Diretório**  
//   Escreva um programa que exclua um arquivo ou diretório vazio 
//utilizando o método `delete()`. Verifique se o arquivo foi excluído com sucesso.
