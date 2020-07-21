package codigos;

import java.io.FileWriter;
import java.util.ArrayList;

public class ManipularCSV {	
	
	public ManipularCSV() {
		
	}

	public static <E> void leCSV(String nomeArquivo, ArrayList <E> lista) {
		try {
			
			
		} catch (Exception e) {
			System.out.println("ERRO LEITURA");
			e.printStackTrace();
		}
		
	}
	
	public static <E> void escreveCSV(String path, ArrayList <E> lista) {
		FileWriter fileWriter = null;
		try {			
			 fileWriter = new FileWriter(path);
			 fileWriter.append("ID,nome, sobrenome,CPF,dataDeNascimento,telefone,Endereco,Lote,posX,posY\n");
			 
			 // escrendo
			 
			 
		} catch (Exception e) {
			System.out.println("ERRO ESCRITA!!");
			 e.printStackTrace();
		}finally {
			try { 
				fileWriter.flush();
				fileWriter.close();
				System.out.println("Arquivo atualizado!!!");
			} catch (Exception e) {
				    e.printStackTrace();
			}
		
		}
	}
		
}
