package ComponentesFigma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtNombreCompleto;
	private JTextField txtCorreo;
	private JTextField txtNumCell;
	private JLabel lblNewLabel;
	private JTextField txtNickName;
	private JTextField txtContraseña;
	private JPanel panel;
	private JLabel lblFondoCafe;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
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
	public Registrarse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnFondo = new JPanel();
		pnFondo.setBounds(0, 0, 375, 484);
		contentPane.add(pnFondo);
		pnFondo.setLayout(null);
		
		JPanel pnDatos = new JPanel();
		pnDatos.setBounds(0, 0, 375, 200);
		pnFondo.add(pnDatos);
		pnDatos.setLayout(null);
		
		txtNumCell = new JTextField();
		txtNumCell.setColumns(10);
		txtNumCell.setBounds(75, 159, 200, 20);
		pnDatos.add(txtNumCell);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(75, 128, 200, 20);
		pnDatos.add(txtCorreo);
		
		txtNombreCompleto = new JTextField();
		txtNombreCompleto.setColumns(10);
		txtNombreCompleto.setBounds(75, 97, 200, 20);
		pnDatos.add(txtNombreCompleto);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(75, 66, 200, 20);
		pnDatos.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblSubTitulo = new JLabel("Registrarse");
		lblSubTitulo.setForeground(Color.WHITE);
		lblSubTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubTitulo.setBounds(180, 25, 70, 20);
		pnDatos.add(lblSubTitulo);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon(Registrarse.class.getResource("/Imagenes/Registrarse1.png")));
		lblIcono.setBounds(125, 15, 50, 40);
		pnDatos.add(lblIcono);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon(Registrarse.class.getResource("/Imagenes/fondoPlomoFondo2.png")));
		lblFondo2.setBounds(0, 0, 375, 200);
		pnDatos.add(lblFondo2);
		
		lblNewLabel = new JLabel("Crea tu usuario y contraseña");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(75, 211, 160, 14);
		pnFondo.add(lblNewLabel);
		
		txtNickName = new JTextField();
		txtNickName.setBounds(75, 236, 200, 35);
		pnFondo.add(txtNickName);
		txtNickName.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(75, 280, 200, 35);
		pnFondo.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(0, 327, 375, 157);
		pnFondo.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Registrarse!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdministradorUsuario guardarInfo = new AdministradorUsuario();
				InicioSesion info = new InicioSesion();
				String numeroCedula = txtCedula.getText();
				String nombreCompleto = txtNombreCompleto.getText();
				String correo = txtCorreo.getText();
				String numeroCell = txtNumCell.getText();
				String nickName = txtNickName.getText();
				String contraseña = txtContraseña.getText();
				
				Usuario nuevo = new Usuario(numeroCedula, nombreCompleto, correo, numeroCell, nickName, contraseña);
				guardarInfo.guardarUsuario(nuevo);
				JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente!");
				txtCedula.setText("");
				txtContraseña.setText("");
				txtCorreo.setText("");
				txtNickName.setText("");
				txtNombreCompleto.setText("");
				txtNumCell.setText("");
				setVisible(false);
				info.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(110, 75, 150, 40);
		panel.add(btnNewButton);
		
		lblFondoCafe = new JLabel("");
		lblFondoCafe.setIcon(new ImageIcon(Registrarse.class.getResource("/Imagenes/FondoCafe1.png")));
		lblFondoCafe.setBounds(0, 0, 375, 157);
		panel.add(lblFondoCafe);
	}
	
	
	
	
	

}
