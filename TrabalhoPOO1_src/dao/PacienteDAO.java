package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Paciente;

public class PacienteDAO {
	
	private File arqpaciente;
	private FileWriter fw;
	private BufferedWriter bw;

	public PacienteDAO() {
		arqpaciente = new File("paciente.txt");
	}

	public boolean cadastraPaciente(Paciente p1) {

		try {
			fw = new FileWriter(arqpaciente, true);
			bw = new BufferedWriter(fw);

			bw.write(p1.toString());
			bw.newLine();
			bw.flush();

			fw.close();
			bw.close();

			return true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

	public boolean consultaPaciente(Paciente p1) {

		try {
			FileReader fr = new FileReader(arqpaciente);
			BufferedReader br = new BufferedReader(fr);

			String linha = null;
			String[] campos = new String[7];

			while ((linha = br.readLine()) != null) {

				campos = linha.split("#");

				if (campos[0].equals(p1.getCpf())) {

					p1.setNome(campos[1]);
					p1.setDataNascimento(campos[2]);
					p1.setEndereco(campos[3]);
					p1.setTipoSangue(campos[4]);
					p1.setNomepai(campos[5]);
					p1.setNomemae(campos[6]);
				}
				return true;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

}
