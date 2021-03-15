package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class TelaEncaminharInternacao extends JPanel {
	private JTextField textFieldMostrarLeitosDisp;
	private JTextField textFieldMostrarNumeroLeitosTotais;
	private JTextField textFieldCampoDeNotificacoes;

	/**
	 * Create the panel.
	 */
	public TelaEncaminharInternacao() {
		setBorder(new MatteBorder(0, 10, 0, 0, (Color) new Color(0, 139, 139)));
		setLayout(new MigLayout("", "[224.00,grow][196.00,grow]", "[][25][25][grow][25][grow]"));
		
		JLabel lblEncaminharParaInternao = new JLabel("Encaminhar para Interna\u00E7\u00E3o");
		lblEncaminharParaInternao.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(lblEncaminharParaInternao, "cell 0 0");
		
		JComboBox comboSelecionarAla = new JComboBox();
		comboSelecionarAla.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboSelecionarAla.setModel(new DefaultComboBoxModel(new String[] {"--Selecione a ala--"}));
		add(comboSelecionarAla, "cell 0 1,growx,aligny top");
		
		JLabel lblDisponibilidadeDeLeitos = new JLabel("Disponibilidade de Leitos:");
		lblDisponibilidadeDeLeitos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblDisponibilidadeDeLeitos, "cell 1 1");
		
		JLabel lblListaDeEspera = new JLabel("Lista de espera:");
		lblListaDeEspera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblListaDeEspera, "cell 0 2");
		
		JLabel lblNumeroLeitosDisp = new JLabel("N\u00FAmero de leitos dispon\u00EDveis");
		lblNumeroLeitosDisp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNumeroLeitosDisp, "cell 1 2,alignx center");
		
		JPanel panel = new JPanel();
		add(panel, "cell 0 3,grow");
		panel.setLayout(new BorderLayout(0, 0));
		
		JList listPacientesEmEspera = new JList();
		listPacientesEmEspera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listPacientesEmEspera.setModel(new AbstractListModel() {
			String[] values = new String[] {"--Vazio--", "--Vazio--", "--Vazio--", "--Vazio--", "--Vazio--"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(listPacientesEmEspera, BorderLayout.CENTER);
		
		textFieldMostrarLeitosDisp = new JTextField();
		textFieldMostrarLeitosDisp.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMostrarLeitosDisp.setEditable(false);
		textFieldMostrarLeitosDisp.setFont(new Font("Tahoma", Font.PLAIN, 35));
		add(textFieldMostrarLeitosDisp, "cell 1 3,alignx center,aligny baseline");
		textFieldMostrarLeitosDisp.setColumns(2);
		
		textFieldCampoDeNotificacoes = new JTextField();
		textFieldCampoDeNotificacoes.setEditable(false);
		add(textFieldCampoDeNotificacoes, "cell 0 4,growx");
		textFieldCampoDeNotificacoes.setColumns(10);
		
		JLabel lblNmeroDeLeitos = new JLabel("N\u00FAmero de total de leitos da ala");
		lblNmeroDeLeitos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNmeroDeLeitos, "cell 1 4,alignx center");
		
		JButton btnEncaminharPaciente = new JButton("Encaminhar");
		btnEncaminharPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEncaminharPaciente.setForeground(new Color(0, 0, 0));
		btnEncaminharPaciente.setBackground(new Color(240, 255, 255));
		btnEncaminharPaciente.setIcon(new ImageIcon(TelaEncaminharInternacao.class.getResource("/iconesImagens/setapradireita.png")));
		add(btnEncaminharPaciente, "cell 0 5,alignx center,aligny top");
		
		textFieldMostrarNumeroLeitosTotais = new JTextField();
		textFieldMostrarNumeroLeitosTotais.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMostrarNumeroLeitosTotais.setEditable(false);
		textFieldMostrarNumeroLeitosTotais.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textFieldMostrarNumeroLeitosTotais.setColumns(2);
		add(textFieldMostrarNumeroLeitosTotais, "cell 1 5,alignx center");

	}

}
