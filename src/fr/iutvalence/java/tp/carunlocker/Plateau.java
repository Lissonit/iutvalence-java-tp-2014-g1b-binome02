package fr.iutvalence.java.tp.carunlocker;


//TODO (fait) écrire un commentaire
/**
 * Correspond a un environnement de jeu
 * @author lissonit
 */
public class Plateau
{
	// TODO (fait) écrire un commentaire plus concis
	/**
	 * La largeur par défaut du plateau de jeu
	 */
	private static final int LARGEUR_PLATEAU_DEFAULT = 6;
	
	// TODO (fait) écrire un commentaire plus concis
	/**
	 * La hauteur par défaut du plateau
	 */
	private static final int HAUTEUR_PLATEAU_DEFAULT = 6;
	
	// TODO (fait) écrire un commentaire plus concis
	/**
	 * La largeur du plateau
	 */
	private final int LARGEUR_PLATEAU;

	// TODO (fait) écrire un commentaire plus concis
	/**
	 * La hauteur du plateau
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
