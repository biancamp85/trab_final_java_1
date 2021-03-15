package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;

import net.miginfocom.swing.MigLayout;

public class TelaPacientesInternadosALA extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaPacientesInternadosALA() {

			setBorder(new MatteBorder(0, 5, 0, 5, (Color) new Color(128, 0, 0)));
			setLayout(new MigLayout("", "[grow]", "[][][][grow]"));
			
			JLabel lblListaDePacientesInt = new JLabel("Lista de pacientes internados");
			lblListaDePacientesInt.setFont(new Font("Tahoma", Font.BOLD, 16));
			add(lblListaDePacientesInt, "cell 0 0,alignx center");
			
			JComboBox comboSelecionarAla = new JComboBox();
			comboSelecionarAla.setModel(new DefaultComboBoxModel(new String[] {"--Escolha a Ala de interesse--"}));
			comboSelecionarAla.setFont(new Font("Tahoma", Font.PLAIN, 14));
			add(comboSelecionarAla, "cell 0 1,growx");
			
			JSeparator separator = new JSeparator();
			separator.setForeground(SystemColor.controlDkShadow);
			separator.setBackground(SystemColor.controlDkShadow);
			add(separator, "cell 0 2,growx");
			
			JList listPacientesInternados = new JList();
			listPacientesInternados.setModel(new AbstractListModel() {
				String[] values = new String[] {"--Vazio--"};
				public int getSize() {
					return values.length;
				}
				public Object getElementAt(int index) {
					return values[index];
				}
			});
			listPacientesInternados.setFont(new Font("Tahoma", Font.PLAIN, 14));
			add(listPacientesInternados, "cell 0 3,grow");

	}

}
