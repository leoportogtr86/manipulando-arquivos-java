package com.porto.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivos {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("meu_arquivo.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
			}
			bufferedReader.close();

		} catch (IOException e) {
			System.out.println("Oocorreu um erro...");
			e.printStackTrace();
		}

	}

}
