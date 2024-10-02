package classeFile;

import java.io.File;

public class Ex4 {

	public static void main(String[] args) {
		File dir = new File("meu_dir");
		String[] arquivos = dir.list();
		
		for (String arquivo : arquivos) {
			System.out.println(arquivo);
		}
	}
}


//4. **Listagem de Arquivos em um Diretório**  
//   Crie um programa que liste todos os arquivos contidos 
//em um diretório. Utilize o método `list()` e exiba os nomes dos arquivos na saída.
