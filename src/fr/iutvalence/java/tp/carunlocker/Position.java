package fr.iutvalence.java.tp.carunlocker;

/**
 * Ensemble de coordonnées définies sur deux dimensions
 * @author lissonit
 */
public class Position
{
	/**
	 * coordonnee x de la position
	 */
	private int x;

	/**
	 * coordonnee y de la position
	 */
	private int y;

	/**
	 * @param x
	 *            coordonnee x de la position
	 * @param y
	 *            coordonnee y de la position
	 */
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * @return la coordonnee en X
	 */
	public int obtenirX()
	{
		return this.x;
	}

	/**
	 * @return la coordonnee Y
	 */
	public int obtenirY()
	{
		return this.y;
	}
	
	/**
	 * Savoir si deux positions sont alignées
	 * @param position La position à tester
	 * @return Retourne le sens selon la position donnée
	 * cas par défaut : Retourne null
	 */
	public Sens estAligneAvec(Position position)
	{
			if (position.y == this.y)
			{
				if (position.x <= this.x) return Sens.GAUCHE;
				return Sens.DROITE;
			}
			if (position.x == this.x)
			{
				if (position.y <= this.y) return Sens.HAUT;
				return Sens.BAS;
			}
			return null;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.x;
		result = prime * result + this.y;
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
		return ((this.x == other.x) && (this.y == other.y));
	}
	
	/**
	 * Retourne la position voisine en fonction du sens
	 * @param sens Le sens définissant la case adjacente 
	 * @return Retourne la position voisine
	 */
	public Position obtenirVoisine(Sens sens)
	{
		return new Position(this.x + sens.obtenirDecalageX(), this.y + sens.obtenirDecalageY());
		
	}

	@Override
	public String toString()
	{
		return "Position [x=" + x + ", y=" + y + "]";
	}
	
}
