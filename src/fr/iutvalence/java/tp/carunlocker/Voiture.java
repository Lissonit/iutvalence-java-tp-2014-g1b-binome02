package fr.iutvalence.java.tp.carunlocker;


public class Voiture
{	
	/**
	 * la direction de la voiture
	 */
	private Direction direction;
	
	/**
	 * le nombre de case qu'occupe la voiture
	 */
	private int taille;
	
	/**
	 * la position de la 'tete' de la voiture
	 */
	private Position positionTete;
	
	/**
	 * une nouvelle voiture
	 * @param positionTete la position de la tete de la voiture
	 * @param taille la taille de la voiture en nombre de cases
	 * @param dir la direction de la voiture (horizontal ou vertical)
	 */
	public Voiture(Position positionTete, int taille, Direction dir)
	{
		this.direction = dir;
		this.positionTete = positionTete;
		this.taille = taille;
	}
	
	
	/**
	 * @return la position de la tete de ma voiture
	 */
	public Position obtenirPosition()
	{
		return this.positionTete;
	}
	
	/**
	 * @return la direction de la voiture
	 */
	public Direction obtenirDirection()
	{
		return this.direction;
	}
	
	/**
	 * @return la taille de la voiture
	 */
	public int obtenirTaille()
	{
		return this.taille;
	}
	
	/*public void DeplacerVers(Voiture[] listeVoiture, Direction dir, int nbrCases)
	{
		// Déplacement de la voiture de nbrCases avec la direction indiquée
		// Prendre en compte les obstacles (voitures présentes OU en dehors du plateau de jeu, etc ...)
	}*/
	
	// TODO Faire la javadoc de la methode obstacle
	/**
	 * 
	 * @param listeVoiture
	 * @param position
	 * @return
	 */
	private boolean estObstacle(Voiture[] listeVoiture, Position position)
	{
		for(Voiture voitureCourante : listeVoiture)
			if (position.equals(voitureCourante.positionTete))
				return true;
		
		return false;
	}
}
