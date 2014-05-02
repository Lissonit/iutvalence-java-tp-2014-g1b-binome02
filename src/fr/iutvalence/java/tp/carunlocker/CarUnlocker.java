package fr.iutvalence.java.tp.carunlocker;
/**
 * La partie lancée
 * @author lissonit
 */
public class CarUnlocker
{
	
	/**
	 * Déclaration du nouveau plateau de jeu correspondant au plateau de la nouvelle partie
	 */
	private final Plateau base;
		
	/**
	 * Retourne une nouvelle partie de jeu
	 * La voiture principale et les secondaires
	 * sont disposées dans leurs positions initiales
	 * @param voitures les voitures à disposer
	 */
	public CarUnlocker(Voiture[] voitures)
	{
		// Initialisation du nouveau plateau de jeu correspondant au plateau de la nouvelle partie
		this.base = new Plateau(voitures);
	}
	
	/**
	 * Methode de lancement de la partie
	 */
	public void jouer()
	{
		//Affichage du plateau avec les voitures
		System.out.print(this.base.toString()+ "\n");
		System.out.println(this.base.voiturePeutGlisserVersPosition(this.base.obtenirVoitures()[0], new Position(1,0)));
		this.base.deplacerVoiture(this.base.obtenirVoitures()[0], new Position(1,0));
		System.out.print(this.base.toString());
	}
}
