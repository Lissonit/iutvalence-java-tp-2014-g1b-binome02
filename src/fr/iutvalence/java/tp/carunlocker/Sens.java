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
	
	private final Direction direction;
	
	private final int decalageX;
	
	private final int decalageY;

	private Sens(Direction direction, int decalageX, int decalageY)
	{
		this.direction = direction;
		this.decalageX = decalageX;
		this.decalageY = decalageY;
	}
	
	public Direction getDirection()
	{
		return this.direction;
	}
	
	public int obtenirDecalageX()
	{
		return this.decalageX;
	}
	
	public int obtenirDecalageY()
	{
		return this.decalageY;
	}
}
