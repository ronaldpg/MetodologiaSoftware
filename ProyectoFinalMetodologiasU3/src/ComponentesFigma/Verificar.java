package ComponentesFigma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Verificar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroCuenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Verificar frame = new Verificar();
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
	public Verificar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 375, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu info = new MainMenu();
				setVisible(false);
				info.setVisible(true);
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMenu.setBounds(147, 450, 89, 23);
		panel.add(btnMenu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 376, 340, 50);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Verificar.class.getResource("/Imagenes/FondoContacto1.png")));
		lblNewLabel.setBounds(0, 0, 340, 50);
		panel_2.add(lblNewLabel);
		
		JLabel lblPalabrasPequeñas1 = new JLabel("Información personal de la cuenta");
		lblPalabrasPequeñas1.setForeground(Color.BLACK);
		lblPalabrasPequeñas1.setBounds(20, 351, 166, 14);
		panel.add(lblPalabrasPequeñas1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 190, 340, 150);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon(Verificar.class.getResource("/Imagenes/fondoCeleste.jpg")));
		lblFondo2.setBounds(0, 0, 340, 150);
		panel_1.add(lblFondo2);
		
		JButton btnNewButton = new JButton("Validar cuenta");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(177, 154, 150, 23);
		panel.add(btnNewButton);
		
		txtNumeroCuenta = new JTextField();
		txtNumeroCuenta.setBounds(20, 155, 135, 20);
		panel.add(txtNumeroCuenta);
		txtNumeroCuenta.setColumns(10);
		
		JLabel lblNumeroCuenta = new JLabel("Nro. de Cuenta");
		lblNumeroCuenta.setForeground(Color.BLACK);
		lblNumeroCuenta.setBounds(20, 130, 76, 14);
		panel.add(lblNumeroCuenta);
		
		JLabel lblPalabra = new JLabel("Información de la cuenta");
		lblPalabra.setBounds(20, 112, 125, 14);
		panel.add(lblPalabra);
		
		JLabel lblLetrasPequeñas = new JLabel("SecureTransfer");
		lblLetrasPequeñas.setForeground(Color.BLACK);
		lblLetrasPequeñas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLetrasPequeñas.setBounds(150, 72, 75, 14);
		panel.add(lblLetrasPequeñas);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 60, 355, 1);
		panel.add(separator);
		
		JPanel pnInterbancaria = new JPanel();
		pnInterbancaria.setBounds(230, 33, 125, 20);
		panel.add(pnInterbancaria);
		pnInterbancaria.setLayout(null);
		
		JLabel lblInterbancaria = new JLabel("Interbancaria");
		lblInterbancaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblInterbancaria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInterbancaria.setBounds(0, 0, 125, 20);
		pnInterbancaria.add(lblInterbancaria);
		
		JPanel pnBancoEspe = new JPanel();
		pnBancoEspe.setBounds(20, 33, 120, 20);
		panel.add(pnBancoEspe);
		pnBancoEspe.setLayout(null);
		
		JLabel lblBanco = new JLabel("Banco Espe");
		lblBanco.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBanco.setBounds(0, 0, 120, 20);
		pnBancoEspe.add(lblBanco);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Verificar.class.getResource("/Imagenes/FondoBlanco2.png")));
		lblFondo.setBounds(0, 0, 375, 484);
		panel.add(lblFondo);
	}
}
