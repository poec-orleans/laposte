import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Timbre {

	private JFrame frame;
	private JTextField txtTimbre;
	private JTextField txtTimbreEnCarnet;
	private JTextField txtTimbreLunit;
	private int Nombre1;
	private int Nombre2;
	private int Total;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void TimbreNormal(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timbre window = new Timbre();
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
	public Timbre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtTimbre = new JTextField();
		txtTimbre.setText("Timbre");
		txtTimbre.setBounds(223, 0, 41, 20);
		frame.getContentPane().add(txtTimbre);
		txtTimbre.setColumns(10);
		
		txtTimbreEnCarnet = new JTextField();
		txtTimbreEnCarnet.setText("Timbre en carnet (10\u20AC)");
		txtTimbreEnCarnet.setBounds(69, 57, 122, 20);
		frame.getContentPane().add(txtTimbreEnCarnet);
		txtTimbreEnCarnet.setColumns(10);
		
		txtTimbreLunit = new JTextField();
		txtTimbreLunit.setText("Timbre \u00E0 l'unit\u00E9 (1\u20AC)");
		txtTimbreLunit.setColumns(10);
		txtTimbreLunit.setBounds(69, 105, 122, 20);
		frame.getContentPane().add(txtTimbreLunit);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(297, 105, 29, 20);
		frame.getContentPane().add(spinner_1);
		
		
		textField = new JTextField();
		textField.setBounds(69, 152, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(296, 57, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		
	}
}