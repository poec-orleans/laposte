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
		txtrArticle.setText("Article 1 : Objet Les présentes Conditions Générales de Vente déterminent les droits et obligations des parties dans le cadre de la vente en ligne de Produits ou Services proposés par le Vendeur.\r\n" + 
				
				"NOTE: On détaille ici l’objet du contrat qui est la vente en ligne de Produits et de Services par le Vendeur\r\n" + 
				
				"Article 2 : Dispositions générales Les présentes Conditions Générales de Vente (CGV) régissent les ventes de Produits ou de Services, effectuées au travers des sites Internet de la Société, et sont partie intégrante du Contrat entre l’Acheteur et le Vendeur. Elles sont pleinement opposables à l’Acheteur qui les a acceptés avant de passer commande.\r\n" + 
				
				"Le Vendeur se réserve la possibilité de modifier les présentes, à tout moment par la publication d’une nouvelle version sur son site Internet. Les CGV applicables alors sont celles étant en vigueur à la date du paiement (ou du premier paiement en cas de paiements multiples) de la commande. Ces CGV sont consultables sur le site Internet de la Société à l’adresse suivante : XXX .\r\n" + 
				
				"La Société s’assure également que leur acceptation soit claire et sans réserve en mettant en place une case à cocher et un clic de validation. Le Client déclare avoir pris connaissance de l’ensemble des présentes Conditions Générales de Vente, et le cas échéant des Conditions Particulières de Vente liées à un produit ou à un service, et les accepter sans restriction ni réserve.\r\n" + 
				
				"Le Client reconnaît qu’il a bénéficié des conseils et informations nécessaires afin de s’assurer de l’adéquation de l’offre à ses besoins.\r\n" + 
				
				"Le Client déclare être en mesure de contracter légalement en vertu des lois françaises ou valablement représenter la personne physique ou morale pour laquelle il s’engage.\r\n" + 
				
				"Sauf preuve contraire les informations enregistrées par la Société constituent la preuve de l’ensemble des transactions.");
		txtrArticle.setBounds(10, 11, 664, 372);
		getContentPane().add(txtrArticle);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setBounds(300, 410, 89, 23);
		getContentPane().add(btnAccueil);
		

	}
}
