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
	
	/**
	 * Savoir si la position est occupée par la voiture
	 * @param La position à tester
	 * @return Retourne vrai si la tête ou le corps de la voiture occupe la position
	 */
	public boolean occupePosition(Position position)
	{	
		for(int indiceCorpsVoiture = 0; indiceCorpsVoiture < this.obtenirTaille(); indiceCorpsVoiture++)
		{
			if(this.obtenirDirection().equals(Direction.VERTICAL))
			{
				if(position.equals(new Position(this.obtenirPosition().obtenirX(),
						this.obtenirPosition().obtenirY() + indiceCorpsVoiture)))
						return true;
			}
			else if(this.obtenirDirection().equals(Direction.HORIZONTAL))
			{
				if(position.equals(new Position(this.obtenirPosition().obtenirX() + indiceCorpsVoiture,
						this.obtenirPosition().obtenirY())))
						return true;
			}
		}
		
		return false;
	}
}
