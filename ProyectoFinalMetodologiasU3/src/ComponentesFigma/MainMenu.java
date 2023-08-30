package ComponentesFigma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 100, 390, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnFondo = new JPanel();
		pnFondo.setBounds(0, 0, 375, 484);
		contentPane.add(pnFondo);
		pnFondo.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(60, 196, 250, 1);
		pnFondo.add(separator);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBienvenido.setBounds(97, 146, 168, 62);
		pnFondo.add(lblBienvenido);
		
		JLabel lblLetrasPequeñas = new JLabel("Validaciones Transferencias bancarias");
		lblLetrasPequeñas.setForeground(Color.WHITE);
		lblLetrasPequeñas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLetrasPequeñas.setBounds(56, 21, 168, 14);
		pnFondo.add(lblLetrasPequeñas);
		
		JLabel lblLetra1 = new JLabel("Transfer");
		lblLetra1.setForeground(new Color(0, 128, 0));
		lblLetra1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLetra1.setBounds(119, 0, 80, 20);
		pnFondo.add(lblLetra1);
		
		JLabel lblLetras = new JLabel("Secure");
		lblLetras.setForeground(Color.BLUE);
		lblLetras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLetras.setBounds(56, 0, 62, 20);
		pnFondo.add(lblLetras);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon(MainMenu.class.getResource("/Imagenes/transferencia-bancariag.png")));
		lblIcono.setBounds(0, 0, 46, 35);
		pnFondo.add(lblIcono);
		
		JLabel lblFondoNegro = new JLabel("");
		lblFondoNegro.setIcon(new ImageIcon(MainMenu.class.getResource("/Imagenes/fondoPlomo1.png")));
		lblFondoNegro.setBounds(0, 0, 375, 35);
		pnFondo.add(lblFondoNegro);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon(MainMenu.class.getResource("/Imagenes/transferencia-bancaria f.png")));
		lblFondo2.setBounds(73, 219, 222, 167);
		pnFondo.add(lblFondo2);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrarse info = new Registrarse();
				setVisible(false);
				info.setVisible(true);
			}
		});
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRegistrarse.setForeground(Color.BLACK);
		btnRegistrarse.setBounds(225, 420, 100, 23);
		pnFondo.add(btnRegistrarse);
		
		JButton btnIniciarS = new JButton("Iniciar Sesión");
		btnIniciarS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioSesion info = new InicioSesion();
				setVisible(false);
				info.setVisible(true);
			}
		});
		btnIniciarS.setForeground(Color.BLACK);
		btnIniciarS.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnIniciarS.setBounds(40, 420, 110, 23);
		pnFondo.add(btnIniciarS);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(MainMenu.class.getResource("/Imagenes/FondoBlanco2.png")));
		lblFondo.setBounds(0, 0, 375, 484);
		pnFondo.add(lblFondo);
	}
}
