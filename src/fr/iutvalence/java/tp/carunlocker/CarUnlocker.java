package fr.iutvalence.java.tp.carunlocker;

public class CarUnlocker
{
	
	/**
	 * Entier représentant le niveau de difficulté de la partie
	 */
	private int niveau;
	
	/**
	 * Retourne une nouvelle partie de jeu
	 * La voiture principale et les secondaires
	 * sont disposées dans leurs positions initiales
	 * Avec le niveau de difficulté 0
	 */
	public CarUnlocker()
	{
		// Initialisation du niveau de la nouvelle partie
		this.niveau = 0;
		// Création du nouveau plateau de jeu correspondant au plateau de la nouvelle partie
		Plateau base = new Plateau();
	}
	
	/**
	 * Methode de lancement de la partie
	 */
	public void jouer()
	{
		// Quelque chose ...
	}
}
