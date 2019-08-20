import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class CDV extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CDV frame = new CDV();
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
	public CDV() {
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(null);
		
		JTextArea txtrArticle = new JTextArea();
		txtrArticle.setColumns(2);
		txtrArticle.setText("Article 1 : Objet Les pr�sentes Conditions G�n�rales de Vente d�terminent les droits et obligations des parties dans le cadre de la vente en ligne de Produits ou Services propos�s par le Vendeur.\r\n" + 
				
				"NOTE: On d�taille ici l�objet du contrat qui est la vente en ligne de Produits et de Services par le Vendeur\r\n" + 
				
				"Article 2 : Dispositions g�n�rales Les pr�sentes Conditions G�n�rales de Vente (CGV) r�gissent les ventes de Produits ou de Services, effectu�es au travers des sites Internet de la Soci�t�, et sont partie int�grante du Contrat entre l�Acheteur et le Vendeur. Elles sont pleinement opposables � l�Acheteur qui les a accept�s avant de passer commande.\r\n" + 
				
				"Le Vendeur se r�serve la possibilit� de modifier les pr�sentes, � tout moment par la publication d�une nouvelle version sur son site Internet. Les CGV applicables alors sont celles �tant en vigueur � la date du paiement (ou du premier paiement en cas de paiements multiples) de la commande. Ces CGV sont consultables sur le site Internet de la Soci�t� � l�adresse suivante : XXX .\r\n" + 
				
				"La Soci�t� s�assure �galement que leur acceptation soit claire et sans r�serve en mettant en place une case � cocher et un clic de validation. Le Client d�clare avoir pris connaissance de l�ensemble des pr�sentes Conditions G�n�rales de Vente, et le cas �ch�ant des Conditions Particuli�res de Vente li�es � un produit ou � un service, et les accepter sans restriction ni r�serve.\r\n" + 
				
				"Le Client reconna�t qu�il a b�n�fici� des conseils et informations n�cessaires afin de s�assurer de l�ad�quation de l�offre � ses besoins.\r\n" + 
				
				"Le Client d�clare �tre en mesure de contracter l�galement en vertu des lois fran�aises ou valablement repr�senter la personne physique ou morale pour laquelle il s�engage.\r\n" + 
				
				"Sauf preuve contraire les informations enregistr�es par la Soci�t� constituent la preuve de l�ensemble des transactions.");
		txtrArticle.setBounds(10, 11, 664, 372);
		getContentPane().add(txtrArticle);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setBounds(300, 410, 89, 23);
		getContentPane().add(btnAccueil);
		

	}
}
