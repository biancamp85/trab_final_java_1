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

@SuppressWarnings({ "serial" })
public class TelaGerarConsulta extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaGerarConsulta() {
		setBorder(new MatteBorder(0, 10, 0, 0, (Color) new Color(0, 0, 128)));
		setLayout(new MigLayout("", "[15][402.00,grow][15]", "[][10][][119.00,grow][5][]"));
		
		JLabel labelCabecalho = new JLabel("Gerar Consulta");
		labelCabecalho.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(labelCabecalho, "cell 0 0 3 1");
		
		JButton buttonCadastraPaciente = new JButton("Gerar Atendimento");
		buttonCadastraPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonCadastraPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonCadastraPaciente.setIcon(new ImageIcon(TelaGerenciarPaciente.class.getResource("/iconesImagens/icons8-ok-200.png")));
		add(buttonCadastraPaciente, "flowx,cell 0 5 3 1,alignx center");
		
		JButton buttonLimparTela = new JButton("Limpar Tela");
		buttonLimparTela.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonLimparTela.setIcon(new ImageIcon(TelaGerenciarPaciente.class.getResource("/iconesImagens/icons8-cancelar-20.png")));
		add(buttonLimparTela, "cell 0 5 3 1");
		
		MaskFormatter mascaraCPF;
		
		try 
		{
			mascaraCPF = new MaskFormatter( "###.###.###-##");
			mascaraCPF.setPlaceholder("_");
			
			Label labelCPFconsulta = new Label("CPF de consulta");
			labelCPFconsulta.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(labelCPFconsulta, "flowx,cell 1 2");
			JFormattedTextField formatedFieldCPF = new JFormattedTextField( mascaraCPF );
			formatedFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
			formatedFieldCPF.setHorizontalAlignment(SwingConstants.LEFT);
			formatedFieldCPF.setColumns(9);
			formatedFieldCPF.setAlignmentX(1.0f);
			add(formatedFieldCPF, "cell 1 2");
			
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}

	}
	
}
