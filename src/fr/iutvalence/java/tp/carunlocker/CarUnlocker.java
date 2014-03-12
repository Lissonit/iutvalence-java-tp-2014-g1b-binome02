package fr.iutvalence.java.tp.carunlocker;

//TODO (fait) écrire un commentaire
/**
 * La partie lancée
 * @author lissonit
 */
public class CarUnlocker
{
	
	/**
	 * Déclaration du nouveau plateau de jeu correspondant au plateau de la nouvelle partie
	 */
	private Plateau base;
		
	/**
	 * Retourne une nouvelle partie de jeu
	 * La voiture principale et les secondaires
	 * sont disposées dans leurs positions initiales
	 * @param listeVoiture liste contenant les voitures à disposer
	 */
	public CarUnlocker(Voiture[] listeVoiture)
	{
		// Initialisation du nouveau plateau de jeu correspondant au plateau de la nouvelle partie
		this.base = new Plateau(listeVoiture);
	}
	
	/**
	 * Methode de lancement de la partie
	 */
	public void jouer()
	{
		
		// Quelque chose ...
	}
}
