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
	
	/**
	 * Savoir si deux positions sont alignées
	 * @param La position à tester
	 * @param La direction de l'alignement
	 * @return Retourne vrai si les positions sont alignés
	 */
	public boolean estAligneAvec(Position position, Direction direction)
	{
		if(direction.equals(direction.VERTICAL) && this.obtenirX() == position.obtenirX() )
			return true;
		if(direction.equals(direction.HORIZONTAL) && this.obtenirY() == position.obtenirY())
			return true;
		return false;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + coordonnee_X;
		result = prime * result + coordonnee_Y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (! (obj instanceof Position))
			return false;
	
		Position other = (Position) obj;
		return ((this.coordonnee_X == other.coordonnee_X)&&(this.coordonnee_Y == other.coordonnee_Y));
	}
	
	/**
	 * @param position position à tester
	 * @return Retourne vrai si la position à tester est adjacent à cette position
	 */
	public boolean estAdjacent(Position position)
	{
		if(distanceAvec(position) <= 1)
			return true;
		return false;
	}
	
	/**
	 * @param position position à tester
	 * @return Retourne la distance entière entre cette position et la position à tester 
	 */
	public int distanceAvec(Position position)
	{
		return (int)Math.sqrt(Math.pow(this.coordonnee_X - position.obtenirX() , 2) + Math.pow(this.coordonnee_Y - position.obtenirY() , 2));
	}
}
