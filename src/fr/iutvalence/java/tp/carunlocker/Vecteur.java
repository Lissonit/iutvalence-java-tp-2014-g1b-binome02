package fr.iutvalence.java.tp.carunlocker;

public class Vecteur
{
	
	/**
	 * Entier correspondants aux coordonnées du vecteur
	 */
	private int X, Y;
	
	/**
	 * Retourne un nouveau vecteur nul
	 */
	public Vecteur()
	{
		this.X = 0;
		this.Y = 0;
	}
	
	/**
	 * Retourne un nouveau vecteur avec des coordonnées entrées
	 * @param X Position horizontale
	 * @param Y Position verticale
	 */
	public Vecteur(int X, int Y)
	{
		this.X = X;
		this.Y = Y;
	}
	
	// Faire getX et getY
}
