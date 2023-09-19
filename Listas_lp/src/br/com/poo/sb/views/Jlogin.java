package br.com.poo.sb.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jlogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cpf;
	private JTextField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jlogin frame = new Jlogin();
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
	public Jlogin() {
		setTitle("Sistema Bancario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TituloLogin = new JLabel("Login");
		TituloLogin.setBounds(187, 10, 60, 31);
		TituloLogin.setForeground(new Color(255, 128, 64));
		TituloLogin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(TituloLogin);
		
		cpf = new JTextField();
		cpf.setBackground(new Color(255, 255, 255));
		cpf.setBounds(166, 83, 127, 22);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		senha = new JTextField();
		senha.setBounds(166, 151, 127, 20);
		contentPane.add(senha);
		senha.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(201, 91, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(201, 154, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("cpf\r\n");
		lblNewLabel_2.setBounds(162, 66, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("senha");
		lblNewLabel_3.setBounds(162, 134, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String senha = new String (TextSenha.getPassword());
				///if(cpf != null && senha != null && !cpf.isEmpty() && !senha.isEmpty())
			}
		});
		Entrar.setBounds(185, 204, 89, 23);
		contentPane.add(Entrar);
	}
}
