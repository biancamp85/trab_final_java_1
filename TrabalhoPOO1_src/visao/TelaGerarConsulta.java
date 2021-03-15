package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

@SuppressWarnings({ "serial" })
public class TelaGerarConsulta extends JPanel {

	private JFormattedTextField formatedFieldCPFGerarConsulta;
	private JButton buttonCadastraPaciente;
	private JTextArea textAreaInfoGerarConsulta;
	private JButton buttonEncaminharIntenacao;
	private JButton buttonLimparTela;
	/**
	 * Create the panel.
	 */
	public TelaGerarConsulta() {
		setBorder(new MatteBorder(0, 10, 0, 0, (Color) new Color(0, 0, 128)));
		setLayout(new MigLayout("", "[15][402.00,grow][15]", "[][10][][5][119.00,grow][5][][]"));
		
		JLabel labelCabecalho = new JLabel("Gerar Consulta");
		labelCabecalho.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(labelCabecalho, "cell 0 0 3 1");
		
		buttonCadastraPaciente = new JButton("Finalizar Consulta");
		buttonCadastraPaciente.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonCadastraPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textAreaInfoGerarConsulta = new JTextArea();
		add(textAreaInfoGerarConsulta, "cell 1 4,grow");
		
		buttonEncaminharIntenacao = new JButton("Encaminhar para a Interna\u00E7\u00E3o");
		buttonEncaminharIntenacao.setIcon(new ImageIcon(TelaGerarConsulta.class.getResource("/iconesImagens/icons8-upward-arrow-20.png")));
		buttonEncaminharIntenacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(buttonEncaminharIntenacao, "cell 1 6,alignx center");
		buttonCadastraPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonCadastraPaciente.setIcon(new ImageIcon(TelaGerenciarPaciente.class.getResource("/iconesImagens/icons8-ok-200.png")));
		add(buttonCadastraPaciente, "flowx,cell 0 7 3 1,alignx center");
		
		buttonLimparTela = new JButton("Limpar Tela");
		buttonLimparTela.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonLimparTela.setIcon(new ImageIcon(TelaGerenciarPaciente.class.getResource("/iconesImagens/icons8-cancelar-20.png")));
		add(buttonLimparTela, "cell 0 7 3 1");
		
		MaskFormatter mascaraCPF;
		
		try 
		{
			mascaraCPF = new MaskFormatter( "###.###.###-##");
			mascaraCPF.setPlaceholder(" ");
			
			JLabel labelCPFconsulta = new JLabel("CPF ");
			labelCPFconsulta.setFont(new Font("Tahoma", Font.PLAIN, 11));
			add(labelCPFconsulta, "flowx,cell 1 2");
			formatedFieldCPFGerarConsulta = new JFormattedTextField( mascaraCPF );
			formatedFieldCPFGerarConsulta.setFont(new Font("Tahoma", Font.PLAIN, 12));
			formatedFieldCPFGerarConsulta.setHorizontalAlignment(SwingConstants.LEFT);
			formatedFieldCPFGerarConsulta.setColumns(10);
			formatedFieldCPFGerarConsulta.setAlignmentX(1.0f);
			add(formatedFieldCPFGerarConsulta, "cell 1 2");
			
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}

	}
	
	public void LimparTelaGerarAtendimento() {
		textAreaInfoGerarConsulta.setText("");
		formatedFieldCPFGerarConsulta.setText("");
	}

	public JFormattedTextField getFormatedFieldCPFGerarConsulta() {
		return formatedFieldCPFGerarConsulta;
	}

	public void setFormatedFieldCPFGerarConsulta(JFormattedTextField formatedFieldCPFGerarConsulta) {
		this.formatedFieldCPFGerarConsulta = formatedFieldCPFGerarConsulta;
	}

	public JButton getButtonCadastraPaciente() {
		return buttonCadastraPaciente;
	}

	public void setButtonCadastraPaciente(JButton buttonCadastraPaciente) {
		this.buttonCadastraPaciente = buttonCadastraPaciente;
	}

	public JTextArea getTextAreaInfoGerarConsulta() {
		return textAreaInfoGerarConsulta;
	}

	public void setTextAreaInfoGerarConsulta(JTextArea textAreaInfoGerarConsulta) {
		this.textAreaInfoGerarConsulta = textAreaInfoGerarConsulta;
	}

	public JButton getButtonEncaminharIntenacao() {
		return buttonEncaminharIntenacao;
	}

	public void setButtonEncaminharIntenacao(JButton buttonEncaminharIntenacao) {
		this.buttonEncaminharIntenacao = buttonEncaminharIntenacao;
	}

	public JButton getButtonLimparTela() {
		return buttonLimparTela;
	}

	public void setButtonLimparTela(JButton buttonLimparTela) {
		this.buttonLimparTela = buttonLimparTela;
	}
	
}
