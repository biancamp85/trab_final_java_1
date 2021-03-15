package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaLeitosVagosALA extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public TelaLeitosVagosALA() {
		setBorder(new MatteBorder(0, 5, 0, 5, (Color) new Color(128, 0, 128)));
		setLayout(new MigLayout("", "[131px][4px][51px][81px][159px]", "[20px][1px][52px][51px][51px][51px]"));
		
		JLabel lblListaDeLeitosLivres = new JLabel("N\u00FAmero de leitos livres por ala");
		lblListaDeLeitosLivres.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeLeitosLivres.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(lblListaDeLeitosLivres, "cell 0 0 5 1,growx,aligny top");
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.controlDkShadow);
		separator.setBackground(SystemColor.controlDkShadow);
		add(separator, "cell 0 1 5 1,grow");
		
		JLabel lblNewLabel = new JLabel("Ala de Cardiologia");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNewLabel, "cell 0 2,grow");
		
		JLabel lblAlaDePediatria = new JLabel("Ala de Pediatria ");
		lblAlaDePediatria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblAlaDePediatria, "cell 0 3,grow");
		
		JLabel lblAlaDePneumologia = new JLabel("Ala de Pneumologia ");
		lblAlaDePneumologia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblAlaDePneumologia, "cell 0 4,grow");
		
		JLabel lblAlaDeNeurologia = new JLabel("Ala de Neurologia ");
		lblAlaDeNeurologia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblAlaDeNeurologia, "cell 0 5,grow");
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(textField, "cell 2 2,grow");
		textField.setColumns(3);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setEditable(false);
		textField_1.setColumns(3);
		add(textField_1, "cell 2 3,grow");
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setEditable(false);
		textField_2.setColumns(3);
		add(textField_2, "cell 2 4,grow");
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setEditable(false);
		textField_3.setColumns(3);
		add(textField_3, "cell 2 5,grow");
		
		JLabel lblNewLabel_1 = new JLabel("Capacidade M\u00E1xima: 6\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1, "cell 4 3,grow");
		
		JLabel lblNewLabel_1_1 = new JLabel("Capacidade M\u00E1xima: 3");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_1, "cell 4 2,grow");
		
		JLabel lblNewLabel_1_2 = new JLabel("Capacidade M\u00E1xima: 4");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_2, "cell 4 4,grow");
		
		JLabel lblNewLabel_1_3 = new JLabel("Capacidade M\u00E1xima: 6");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_3, "cell 4 5,grow");

	}
}

