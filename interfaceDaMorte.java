package deathMath;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfaceDaMorte {

	private JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceDaMorte window = new interfaceDaMorte();
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
	public interfaceDaMorte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @param nome 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 205, 182);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblColoqueONome = new JLabel("Coloque o nome da v\u00EDtima:");
		lblColoqueONome.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblColoqueONome.setBounds(10, 26, 176, 20);
		frame.getContentPane().add(lblColoqueONome);
		
		deathMath codigo = new deathMath();

		
		textField = new JTextField();
		textField.setBounds(10, 57, 169, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		
		JButton btnMorra = new JButton("Morra");
		btnMorra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String value = textField.getText();
				JOptionPane.showMessageDialog(null, value +""+ codigo.data());


			}
		});
		
		
		btnMorra.setBounds(51, 88, 89, 23);
		frame.getContentPane().add(btnMorra);

	}
	
}