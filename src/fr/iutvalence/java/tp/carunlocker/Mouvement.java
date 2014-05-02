package fr.iutvalence.java.tp.carunlocker;

public class Mouvement
{
	/**
	 * Le numéro de la voiture à déplacer
	 */
	private final int numeroDeVoiture;
	
	/**
	 * La nouvelle position de la tête de la voiture
	 */
	private final Position nouvellePositionDeLaTete;

	/**
	 * Construit un nouveau mouvement étant donnés un numéro de voiture et une nouvelle position de la tête
	 * @param numeroDeVoiture le numéro de voiture
	 * @param nouvellePositionDeLaTete la nouvelle position de la tête
	 */
	public Mouvement(int numeroDeVoiture, Position nouvellePositionDeLaTete)
	{
		this.numeroDeVoiture = numeroDeVoiture;
		this.nouvellePositionDeLaTete = nouvellePositionDeLaTete;
	}

	/**
	 * Obtenir le numéro de voiture
	 * @return le numéro de voiture
	 */
	public int obtenirNumeroDeVoiture()
	{
		return this.numeroDeVoiture;
	}

	/**
	 * Obtenir la nouvelle position de la tête
	 * @return la nouvelle position de la tête
	 */
	public Position obtenirNouvellePositionDeLaTete()
	{
		return this.nouvellePositionDeLaTete;
	}
}
