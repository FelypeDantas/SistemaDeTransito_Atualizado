package Conta_Corrente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Metodos {
	
	Estatistica[] estatistica = new Estatistica[10];

	public Estatistica[] FCadastraEstatistica(Estatistica[] estatistica) throws IOException{
		int i;
		String filename = "ArquivoEstatistica.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		Random gerador = new Random();
		for(i=0; i<10; i++) {
			estatistica[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da cidade: "));
			writer.write(estatistica[i].CodigoCidade);
			writer.newLine();
			estatistica[i].NomeCidade = JOptionPane.showInputDialog("Informe o Nome da Cidade: ");
			writer.write(estatistica[i].NomeCidade);
			writer.newLine();
			estatistica[i].QtdAcidentes = gerador.nextInt(1000);
			writer.write(estatistica[i].QtdAcidentes);
			writer.newLine();
		}
		writer.close();
		return estatistica;
	}

	public void PQtdAcidentes(Estatistica[] estatistica) {
		int i;
		for(i=0; i<10; i++) {
			if(estatistica[i].QtdAcidentes > 100 & estatistica[i].QtdAcidentes < 500) {
				System.out.println("A quantidade de acidentes da cidade: " +estatistica[i].NomeCidade + "é de: " + estatistica[i].QtdAcidentes);
			}
		}
		System.out.println("_________________________________________________________________________");
	}

	public void PMaiorMenor(Estatistica[] estatistica) {
		int i, maior=0, menor = 1000;
		for(i=0; i<10; i++) {
			if(estatistica[i].QtdAcidentes > maior) {
				maior = estatistica[i].QtdAcidentes;
			}
			if(estatistica[i].QtdAcidentes < menor) {
				menor = estatistica[i].QtdAcidentes;
			}
		}
		System.out.println("O menor número de acidentes é  " + menor);
		System.out.println("O maior número de acidentes é  " + maior);
		System.out.println("_____________________________________________________________________________");
	}

	public void PAcima(Estatistica[] estatistica) {
		int media = 0, i;
		
		for(i=0; i<10; i++) {
			media = media + estatistica[i].QtdAcidentes;
		}
		media = media/10;
		for(i=0; i<10; i++) {
			if(media < estatistica[i].QtdAcidentes) {
				System.out.println("A cidade: " +estatistica[i].NomeCidade+ "está acima da média de acidentes com: " +estatistica[i].QtdAcidentes);
			}
		}
	}

	public void Leitura(Estatistica[] estatistica) throws IOException {
		int i;
		String filename = "ArquivoEstatistica.txt";
		BufferedReader ler = new BufferedReader(new FileReader(filename));
		for(i=0; i<10; i++) {
			estatistica[i].CodigoCidade = Integer.parseInt(ler.readLine());
			estatistica[i].NomeCidade = ler.readLine();
			estatistica[i].QtdAcidentes = Integer.parseInt(ler.readLine());
		}
		ler.close();
	}

}
