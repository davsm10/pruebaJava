/**
 * @author daw1ed
 * 25 may 2024
 */

package pruebaJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(161, 173, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLogueo = new JLabel("Logueo");
		lblLogueo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLogueo.setBounds(189, 30, 60, 15);
		frame.getContentPane().add(lblLogueo);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(179, 146, 96, 15);
		frame.getContentPane().add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 115, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(189, 92, 60, 15);
		frame.getContentPane().add(lblUsuario);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GestorCochera gestor = new GestorCochera();

				gestor.imprimirInformacionDeposito("DSM");
				
			}
		});
		btnNewButton.setBounds(134, 215, 173, 25);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}
