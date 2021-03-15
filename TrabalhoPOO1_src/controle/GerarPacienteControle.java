package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import dao.PacienteDAO;
import modelo.ListaPacientes;
import modelo.Paciente;
import visao.TelaPrincipal;

public class GerarPacienteControle implements ActionListener, KeyListener {

	private TelaPrincipal tp;
	private Paciente p;
	private PacienteDAO pdao;
	private ListaPacientes lp;

	public GerarPacienteControle(TelaPrincipal tp, Paciente p1, ListaPacientes lp) {
		super();
		this.tp = tp;
		this.p = p1;
		this.lp = lp;

		this.tp.gettGP().getButtonLimparTela().addActionListener(this);
		this.tp.gettGP().getButtonCadastraPaciente().addActionListener(this);
		this.tp.gettGP().getFormatedFieldCPF().addKeyListener(this);
		
		pdao = new PacienteDAO();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Limpar Tela")) {
			this.tp.gettGP().limparTelaGerenciarPaciente();

		} 
		
		if (e.getActionCommand().equals("Cadastrar Paciente")) {
			
			try {
				String maeAux = this.tp.gettGP().getFieldNomeDaMae().getText();
				String paiAux = this.tp.gettGP().getFieldNomedoPai().getText();
				String nomeAux = this.tp.gettGP().getFieldNomePaciente().getText();
				String enderecoAux = this.tp.gettGP().getfieldEndereco().getText();
				String dataAux = this.tp.gettGP().getFormatedFieldDataNascimento().getText();
				String cpfAux = this.tp.gettGP().getFormatedFieldCPF().getText();
				Object sangueAux = this.tp.gettGP().getComboBox().getSelectedItem();
				
				Paciente p= new Paciente(cpfAux, nomeAux, dataAux, enderecoAux, sangueAux, paiAux, maeAux);
				pdao.cadastraPaciente(p);
				this.lp.addInicio(p);
				System.out.println("Cadastro efetuado.");
				this.lp.print();
				this.tp.gettGP().limparTelaGerenciarPaciente();
					}
			 catch(NumberFormatException e2) {
				System.out.println("Formato inválido!");
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) { 
			
			String cpfAux = this.tp.gettGP().getFormatedFieldCPF().getText();
			p = new Paciente(cpfAux, null, null, null, null, null, null);
			pdao.consultaPaciente(p);
			
			this.tp.gettGP().getFieldNomeDaMae().setText(p.getNomemae());
			this.tp.gettGP().getFieldNomedoPai().setText(p.getNomepai());
			this.tp.gettGP().getFieldNomePaciente().setText(p.getNome());
			this.tp.gettGP().getfieldEndereco().setText(p.getEndereco());
			this.tp.gettGP().getFormatedFieldDataNascimento().setText(p.getDataNascimento());
			this.tp.gettGP().getFormatedFieldCPF().setText(p.getCpf());
			this.tp.gettGP().getComboBox().setSelectedItem(p.getTipoSangue());
		
	}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
