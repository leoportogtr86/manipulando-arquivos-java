package com.porto.arquivos;

import java.io.FileWriter;

public class EscrevendoArquivos {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("meu_arquivo.txt");
			fileWriter.write("escrevendo mais uma linha ...");
			fileWriter.close();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao escrever no arquivo...");
			e.printStackTrace();
		}
	}
}
