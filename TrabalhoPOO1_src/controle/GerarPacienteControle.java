package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.TelaPrincipal;

public class GerarPacienteControle implements ActionListener{

	private TelaPrincipal tp;
	
	
	public GerarPacienteControle(TelaPrincipal tp) {
		super();
		this.tp = tp;
		
		this.tp.gettGP().getButtonLimparTela().addActionListener(this);
		this.tp.gettGP().getButtonCadastraPaciente().addActionListener(this);
	}


	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Cadastrar Paciente")) {
		
		}
		else if (e.getActionCommand().equals("Limpar Tela")){
				this.tp.gettGP().limparTelaGerenciarPaciente();
		}
	}
	
	
	




}



