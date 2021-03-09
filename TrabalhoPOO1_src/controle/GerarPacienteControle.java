package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.KeyStroke;

import visao.TelaGerenciarPaciente;

public class GerarPacienteControle implements ActionListener {

	private TelaGerenciarPaciente tgp;
	
	
	public GerarPacienteControle(TelaGerenciarPaciente tgp) {
		super();
		this.tgp = tgp;
		
	    this.tgp.getButtonCadastraPaciente().addActionListener(this);
		this.tgp.getButtonLimparTela().addActionListener(this);
	}


@Override

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand().equals("Cadastrar Paciente")) {
	}
		else if (e.getActionCommand().equals("Limpar Tela")){
			this.tgp.limparTelaGerenciarPaciente();
		}
						
			
		//KeyStroke stroke = KeyStroke.getKeyStroke( KeyEvent.VK_ENTER, 0 );

    }

}



