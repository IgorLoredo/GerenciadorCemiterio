package codigos;

import java.io.IOException;
import java.util.ArrayList;

public class TesteMain {

	public static <E> void main(String[] args) throws IOException {
			ArrayList <Atividade> lista = new ArrayList<>();		
//			for(int i = 0; i < 2; i++) {
//				Atividade ativ = new Atividade();
//				ativ.preenherAtividade();
//				lista.add(ativ);
//			}
		
			System.out.println("igor");
//			ManipularCSV.leCSV(nomeArquivo, lista);
			ManipularCSV.LeituraAtividade("Atividade.csv", lista);
//			ManipularCSV.EscreverAtividade("Atividade.csv", lista);
			System.out.println(lista.size());
			for(int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i).getTitulo());
			}
			
	}

}
