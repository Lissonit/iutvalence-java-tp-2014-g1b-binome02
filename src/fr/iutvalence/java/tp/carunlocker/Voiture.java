package fr.iutvalence.java.tp.carunlocker;

import java.util.ArrayList;
import java.util.List;


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
	public Position obtenirPositionDeLaTete()
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
		for (Position positionATester: this.obtenirPositions())
		{
			if (positionATester.equals(position))
				return true;
		}
		return false;
	}
	
	/**
	 * Obtient toutes les cases occupées par la voiture
	 * @return la liste des positions occupées par la voiture 
	 */
	public List<Position> obtenirPositions()
	{
		List<Position> listPosition = new ArrayList<Position>();
		for(int indiceCorpsVoiture = 0; indiceCorpsVoiture < this.obtenirTaille(); indiceCorpsVoiture++)
		{
			if(this.obtenirDirection().equals(Direction.VERTICAL))
			{
				listPosition.add(new Position(this.obtenirPositionDeLaTete().obtenirX(),
						this.obtenirPositionDeLaTete().obtenirY() + indiceCorpsVoiture));
			}
			else if(this.obtenirDirection().equals(Direction.HORIZONTAL))
			{
				listPosition.add(new Position(this.obtenirPositionDeLaTete().obtenirX() + indiceCorpsVoiture,
						this.obtenirPositionDeLaTete().obtenirY()));
			}
		}
		return listPosition;		
	}
	
	
	/**
	 * Retourne la voiture à la position finale
	 * @param positionFinale La position finale
	 * @return Une voiture dans la position finale, sans déplacer l'actuelle
	 */
	public Voiture translaterVers(Position positionFinale)
	{
		 return new Voiture(positionFinale, this.taille, this.direction);
	}
}
	