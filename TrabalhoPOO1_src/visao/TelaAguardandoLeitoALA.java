package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSeparator;

public class TelaAguardandoLeitoALA extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaAguardandoLeitoALA() {
		setBorder(new MatteBorder(0, 5, 0, 5, (Color) new Color(112, 128, 144)));
		setLayout(new MigLayout("", "[grow]", "[][][][grow]"));
		
		JLabel lblListaDePacientes = new JLabel("Lista de pacientes aguardando leito");
		lblListaDePacientes.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(lblListaDePacientes, "cell 0 0,alignx center");
		
		JComboBox comboSelecionarAla = new JComboBox();
		comboSelecionarAla.setModel(new DefaultComboBoxModel(new String[] {"--Escolha a Ala de interesse--"}));
		comboSelecionarAla.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(comboSelecionarAla, "cell 0 1,growx");
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(105, 105, 105));
		separator.setBackground(new Color(105, 105, 105));
		add(separator, "cell 0 2,growx");
		
		JList listPacientesEmEspera = new JList();
		listPacientesEmEspera.setModel(new AbstractListModel() {
			String[] values = new String[] {"--Vazio--"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listPacientesEmEspera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(listPacientesEmEspera, "cell 0 3,grow");

	}

}
