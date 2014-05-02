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
	 * L'affichage 
	 */
	private Affichage affichage;

	/**
	 * Retourne une nouvelle partie de jeu La voiture principale et les
	 * secondaires sont disposées dans leurs positions initiales
	 * 
	 * @param voitures
	 *            les voitures à disposer
	 * @param joueur
	 *            le joueur
	 */
	public CarUnlocker(Voiture[] voitures, Joueur joueur, Affichage affichage)
	{
		// Initialisation du nouveau plateau de jeu correspondant au plateau de
		// la nouvelle partie
		this.plateau = new Plateau(voitures);
		this.joueur = joueur;
		this.affichage = affichage;
	}

	/**
	 * Methode de lancement de la partie
	 */
	public void jouer()
	{
		for (int numeroDuTour = 1;; numeroDuTour++)
		{
			
			this.affichage.afficherDebutTour(numeroDuTour);
			
			// Affichage du plateau avec les voitures
			this.affichage.afficherPlateau(this.plateau);
			
			Voiture voitureADeplacer = null;
			Position nouvellePositionDeLaTete = null;
			
			while (true)
			{
				this.affichage.afficherDemandeDeMouvement();
				Mouvement mouvement = this.joueur.obtenirMouvement();
				voitureADeplacer = this.plateau.obtenirVoitures()[mouvement.obtenirNumeroDeVoiture()];
				nouvellePositionDeLaTete =  mouvement.obtenirNouvellePositionDeLaTete();
				if (this.plateau.voiturePeutGlisserVersPosition(voitureADeplacer, nouvellePositionDeLaTete)) 
				{
					this.affichage.afficherMouvement(mouvement);
					break;
				}
			}
			
			this.plateau.deplacerVoiture(voitureADeplacer, nouvellePositionDeLaTete);
			
			this.affichage.afficherPlateau(this.plateau);
		}
	}
}
