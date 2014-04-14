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
	 * @param x
	 *            coordonnee x de la position
	 * @param y
	 *            coordonnee y de la position
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
	 * @param X
	 *            la nouvelle valeur de X
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
	 * @param Y
	 *            la nouvelle valeur de Y
	 */
	public void modifierY(int Y)
	{
		this.coordonnee_Y = Y;
	}

	
	/**
	 * Savoir si deux positions sont alignées
	 * @param position La position à tester
	 * @return Retourne vrai si les positions sont alignés
	 */
	public Sens estAligneAvec(Position position)
	{
			if (position.coordonnee_Y == this.coordonnee_Y)
			{
				if (position.coordonnee_X <= this.coordonnee_X) return Sens.GAUCHE;
				return Sens.DROITE;
			}
			if (position.coordonnee_X == this.coordonnee_X)
			{
				if (position.coordonnee_Y <= this.coordonnee_Y) return Sens.HAUT;
				return Sens.BAS;
			}
			return null;
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
		if (!(obj instanceof Position))
			return false;

		Position other = (Position) obj;
		return ((this.coordonnee_X == other.coordonnee_X) && (this.coordonnee_Y == other.coordonnee_Y));
	}
	
	/**
	 * Retourne la position voisine en fonction du sens
	 * @param sens Le sens définissant la case adjacente 
	 * @return Retourne la position voisine
	 */
	public Position obtenirVoisine(Sens sens)
	{
		return new Position(this.coordonnee_X+sens.obtenirDecalageX(), this.coordonnee_Y+sens.obtenirDecalageY());
		
	}
}
