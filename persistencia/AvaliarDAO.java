package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class AvaliarDAO implements DAO<Avaliar>{

	public void save(Avaliar obj) {
		try {

			// diretório

			File dir = new File("avaliacoes");

			if (!dir.exists()) dir.mkdir();

			// arquivo individual

			File arq = new File("avaliacoes/" + obj.getNumero() + ".csv");

			if (arq.exists()) return;

			// gravar os dados

			FileWriter writer = new FileWriter(arq);

			writer.write(obj.getNumero() + ";");

			writer.write(obj.getNome() + ";");

			writer.write(obj.getNota() + ";");

			// fechar o arquivo

			writer.flush();

			writer.close();


			} catch (Exception e) {

			e.printStackTrace();

			}
		
	}

	public void delete(Avaliar obj) {
		try {
			
			File arq = new File("avaliacoes/" + obj.getNumero() + ".csv");
			
			// se o arquivo não existe não continua
			if ( ! arq.exists()) return; // pára a execução do método

			// exclui o arquivo

			arq.delete();
			
			} catch (Exception e) {

			e.printStackTrace();

			}

	}

	public Avaliar load(int chave) {
		try {

			File arq = new File("avaliacoes/" + chave + ".csv");


			if ( ! arq.exists()) return null;


			Scanner scan = new Scanner(arq);

			String linha = scan.nextLine();

			String[] colunas = linha.split(";");


			Avaliar f = new Avaliar();

			f.setNumero(chave);

			f.setNome(colunas[1]);

			f.setNota(Integer.parseInt(colunas[2]));

			return f;


			} catch (Exception e) {

			e.printStackTrace();

			}


			return null;

	}

	public void update(Avaliar obj) {
		// substituir o arquivo antigo por um novo

		// excluir o arquivo antigo

		// e persistir novo
	}

	public ArrayList<Avaliar> findAll() {
		ArrayList<Avaliar> lista = new ArrayList<Avaliar>();
		try {
			File dir = new File("avaliacoes");		
			File[] arqs = dir.listFiles();
			for (File arq : arqs) { // for each
					if(arq.toString().endsWith(".csv")){
	
					Scanner scan = new Scanner(arq);
					String linha = scan.nextLine();
					String[] colunas = linha.split(";");
					
					Avaliar f = new Avaliar();
					f.setNumero(Integer.parseInt(colunas[0]));
					f.setNome(colunas[1]);
					f.setNota(Integer.parseInt(colunas[2]));
					lista.add(f);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	

}
