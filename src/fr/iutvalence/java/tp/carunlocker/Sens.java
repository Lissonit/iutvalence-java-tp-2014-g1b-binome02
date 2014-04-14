package fr.iutvalence.java.tp.carunlocker;

/**
 * les sens possibles
 * @author lissonit
 */
public enum Sens
{
	/**
	 * le sens haut
	 */
	HAUT(Direction.VERTICAL, 0, -1),
	/**
	 * le sens bas
	 */
	BAS(Direction.VERTICAL, 0, 1),
	/**
	 * le sens gauche
	 */
	GAUCHE(Direction.HORIZONTAL, -1, 0),
	/**
	 * le sens droite
	 */
	DROITE(Direction.HORIZONTAL, 1, 0);
	
	/**
	 * Attribut direction du sens
	 */
	private final Direction direction;
	
	/**
	 * Attribut décalageX du sens
	 */
	private final int decalageX;

	/**
	 * Attribut décalageY du sens
	 */
	private final int decalageY;

	/**
	 * Un nouveau sens
	 * @param direction La direction du sens
	 * @param decalageX Le décalage en X du sens
	 * @param decalageY Le déclage en y du sens
	 */
	private Sens(Direction direction, int decalageX, int decalageY)
	{
		this.direction = direction;
		this.decalageX = decalageX;
		this.decalageY = decalageY;
	}
	
	/**
	 * Obtenir la direction
	 * @return Retourne la direction associée au sens
	 */
	public Direction getDirection()
	{
		return this.direction;
	}
	
	/**
	 * Obtenir le décalage en X
	 * @return Retourne le décalage en X
	 */
	public int obtenirDecalageX()
	{
		return this.decalageX;
	}
	
	/**
	 * Obtenir le décalage en Y
	 * @return Retourne le décalage en Y
	 */
	public int obtenirDecalageY()
	{
		return this.decalageY;
	}
}
