package fr.iutvalence.java.tp.carunlocker;

public class Position
{
	/**
	 * coordonnee x de la position
	 */
	private int coordonnee_X;
	
	/**
	 * coordonnee y de la position
	 */
	private int coordonnee_Y;

	/**
	 * @param x coordonnee x de la position
	 * @param y coordonnee y de la position
	 */
	public Position(int x, int y)
	{
		this.coordonnee_X = x;
		this.coordonnee_Y = y;
	}
	
	/**
	 * @return la coordonnee en X
	 */
	public int obtenirX()
	{
		return this.coordonnee_X;
	}
	
	/**
	 * @param X la nouvelle valeur de X
	 */
	public void modifierX(int X)
	{
		this.coordonnee_X = X;
	}
	
	/**
	 * @return la coordonnee Y
	 */
	public int obtenirY()
	{
		return this.coordonnee_Y;
	}
	
	/**
	 * @param Y la nouvelle valeur de Y
	 */
	public void modifierY(int Y)
	{
		this.coordonnee_Y = Y;
	}
}
