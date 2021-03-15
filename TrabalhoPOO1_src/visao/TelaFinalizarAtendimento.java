package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class TelaFinalizarAtendimento extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaFinalizarAtendimento() {
		setBorder(new MatteBorder(0, 10, 0, 0, (Color) new Color(255, 127, 80)));
		setLayout(new MigLayout("", "[grow]", "[][:25:27,grow,center][85:n,grow][:25:27,grow,center][85:n,grow][]"));
		
		JLabel lblFinalizarAtendimento = new JLabel("Finalizar Atendimento");
		lblFinalizarAtendimento.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(lblFinalizarAtendimento, "cell 0 0");
		
		JLabel lblNewLabel = new JLabel("Lista de pacientes aguardando na enfermaria:");
		lblNewLabel.setBackground(new Color(255, 228, 196));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel, "cell 0 1,alignx left,aligny top");
		
		JList list = new JList();
		add(list, "cell 0 2,grow");
		
		JLabel lblListaDePacientes = new JLabel("Lista de pacientes internados:");
		lblListaDePacientes.setBackground(new Color(255, 228, 196));
		lblListaDePacientes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblListaDePacientes, "cell 0 3,alignx left,aligny top");
		
		JList list_1 = new JList();
		add(list_1, "flowy,cell 0 4,grow");
		
		JButton btnNewButton = new JButton("Finalizar");
		add(btnNewButton, "cell 0 5,alignx center");

	}

}
