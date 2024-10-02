package classeFile;

import java.io.File;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("meu_dir/a1.txt");
		
		System.out.println(file.length());
	}
}

//
//7. **Tamanho do Arquivo**  
//   Escreva um programa que exiba o tamanho de um arquivo em bytes 
//utilizando o método `length()`.