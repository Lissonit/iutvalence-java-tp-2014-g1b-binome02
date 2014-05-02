package fr.iutvalence.java.tp.carunlocker;

/**
 * La partie lancée
 * 
 * @author lissonit
 */
public class CarUnlocker
{

	/**
	 * Déclaration du nouveau plateau de jeu correspondant au plateau de la
	 * nouvelle partie
	 */
	private final Plateau plateau;

	/**
	 * Le joueur
	 */
	private final Joueur joueur;

	/**
	 * Retourne une nouvelle partie de jeu La voiture principale et les
	 * secondaires sont disposées dans leurs positions initiales
	 * 
	 * @param voitures
	 *            les voitures à disposer
	 * @param joueur
	 *            le joueur
	 */
	public CarUnlocker(Voiture[] voitures, Joueur joueur)
	{
		// Initialisation du nouveau plateau de jeu correspondant au plateau de
		// la nouvelle partie
		this.plateau = new Plateau(voitures);
		this.joueur = joueur;
	}

	/**
	 * Methode de lancement de la partie
	 */
	public void jouer()
	{
		for (int numeroDuTour = 1;; numeroDuTour++)
		{
			
			System.out.println("Tour "+numeroDuTour);
			
			// Affichage du plateau avec les voitures
			System.out.print(this.plateau.toString() + "\n");
			
			Voiture voitureADeplacer = null;
			Position nouvellePositionDeLaTete = null;
			
			while (true)
			{
				System.out.println("Mouvement ? ");
				Mouvement mouvement = this.joueur.obtenirMouvement();
				voitureADeplacer = this.plateau.obtenirVoitures()[mouvement.obtenirNumeroDeVoiture()];
				nouvellePositionDeLaTete =  mouvement.obtenirNouvellePositionDeLaTete();
				if (this.plateau.voiturePeutGlisserVersPosition(voitureADeplacer, nouvellePositionDeLaTete)) 
				{
					System.out.println("Déplacement de la voiture "+ mouvement.obtenirNumeroDeVoiture()+" vers "+nouvellePositionDeLaTete);
					break;
				}
			}
			
			this.plateau.deplacerVoiture(voitureADeplacer, nouvellePositionDeLaTete);
			
			System.out.print(this.plateau.toString());
		}
	}
}
