package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import entities.Produto;
import exceptions.EstoqueInvalidoException;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\\\Users\\\\malan\\\\Desktop\\\\ArquivosTestes\\\\produtos.txt");
		String targePath = "C:\\\\Users\\\\malan\\\\Desktop\\\\ArquivosTestes\\\\relatorio.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter(new FileWriter(targePath)))
			{
			String line = br.readLine();

			while (line != null) {

				try {
					if (!line.trim().isEmpty()) {

						String[] fields = line.split(";");
						Integer codigo = Integer.valueOf(fields[0].trim());
						String nome = fields[1].trim();
						String categoria = fields[2].trim();
						Integer quantidade = Integer.valueOf(fields[3].trim());
						Double precoUnitario = Double.valueOf(fields[4].trim());

						Produto product = new Produto(codigo, nome, categoria, quantidade, precoUnitario);
						System.out.println(product.toCsvLine());
						
						bw.write(product.toCsvLine());
						bw.newLine();
					}
				} 
				catch (EstoqueInvalidoException e) {
					System.out.println("Error: " + e.getMessage());
				}
				line = br.readLine();

			}
		}

		catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		} 
		finally {

		}
	}
}
