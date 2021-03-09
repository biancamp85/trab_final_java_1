package visao;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaDeFundo extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaDeFundo() {
		setLayout(new CardLayout(0, 0));
		
		JLabel planoDeFundo = new JLabel("");
		planoDeFundo.setIcon(new ImageIcon(TelaDeFundo.class.getResource("/iconesImagens/Fundo.jpg")));
		add(planoDeFundo, "name_55042083975000");

	}

}
