package fr.iutvalence.java.tp.carunlocker;

//TODO écrire un commentaire
public class Plateau
{
	// TODO écrire un commentaire plus concis
	/**
	 * Entier représentant la largeur par défaut d'un plateau de jeu comportant les voitures
	 */
	private static final int LARGEUR_PLATEAU_DEFAULT = 6;
	
	// TODO écrire un commentaire plus concis
	/**
	 * Entier représentant la hauteur par défaut d'un plateau de jeu comportant les voitures
	 */
	private static final int HAUTEUR_PLATEAU_DEFAULT = 6;
	
	// TODO écrire un commentaire plus concis
	/**
	 * Entier représentant la largeur du plateau
	 */
	private final int LARGEUR_PLATEAU;

	// TODO écrire un commentaire plus concis
	/**
	 * Entier représentant la hauteur du plateau
	 */
	private final int HAUTEUR_PLATEAU;
	
	/**
	 * Création du nouveau plateau vide de largeur et de hauteur par défaut
	 */
	public Plateau()
	{
		// Initialisation de la taille du plateau crée
		this.LARGEUR_PLATEAU = LARGEUR_PLATEAU_DEFAULT;
		this.HAUTEUR_PLATEAU = HAUTEUR_PLATEAU_DEFAULT;
	}
}
