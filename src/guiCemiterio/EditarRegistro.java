package guiCemiterio;

import codigos.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class EditarRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JButton btnCarregar;
	private JButton btnSalvarESair;
	private JLabel lblDocumento;
	private JTextField txtDocumento;
	private JLabel lblDataDeNascimento;
	private JTextField txtDataNasc;
	private JLabel lblDataDeFalecimento;
	private JTextField txtDataFalec;
	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblSobrenome;
	private JTextField txtSobrenome;
	private JButton btnVoltar;
	private JLabel lblDescricao;
	private JLabel lblCaminhoFoto;
	private JButton btnProcurar;
	private JLabel lblFotoInvalida;
	private JTextArea txtDescricao;
	private boolean registroValido = false;
	private JLabel lblRegistroNaoEncontrado;
	Finado fin;

	private void eventsHandler() {
		btnCarregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Busca registro, se encontrar carrega informacao, se nao aparece mensagem
				
				fin = null; //buscarID(txtId.getText());
				if(fin != null) {
					registroValido = true;
					txtNome.setText(fin.getNome());
					txtSobrenome.setText(fin.getSobrenome());
					txtDataNasc.setText(fin.getDataDeNascimento());
					txtDataFalec.setText(fin.getDataSepultamento());
					txtDocumento.setText(fin.getCPF());
					//txtDescricao.setText(fin.getDescricao());
				} else {
					registroValido = false;
					lblRegistroNaoEncontrado.setText("Nenhum registro encontrado");
				}
				
			}
		});
		
		btnSalvarESair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO lembrar de salvar as mudancas
				if(registroValido) {
					// TODO fazer alteracao no registro
					String msgErro="";
					if(!VerificacaoDeInputs.verificaNome(txtNome.getText()))
						msgErro += "Nome Invalido\n";
					if(!VerificacaoDeInputs.verificaNome(txtSobrenome.getText()))
						msgErro += "Sobrenome Invalido\n";
					if(!VerificacaoDeInputs.verificaData(txtDataNasc.getText()))
						msgErro += "Data de Nascimento Invalida\n";
					if(!VerificacaoDeInputs.verificaData(txtDataFalec.getText()))
						msgErro += "Data de Falecimento Invalida\n";
					if(!VerificacaoDeInputs.verificaDocumento(txtDocumento.getText()))
						msgErro += "Documento Invalido\n";
					// TODO Verificar se descricao eh valida
					
					if(msgErro.equals("")) {
						fin.setNome(txtNome.getText());
						fin.setSobrenome(txtSobrenome.getText());
						fin.setCPF(txtDocumento.getText());
						fin.setDataDeNascimento(txtDataNasc.getText());
						fin.setDataSepultamento(txtDataFalec.getText());
					} else {
						JOptionPane.showMessageDialog(null,
				                "Verifique estes campos:\n"+msgErro);
					}
					
				} else {
					// TODO fazer um painel dizendo que nenhuma alteracao foi feita
				}
				EditarRegistro.this.dispose();
			}
		});
	
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditarRegistro.this.dispose();
			}
		});
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * ######################## CODIGO ABAIXO GERADO PELA IDE ECLIPSE #############################
	 */
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarRegistro frame = new EditarRegistro();
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
	public EditarRegistro() {
		initComponents();
		eventsHandler();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(12, 14, 33, 19);
		lblId.setFont(new Font("Dialog", Font.BOLD, 16));
		
		txtId = new JTextField();
		txtId.setBounds(63, 12, 154, 23);
		txtId.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtId.setText("Digite ID aqui");
		txtId.setColumns(10);
		
		btnCarregar = new JButton("Carregar");
		btnCarregar.setBounds(588, 12, 97, 25);
		
		btnSalvarESair = new JButton("Salvar e Sair");
		btnSalvarESair.setBounds(562, 439, 123, 25);
		
		lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(12, 139, 85, 15);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(123, 135, 174, 24);
		txtDocumento.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDocumento.setColumns(10);
		
		lblDataDeNascimento = new JLabel("Data de nasc:");
		lblDataDeNascimento.setBounds(12, 99, 115, 15);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(139, 96, 158, 21);
		txtDataNasc.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDataNasc.setColumns(10);
		
		lblDataDeFalecimento = new JLabel("Data de falecimento:");
		lblDataDeFalecimento.setBounds(337, 99, 148, 15);
		
		txtDataFalec = new JTextField();
		txtDataFalec.setBounds(503, 96, 182, 21);
		txtDataFalec.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDataFalec.setColumns(10);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 58, 45, 15);
		
		txtNome = new JTextField();
		txtNome.setBounds(75, 55, 222, 21);
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNome.setColumns(10);
		
		lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(337, 60, 86, 15);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(441, 57, 244, 21);
		txtSobrenome.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtSobrenome.setColumns(10);
		
		txtDescricao = new JTextArea();
		txtDescricao.setBounds(307, 213, 378, 207);
		txtDescricao.setLineWrap(true);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(427, 439, 123, 25);
		
		lblDescricao = new JLabel("Descricao:");
		lblDescricao.setBounds(307, 192, 74, 15);
		
		lblCaminhoFoto = new JLabel("");
		lblCaminhoFoto.setBounds(640, 186, 0, 0);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setBounds(17, 187, 49, 15);
		
		JPanel panel = new JPanel();
		panel.setBounds(17, 208, 256, 256);
		contentPane.setLayout(null);
		contentPane.add(lblNome);
		contentPane.add(txtNome);
		contentPane.add(lblDataDeNascimento);
		contentPane.add(txtDataNasc);
		contentPane.add(lblDocumento);
		contentPane.add(txtDocumento);
		contentPane.add(lblDataDeFalecimento);
		contentPane.add(txtDataFalec);
		contentPane.add(lblSobrenome);
		contentPane.add(txtSobrenome);
		contentPane.add(lblId);
		contentPane.add(txtId);
		contentPane.add(btnCarregar);
		contentPane.add(lblCaminhoFoto);
		contentPane.add(lblFoto);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblFotoInvalida = new JLabel("Foto Invalida");
		lblFotoInvalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoInvalida.setBounds(0, 0, 256, 256);
		panel.add(lblFotoInvalida);
		contentPane.add(lblDescricao);
		contentPane.add(txtDescricao);
		contentPane.add(btnVoltar);
		contentPane.add(btnSalvarESair);
		
		btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(158, 182, 115, 25);
		contentPane.add(btnProcurar);
		
		lblRegistroNaoEncontrado = new JLabel("");
		lblRegistroNaoEncontrado.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroNaoEncontrado.setForeground(Color.RED);
		lblRegistroNaoEncontrado.setBounds(235, 12, 333, 21);
		contentPane.add(lblRegistroNaoEncontrado);
	}
}
