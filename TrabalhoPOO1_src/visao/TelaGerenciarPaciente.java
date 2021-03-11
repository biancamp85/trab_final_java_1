package visao;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.SwingConstants;

public class TelaGerenciarPaciente extends JPanel {
	private JTextField fieldNomDaMae;
	private JTextField fieldNomedoPai;
	private JTextField fieldNomePaciente;
	private JFormattedTextField formatedFieldDataNascimento;
	private JFormattedTextField formatedFieldCPF;
	private JComboBox<String> comboBox;
	private JTextArea textAreaInfoGerenciarPacientes;
	private JButton buttonCadastraPaciente;
	private JButton buttonLimparTela;

	/**
	 * Create the panel.
	 */
	public TelaGerenciarPaciente() {
		setBorder(new MatteBorder(0, 10, 0, 0, (Color) new Color(51, 204, 153)));
		setLayout(new MigLayout("", "[175.00,grow][130.00,grow][130.00,grow][130.00,grow][242.00,grow]",
				"[][10][][5][][5][][5][][grow][]"));

		JLabel labelCabecalho = new JLabel("Gerenciamento de Pacientes");
		labelCabecalho.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(labelCabecalho, "cell 0 0 5 1");

		JLabel labelCpfPaciente = new JLabel("CPF");
		add(labelCpfPaciente, "flowx,cell 0 2");

		JLabel labelNomePaciente = new JLabel("Nome");
		add(labelNomePaciente, "flowx,cell 1 2 4 1,alignx left,gapx 5");

		JLabel labelPacinteTipoSanguineo = new JLabel("Tipo Sangu\u00EDneo");
		add(labelPacinteTipoSanguineo, "flowx,cell 0 4 3 1");

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel<String>(
				new String[] { "<Selecionar>", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
		add(comboBox, "cell 0 4 3 1");

		JLabel labelNomeMae = new JLabel("Nome da M\u00E3e");
		add(labelNomeMae, "flowx,cell 0 6 5 1");

		JLabel labelNomePai = new JLabel("Nome do Pai");
		add(labelNomePai, "flowx,cell 0 8 5 1");

		fieldNomDaMae = new JTextField();
		add(fieldNomDaMae, "cell 0 6 5 1,growx");
		fieldNomDaMae.setColumns(10);

		fieldNomedoPai = new JTextField();
		add(fieldNomedoPai, "cell 0 8 5 1,growx,gapx 10");
		fieldNomedoPai.setColumns(10);

		textAreaInfoGerenciarPacientes = new JTextArea();
		add(textAreaInfoGerenciarPacientes, "cell 0 9 5 1,grow");

		buttonCadastraPaciente = new JButton("Cadastrar Paciente");
		buttonCadastraPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonCadastraPaciente
				.setIcon(new ImageIcon(TelaGerenciarPaciente.class.getResource("/iconesImagens/icons8-ok-200.png")));
		add(buttonCadastraPaciente, "flowx,cell 0 10 5 1,alignx center");
		buttonCadastraPaciente.setActionCommand("Cadastrar Paciente");

		buttonLimparTela = new JButton("Limpar");
		buttonLimparTela.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonLimparTela.setIcon(
				new ImageIcon(TelaGerenciarPaciente.class.getResource("/iconesImagens/icons8-cancelar-20.png")));
		add(buttonLimparTela, "cell 0 10 5 1");
		buttonLimparTela.setActionCommand("Limpar Tela");

		MaskFormatter mascaraData;
		MaskFormatter mascaraCPF;

		try {
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholder(" ");
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholder(" ");

			formatedFieldCPF = new JFormattedTextField(mascaraCPF);
			formatedFieldCPF.setHorizontalAlignment(SwingConstants.LEFT);
			formatedFieldCPF.setColumns(10);
			formatedFieldCPF.setAlignmentX(1.0f);
			add(formatedFieldCPF, "cell 0 2");

			formatedFieldDataNascimento = new JFormattedTextField(mascaraData);
			formatedFieldDataNascimento.setHorizontalAlignment(SwingConstants.LEFT);
			formatedFieldDataNascimento.setColumns(7);
			formatedFieldDataNascimento.setAlignmentX(Component.RIGHT_ALIGNMENT);
			add(formatedFieldDataNascimento, "cell 3 4,growx");

			fieldNomePaciente = new JTextField();
			add(fieldNomePaciente, "cell 1 2 4 1,growx,gapx 5");
			fieldNomePaciente.setColumns(10);

			JLabel labelDataNascimento = new JLabel("Data de Nascimento");
			add(labelDataNascimento, "cell 2 4,alignx left");

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void limparTelaGerenciarPaciente() {
		textAreaInfoGerenciarPacientes.setText("");
		fieldNomDaMae.setText("");
		fieldNomedoPai.setText("");
		fieldNomePaciente.setText("");
		formatedFieldDataNascimento.setText("");
		formatedFieldCPF.setText("");
		comboBox.setSelectedIndex(0);
		
	}

	public JTextField getFieldNomDaMae() {
		return fieldNomDaMae;
	}

	public void setFieldNomDaMae(JTextField fieldNomDaMae) {
		this.fieldNomDaMae = fieldNomDaMae;
	}

	public JTextField getFieldNomedoPai() {
		return fieldNomedoPai;
	}

	public void setFieldNomedoPai(JTextField fieldNomedoPai) {
		this.fieldNomedoPai = fieldNomedoPai;
	}

	public JTextField getFieldNomePaciente() {
		return fieldNomePaciente;
	}

	public void setFieldNomePaciente(JTextField fieldNomePaciente) {
		this.fieldNomePaciente = fieldNomePaciente;
	}

	public JFormattedTextField getFormatedFieldDataNascimento() {
		return formatedFieldDataNascimento;
	}

	public void setFormatedFieldDataNascimento(JFormattedTextField formatedFieldDataNascimento) {
		this.formatedFieldDataNascimento = formatedFieldDataNascimento;
	}

	public JFormattedTextField getFormatedFieldCPF() {
		return formatedFieldCPF;
	}

	public void setFormatedFieldCPF(JFormattedTextField formatedFieldCPF) {
		this.formatedFieldCPF = formatedFieldCPF;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public JTextArea getTextAreaInfoGerenciarPacientes() {
		return textAreaInfoGerenciarPacientes;
	}

	public void setTextAreaInfoGerenciarPacientes(JTextArea textAreaInfoGerenciarPacientes) {
		this.textAreaInfoGerenciarPacientes = textAreaInfoGerenciarPacientes;
	}

	public JButton getButtonCadastraPaciente() {
		return buttonCadastraPaciente;
	}

	public void setButtonCadastraPaciente(JButton buttonCadastraPaciente) {
		this.buttonCadastraPaciente = buttonCadastraPaciente;
	}

	public JButton getButtonLimparTela() {
		return buttonLimparTela;
	}

	public void setButtonLimparTela(JButton buttonLimparTela) {
		this.buttonLimparTela = buttonLimparTela;
	}
	
		public void limpartelagerar() {
			
				
			}

		
		
}
