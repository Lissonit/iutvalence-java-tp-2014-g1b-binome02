package fr.iutvalence.java.tp.carunlocker;

/**
 * les directions possibles
 * @author lissonit
 */
public enum Direction
{
	/**
	 * la direction verticale
	 */
	VERTICAL(Sens.HAUT,Sens.BAS),
	/**
	 * la direction horizontale
	 */
	HORIZONTAL(Sens.GAUCHE,Sens.DROITE);
	
	/**
	 * Premier sens de la direction
	 */
	private Sens sensPrincipal;
	/**
	 * deuxième sens de la direction
	 */
	private Sens sensSecondaire;

	/**
	 * @param principal le sens principal de la direction
	 * @param secondaire le sens secondaire de la direction
	 */
	private Direction(Sens principal, Sens secondaire)
	{
		this.sensPrincipal = principal;
		this.sensSecondaire = secondaire;
	}
	
	/**
	 * @return Retourne le sens principal de la direction
	 */
	public Sens obtenirSensPrincipal()
	{
		return this.sensPrincipal;
	}
	
	/**
	 * @return Retourne le sens secondaire de la direction 
	 */
	public Sens obtenirSensSecondaire()
	{
		return this.sensSecondaire;
	}
	
}
	