package visao;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	
	private CardLayout card;
	private TelaDeFundo tDF;
	private TelaGerarAtendimento tGA;
	private TelaGerenciarPaciente tGP;
	private TelaGerarConsulta tGC;
	private TelaEncaminharInternacao tEI;
	private TelaFinalizarAtendimento tFA;
	private TelaAguardandoLeitoALA tALA;
	private TelaPacientesInternadosALA tPIA;
	private TelaLeitosVagosALA tLVA;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		
		setResizable(false);
		setTitle("Sistema de Atendimento Hospitalar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 40, 745, 545);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
//-------------	MENU PACIENTE -----------------------------------------------------------		
		JMenu menuPaciente = new JMenu("Menu Paciente");
		menuPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuPaciente);

//::::::::::::::::: ITEM GERENCIAR PACIENTE
		JMenuItem itemGerenciarPaciente = new JMenuItem("Gerenciar Paciente");
		
		itemGerenciarPaciente.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				card.show(contentPane, "painelTGP");
						
			}
			
		});
		
		itemGerenciarPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuPaciente.add(itemGerenciarPaciente);
		
//:::::::::::::::::::::::::::::::::::::::::
//---------------------------------------------------------------------------------------		
		
		
//-------------	MENU ATENDIMENTO EMERGENCIA ---------------------------------------------		
		JMenu menuAtendimentoEmergencia = new JMenu("Atendimentos de Emerg\u00EAncia");
		
		menuAtendimentoEmergencia.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuAtendimentoEmergencia);
		
//::::::::::::::::: ITEM GERAR ATENDIMENTO
		JMenuItem itemGerarAtendimento = new JMenuItem("Gerar atendimento de emerg\u00EAncia");
		
		itemGerarAtendimento.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				card.show(contentPane, "painelTGA");
				
			}
	
		});
		
		itemGerarAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuAtendimentoEmergencia.add(itemGerarAtendimento);

//::::::::::::::::::::::::::::::::::::::::
//---------------------------------------------------------------------------------------		

		
//-------------	MENU CONSULTA -----------------------------------------------------------		
		JMenu menuConsulta = new JMenu("Consulta");
		menuConsulta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuConsulta);
		
//::::::::::::::::: ITEM GERAR CONSULTA
		JMenuItem itemGerarConsulta = new JMenuItem("Gerar Consulta");
		
		itemGerarConsulta.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				card.show(contentPane, "painelTGC");
						
			}
			
		});
		
		itemGerarConsulta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuConsulta.add(itemGerarConsulta);

//::::::::::::::::: ITEM ENCAMINHAR INTERNAÇÃO
		JMenuItem itemEncaminharInternacao = new JMenuItem("Encaminhar Para Interna\u00E7\u00E3o");
		
		itemEncaminharInternacao.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				card.show(contentPane, "painelTEI");
						
			}
			
		});
		
		itemEncaminharInternacao.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuConsulta.add(itemEncaminharInternacao);

//::::::::::::::::: ITEM FINALIZAR ATENDIMENTO
		JMenuItem itemFinalizarAtendimento = new JMenuItem("Finalizar Atendimento");
		
		itemFinalizarAtendimento.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				card.show(contentPane, "painelTFA");
						
			}
			
		});
		
		itemFinalizarAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuConsulta.add(itemFinalizarAtendimento);

//::::::::::::::::::::::::::::::::::::::::::::
//---------------------------------------------------------------------------------------		


//--------------- MENU RELATORIOS -------------------------------------------------------		
		JMenu menuRelatorios = new JMenu("Relat\u00F3rios");
		menuRelatorios.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuRelatorios);

//::::::::::::::::: ITEM AGUARDANDO LEITO (ALA)
		JMenuItem itemAguardandoLeitoALA = new JMenuItem("Listar pacientes aguardando leito");
		
		itemAguardandoLeitoALA.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				card.show(contentPane, "painelTALA");
						
			}
			
		});
		
		itemAguardandoLeitoALA.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuRelatorios.add(itemAguardandoLeitoALA);
		
//::::::::::::::::: ITEM PACIENTES INTERNADOS (ALA)
		JMenuItem itemPacientesInternadosALA = new JMenuItem("Listar pacientes internados ");
		
		itemPacientesInternadosALA.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				card.show(contentPane, "painelTPIA");
						
			}
			
		});
		
		itemPacientesInternadosALA.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuRelatorios.add(itemPacientesInternadosALA);

//::::::::::::::::: ITEM LEITOS VAGOS (ALA)
		JMenuItem itemLeitosVagosALA = new JMenuItem("Listar leitos vagos");
		
		itemLeitosVagosALA.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				card.show(contentPane, "painelTLVA");
						
			}
			
		});
		
		
		itemLeitosVagosALA.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuRelatorios.add(itemLeitosVagosALA);
		
		JLabel lblEspaco = new JLabel("                          ");
		lblEspaco.setAlignmentX(Component.RIGHT_ALIGNMENT);
		menuBar.add(lblEspaco);
		
		JButton btnRetorna = new JButton("");
		btnRetorna.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnRetorna.setToolTipText("Retornar para a tela de in\u00EDcio");
		btnRetorna.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				card.show(contentPane, "painelTDF");
			}
		});
		btnRetorna.setForeground(new Color(0, 0, 0));
		btnRetorna.setBackground(new Color(0, 0, 0));
		btnRetorna.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/iconesImagens/retorno_ico.png")));
		menuBar.add(btnRetorna);
		
//:::::::::::::::::::::::::::::::::::::::::::::::::
//---------------------------------------------------------------------------------------		

		contentPane = new JPanel( );
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new MatteBorder(10, 4, 10, 4, (Color) new Color(102, 102, 102)));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);

		card = new CardLayout( 0, 0 );
		contentPane.setLayout(card);
		
		tDF = new TelaDeFundo();
		tGA = new TelaGerarAtendimento();
		tGP = new TelaGerenciarPaciente();
		tGC = new TelaGerarConsulta();
		tEI = new TelaEncaminharInternacao();
		tFA = new TelaFinalizarAtendimento();
		tALA = new TelaAguardandoLeitoALA();
		tPIA = new TelaPacientesInternadosALA();
		tLVA = new TelaLeitosVagosALA();
		
		contentPane.add(tDF, "painelTDF");
		contentPane.add(tGA, "painelTGA");
		contentPane.add(tGP, "painelTGP");
		contentPane.add(tGC, "painelTGC");
		contentPane.add(tEI, "painelTEI");
		contentPane.add(tFA, "painelTFA");
		contentPane.add(tALA, "painelTALA");
		contentPane.add(tPIA, "painelTPIA");
		contentPane.add(tLVA, "painelTLVA");

	}

}
