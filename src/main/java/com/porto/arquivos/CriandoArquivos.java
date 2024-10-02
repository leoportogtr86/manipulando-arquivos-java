package com.porto.arquivos;

import java.io.File;
import java.io.IOException;

public class CriandoArquivos {

	public static void main(String[] args) {
		try {
			File file = new File("meu_arquivo.txt");
			if (file.createNewFile()) {
				System.out.println("Arquivo criado com sucesso!");
				System.out.println(file.getName());
			} else {
				System.out.println("Arquivo já existe...");
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um erro...");
			e.printStackTrace();
		}

	}

}
