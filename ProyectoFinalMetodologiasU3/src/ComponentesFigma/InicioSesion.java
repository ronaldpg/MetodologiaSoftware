package ComponentesFigma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNickName1;
	private JTextField txtContraseña1;
	public Color color = new Color(93,176,190);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	public InicioSesion() {
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
		
		JPanel pnRegresar = new JPanel();
		pnRegresar.setBounds(0, 0, 70, 43);
		panel.add(pnRegresar);
		pnRegresar.setLayout(null);
		pnRegresar.setBackground(color);
		
		JLabel lblRegresar = new JLabel("");
		lblRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainMenu info = new MainMenu();
				setVisible(false);
				info.setVisible(true);
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		lblRegresar.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/regresar1.png")));
		lblRegresar.setBounds(0, 0, 70, 43);
		pnRegresar.add(lblRegresar);
		lblRegresar.setBackground(color);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Verificar info = new Verificar();
				AdministradorUsuario info2 = new AdministradorUsuario();
				String nickName = txtNickName1.getText();
				String contra = txtContraseña1.getText();
				
				if (info2.validarCredenciales(nickName, contra)) {
		            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
		        } else {
		            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
		        }
				
				setVisible(false);
				info.setVisible(true);
			}
		});
		btnAceptar.setBounds(145, 409, 89, 23);
		panel.add(btnAceptar);
		
		JLabel lblIcono2 = new JLabel("");
		lblIcono2.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/candado 2.png")));
		lblIcono2.setBounds(64, 360, 30, 20);
		panel.add(lblIcono2);
		
		JLabel lblIcono1 = new JLabel("");
		lblIcono1.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/Usuario12.png")));
		lblIcono1.setBounds(64, 317, 30, 20);
		panel.add(lblIcono1);
		
		txtContraseña1 = new JTextField();
		txtContraseña1.setColumns(10);
		txtContraseña1.setBounds(96, 357, 200, 20);
		panel.add(txtContraseña1);
		
		txtNickName1 = new JTextField();
		txtNickName1.setBounds(96, 317, 200, 20);
		panel.add(txtNickName1);
		txtNickName1.setColumns(10);
		
		JLabel lblLetrasP = new JLabel("Ingresa tu usuario y contraseña");
		lblLetrasP.setForeground(Color.BLACK);
		lblLetrasP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLetrasP.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetrasP.setBounds(60, 286, 250, 20);
		panel.add(lblLetrasP);
		
		JLabel lblLetras = new JLabel("Iniciar Sesión");
		lblLetras.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetras.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLetras.setForeground(Color.WHITE);
		lblLetras.setBounds(85, 235, 200, 30);
		panel.add(lblLetras);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/fondoNegro12.png")));
		lblNewLabel.setBounds(0, 223, 373, 52);
		panel.add(lblNewLabel);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/UsuarioFoto1.png")));
		lblIcono.setBounds(80, 11, 203, 189);
		panel.add(lblIcono);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/fondoCeleste.jpg")));
		lblFondo2.setBounds(0, 0, 375, 221);
		panel.add(lblFondo2);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/FondoBlanco2.png")));
		lblFondo.setBounds(0, 0, 375, 484);
		panel.add(lblFondo);
	}
}
