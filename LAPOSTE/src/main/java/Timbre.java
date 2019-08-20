import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Timbre {

	private JFrame frame;
	private JTextField txtTimbre;
	private int nombre1;
	private int nombre2;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private Button button;

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
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtTimbre = new JTextField();
		txtTimbre.setText("Timbre");
		txtTimbre.setBounds(311, 0, 46, 20);
		frame.getContentPane().add(txtTimbre);
		txtTimbre.setColumns(10);
		
		JLabel lblTimbreAuCarnet = new JLabel("Timbre au carnet (10\u20AC)");
		lblTimbreAuCarnet.setBounds(10, 60, 146, 14);
		frame.getContentPane().add(lblTimbreAuCarnet);
		
		JLabel lblTimbreLunit = new JLabel("Timbre \u00E0 l'unit\u00E9 (1\u20AC)");
		lblTimbreLunit.setBounds(10, 108, 122, 14);
		frame.getContentPane().add(lblTimbreLunit);
		
		
				
		
		final JLabel textfieldsomme = new JLabel("0 €");
		textfieldsomme.setBounds(10, 155, 122, 14);
		frame.getContentPane().add(textfieldsomme);
	
		
		spinner = new JSpinner();
		spinner_1 = new JSpinner();
		
		
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Integer somme = (Integer) spinner.getValue() * 10;
				nombre1 = somme;
				String totalstr = Integer.toString(nombre1 + nombre2);
				textfieldsomme.setText("Total à payer : "+totalstr+" €");
			}
		});
		
		spinner.setBounds(591, 57, 83, 20);
		frame.getContentPane().add(spinner);
		
		
		
		spinner_1 = new JSpinner();
		spinner_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Integer somme2 = (Integer) spinner_1.getValue();
				nombre2 = somme2;
				String totalstr = Integer.toString(nombre1 + nombre2);
				textfieldsomme.setText("Total à payer : "+totalstr+" €");
			}
		});
		spinner_1.setBounds(591, 105, 83, 20);
		frame.getContentPane().add(spinner_1);
		
		button = new Button("Accueil");
		button.setBounds(300, 429, 70, 22);
		frame.getContentPane().add(button);	

		
	}
}