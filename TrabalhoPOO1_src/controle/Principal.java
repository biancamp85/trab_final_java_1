package controle;

import modelo.ListaPacientes;
import modelo.Paciente;
import visao.TelaPrincipal;

public class Principal {

	public static void main(String[] args) {
		
		TelaPrincipal tp = new TelaPrincipal();
		tp.setVisible(true);
		
		Paciente p = new Paciente();
		
		ListaPacientes lp = new ListaPacientes();
		
		GerarPacienteControle gpcon = new GerarPacienteControle(tp, p, lp);
				
	}
}
