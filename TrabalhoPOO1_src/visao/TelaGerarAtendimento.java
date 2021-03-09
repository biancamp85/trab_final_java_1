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
import java.awt.Label;

public class TelaGerarAtendimento extends JPanel {
	private JTextField textFieldAlaInternacao;
	private JTextField textFieldNomePaciente;
	private JComboBox<String> comboBoxPrioridadeAt;
	private JTextArea textAreaDescriProblema;
	private JTextArea textAreaObservacao;
	private JButton buttonGerarAtendimento;
	private JButton buttonLimpar;
	private JFormattedTextField formattedTextFieldDataAtendimento;
	private JFormattedTextField formattedTextFieldHoraAtendimento;
	private JFormattedTextField formattedTextFieldCPF;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings({})
	public TelaGerarAtendimento() {
		setBorder(new MatteBorder(0, 10, 0, 0, (Color) new Color(51, 204, 153)));
		setLayout(new MigLayout("", "[2.00px][142.00,grow][97.00,grow][73.00][206.00][]",
				"[1px][][5][][5][][5][][5][][60][][grow][]"));

		JLabel labelCabecalho = new JLabel("Gerar Atendimento de Emerg\u00EAncia");
		labelCabecalho.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(labelCabecalho, "cell 1 1 4 1");

		JLabel labelCPFAtendimento = new JLabel("CPF");
		add(labelCPFAtendimento, "flowx,cell 1 3");

		JLabel labelNomePaciente = new JLabel("Nome Paciente");
		add(labelNomePaciente, "cell 2 3,alignx trailing,gapx 10");

		JLabel labelDataAtendimento = new JLabel("Data do Atendimento");
		add(labelDataAtendimento, "flowx,cell 1 5,alignx left");

		JLabel labelHorarioAtendimento = new JLabel("Hor\u00E1rio Atendiemento");
		add(labelHorarioAtendimento, "flowx,cell 4 5,gapx 5");

		JLabel labelPrioridadeAt = new JLabel("Prioridade do Atendimento");
		add(labelPrioridadeAt, "flowx,cell 1 7 3 1");

		comboBoxPrioridadeAt = new JComboBox();
		comboBoxPrioridadeAt
				.setModel(new DefaultComboBoxModel<String>(new String[] { "<Selecionar>", "1", "2", "3", "4", "5" }));
		add(comboBoxPrioridadeAt, "cell 1 7 3 1");

		JLabel labelAlaInternacao = new JLabel("Ala de Interna\u00E7\u00E3o");
		add(labelAlaInternacao, "flowx,cell 4 7,gapx 5");

		textFieldAlaInternacao = new JTextField();
		add(textFieldAlaInternacao, "cell 4 7,growx,gapx 22");
		textFieldAlaInternacao.setColumns(10);

		JLabel labelDescriProblema = new JLabel("Descri\u00E7\u00E3o do Problema");
		add(labelDescriProblema, "cell 1 9 3 1");

		textFieldNomePaciente = new JTextField();
		add(textFieldNomePaciente, "cell 3 3 2 1,growx");
		textFieldNomePaciente.setColumns(10);

		textAreaDescriProblema = new JTextArea();
		add(textAreaDescriProblema, "cell 1 10 4 1,grow");

		JLabel labelObservações = new JLabel("Observa\u00E7\u00F5es ");
		add(labelObservações, "cell 1 11");

		textAreaObservacao = new JTextArea();
		add(textAreaObservacao, "cell 1 12 4 1,grow");

		buttonGerarAtendimento = new JButton("Gerar Atendimento");
		buttonGerarAtendimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonGerarAtendimento
				.setIcon(new ImageIcon(TelaGerarAtendimento.class.getResource("/iconesImagens/icons8-ok-200.png")));
		add(buttonGerarAtendimento, "flowx,cell 1 13 4 1,alignx center");

		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonLimpar.setIcon(
				new ImageIcon(TelaGerarAtendimento.class.getResource("/iconesImagens/icons8-cancelar-20.png")));
		add(buttonLimpar, "cell 1 13 4 1");

		MaskFormatter mascaraCPF;
		MaskFormatter mascaraData;
		MaskFormatter mascaraHora;

		try {

			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholder(" ");
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholder(" ");
			mascaraHora = new MaskFormatter("##:##");
			mascaraHora.setPlaceholder(" ");

			formattedTextFieldDataAtendimento = new JFormattedTextField(mascaraData);
			add(formattedTextFieldDataAtendimento, "cell 2 5,growx");

			formattedTextFieldHoraAtendimento = new JFormattedTextField(mascaraHora);
			add(formattedTextFieldHoraAtendimento, "cell 4 5,growx");

			formattedTextFieldCPF = new JFormattedTextField(mascaraCPF);
			add(formattedTextFieldCPF, "cell 1 3,growx");

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void limparTelaGerarAtendimento() {
		textAreaDescriProblema.setText("");
		textAreaObservacao.setText("");
		textFieldAlaInternacao.setText("");
		textFieldNomePaciente.setText("");
		formattedTextFieldCPF.setText("");
		formattedTextFieldDataAtendimento.setText("");
		formattedTextFieldHoraAtendimento.setText("");
		comboBoxPrioridadeAt.setSelectedIndex(0);
		
	}

	public JTextField getTextFieldAlaInternacao() {
		return textFieldAlaInternacao;
	}

	public void setTextFieldAlaInternacao(JTextField textFieldAlaInternacao) {
		this.textFieldAlaInternacao = textFieldAlaInternacao;
	}

	public JTextField getTextFieldNomePaciente() {
		return textFieldNomePaciente;
	}

	public void setTextFieldNomePaciente(JTextField textFieldNomePaciente) {
		this.textFieldNomePaciente = textFieldNomePaciente;
	}

	public JComboBox<String> getComboBoxPrioridadeAt() {
		return comboBoxPrioridadeAt;
	}

	public void setComboBoxPrioridadeAt(JComboBox<String> comboBoxPrioridadeAt) {
		this.comboBoxPrioridadeAt = comboBoxPrioridadeAt;
	}

	public JTextArea getTextAreaDescriProblema() {
		return textAreaDescriProblema;
	}

	public void setTextAreaDescriProblema(JTextArea textAreaDescriProblema) {
		this.textAreaDescriProblema = textAreaDescriProblema;
	}

	public JTextArea getTextAreaObservacao() {
		return textAreaObservacao;
	}

	public void setTextAreaObservacao(JTextArea textAreaObservacao) {
		this.textAreaObservacao = textAreaObservacao;
	}

	public JButton getButtonGerarAtendimento() {
		return buttonGerarAtendimento;
	}

	public void setButtonGerarAtendimento(JButton buttonGerarAtendimento) {
		this.buttonGerarAtendimento = buttonGerarAtendimento;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}

	public JFormattedTextField getFormattedTextFieldDataAtendimento() {
		return formattedTextFieldDataAtendimento;
	}

	public void setFormattedTextFieldDataAtendimento(JFormattedTextField formattedTextFieldDataAtendimento) {
		this.formattedTextFieldDataAtendimento = formattedTextFieldDataAtendimento;
	}

	public JFormattedTextField getFormattedTextFieldHoraAtendimento() {
		return formattedTextFieldHoraAtendimento;
	}

	public void setFormattedTextFieldHoraAtendimento(JFormattedTextField formattedTextFieldHoraAtendimento) {
		this.formattedTextFieldHoraAtendimento = formattedTextFieldHoraAtendimento;
	}

	public JFormattedTextField getFormattedTextFieldCPF() {
		return formattedTextFieldCPF;
	}

	public void setFormattedTextFieldCPF(JFormattedTextField formattedTextFieldCPF) {
		this.formattedTextFieldCPF = formattedTextFieldCPF;
	}
}
