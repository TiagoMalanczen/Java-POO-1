package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		File path = new File("C:\\Users\\malan\\Desktop\\ArquivosTestes\\ponto.txt");

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				try {
					String[] filds = line.split(";");
					String nome = filds[0];
					Date entrada = sdf.parse(filds[1]);
					Date saida = sdf.parse(filds[2]);

					RegistroPronto rg = new RegistroPronto(nome, entrada, saida);
					
					System.out.println(nome + ": " + rg.horasTrabalhadas() + " horas trabalhadas.");				} 
				
				
				catch (DomainException e) {
					System.out.println("Error: " + e.getMessage());
				} 
				catch (ParseException e) {
					System.out.println("Error: " + e.getMessage());
				}
				
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
