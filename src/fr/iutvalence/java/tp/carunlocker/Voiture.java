package fr.iutvalence.java.tp.carunlocker;

import java.util.ArrayList;
import java.util.List;


/**
 * Une voiture 
 * @author lissonit
 */
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
	 * @param position La position à tester
	 * @return boolean Retourne vrai si la tête ou le corps de la voiture occupe la position
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
	 * Retourne toutes les cases occupées par la voiture
	 * @return Retourne la liste des positions occupées par la voiture 
	 */
	public List<Position> obtenirPositions()
	{
		List<Position> positions = new ArrayList<Position>();
		for(int indiceCorpsVoiture = 0; indiceCorpsVoiture < this.obtenirTaille(); indiceCorpsVoiture++)
		{
			if(this.obtenirDirection().equals(Direction.VERTICAL))
			{
				positions.add(new Position(this.obtenirPositionDeLaTete().obtenirX(),
						this.obtenirPositionDeLaTete().obtenirY() + indiceCorpsVoiture));
			}
			else if(this.obtenirDirection().equals(Direction.HORIZONTAL))
			{
				positions.add(new Position(this.obtenirPositionDeLaTete().obtenirX() + indiceCorpsVoiture,
						this.obtenirPositionDeLaTete().obtenirY()));
			}
		}
		return positions;		
	}
	
	
	/**
	 * Retourne la voiture à la position finale
	 * @param positionFinale La position finale
	 * @return Retourne une voiture dans la position finale, sans déplacer l'actuelle
	 */
	public Voiture obtenirNouvelleVoitureParTranslation(Position positionFinale)
	{
		 return new Voiture(positionFinale, this.taille, this.direction);
	}


	/**
	 * Modifie la position de la tête de la voiture
	 * @param positionSouhaitee La nouvelle position de la tête de la voiture
	 */
	public void deplacerVers(Position positionSouhaitee)
	{
		this.positionTete = positionSouhaitee;
	}
}
	